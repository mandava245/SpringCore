package com.springcore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.springcore.domain.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	Connection connection = null;
	Employee employee = null;

	public Employee getEmployeeDetails(int employeeId) {

		try {
			connection = dataSource.getConnection();
			String query = "select * from employees where eid in ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, employeeId);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				employee = new Employee();
				employee.setEmployeeId(resultSet.getInt("eid"));
				employee.setEmployeeName(resultSet.getString("ename"));
				employee.setSalary(resultSet.getDouble("sal"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employee;
	}

}
