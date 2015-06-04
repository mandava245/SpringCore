package com.springcore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springcore.domain.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private DataSource dataSource;

	Connection connection = null;
	Employee employee = null;

	public Employee searchEmployee(int empNo) {
		try {
			connection = dataSource.getConnection();
			String sql = "select * from employee where empno=?";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setInt(1, empNo);
			ResultSet rSet = pst.executeQuery();
			if (rSet.next()) {
				employee = new Employee();
				employee.setEmpNo(rSet.getInt("empno"));
				employee.setEmpName(rSet.getString("empname"));
				employee.setSalary(rSet.getDouble("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employee;
	}

}
