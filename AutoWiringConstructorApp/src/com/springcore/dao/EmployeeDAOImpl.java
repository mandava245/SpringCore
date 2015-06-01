package com.springcore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.springcore.bean.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private DataSource dataSource;
	public EmployeeDAOImpl(DataSource dataSource){
		this.dataSource=dataSource;
	}
	
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
				emp = new Employee(rSet.getInt("eid"),rSet.getString("ename"),rSet.getDouble("sal"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return emp;
	}

	}
