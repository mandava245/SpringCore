package com.springcore.service;

import com.springcore.dao.EmployeeDAO;
import com.springcore.domain.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;
	
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public Employee getEmployeeDetails(int employeeId) {

		Employee employee = employeeDAO.getEmployeeDetails(employeeId);

		return employee;
	}

}
