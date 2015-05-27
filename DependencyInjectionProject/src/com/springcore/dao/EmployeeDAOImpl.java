package com.springcore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.springcore.domain.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public Employee getEmployee(int empNo) {
		Connection connection = null;
		Employee employee = null;
		try {
			connection = dataSource.getConnection();
			String sql = "SELECT *FROM employee WHERE empno=?";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setInt(1,empNo);
			ResultSet rSet = pst.executeQuery();
			if(rSet.next()){
				employee = new Employee();
				employee.setEmpNo(rSet.getInt("empno"));
				employee.setEmpName(rSet.getString("empname"));
				employee.setSalary(rSet.getDouble("salary"));
			}
		} catch (SQLException e) {
			System.out.println("Exception occured while Connecting to Database :: "+e.getMessage());
		}

		return employee;
	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		try {
			Connection connection = dataSource.getConnection();
			String sql = "SELECT *FROM employee";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				Employee emp = new Employee();
				emp.setEmpNo(rs.getInt("empno"));
				emp.setEmpName(rs.getString("empname"));
				emp.setSalary(rs.getDouble("salary"));
				list.add(emp);
			}
		} catch (SQLException e) {
			System.out.println("Error while Connecting to the DataBase :: "+ e.getMessage());
		}
		return list;
	}

}
