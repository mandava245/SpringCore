package com.springcore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

public class EmployeeDAOImpl implements EmployeeDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	Connection connection = null;
	String name = null;

	public String searchEmployeeName(int empNo) {
		try {
			connection = dataSource.getConnection();
			String sql = "select ENAME from EMPLOYEES where EID = ?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, empNo);
			ResultSet rSet = pstmt.executeQuery();
			if (rSet.next()) {
				name = rSet.getString("ename");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return name;
	}

}
