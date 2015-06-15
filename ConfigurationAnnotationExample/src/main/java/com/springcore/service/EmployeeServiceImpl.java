package com.springcore.service;

import com.springcore.dao.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO employeeDAO;

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public String searchEmployeeName(int empNo) {
		String name = employeeDAO.searchEmployeeName(empNo);
		return name;
	}

}
