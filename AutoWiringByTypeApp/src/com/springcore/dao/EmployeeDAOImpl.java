package com.springcore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.springcore.bean.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private DataSource dataSource;
	Connection con = null;
	Employee emp = null;

	@Override
	public Employee searchEmployee(int empId) {
		try {
			con = dataSource.getConnection();
			PreparedStatement pStatement = con
					.prepareStatement("select * from employee where eid=?");
			pStatement.setInt(1, empId);
			ResultSet rSet = pStatement.executeQuery();
			if (rSet.next()) {
				emp = new Employee();
				emp.setEmpId(rSet.getInt("eid"));
				emp.setEmpName(rSet.getString("ename"));
				emp.setSalary(rSet.getDouble("sal"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return emp;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
