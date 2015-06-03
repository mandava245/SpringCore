package com.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.springcore.dao.EmployeeDAO;

public class EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;

	public void empService() {
		employeeDAO.empDao();
		System.out.println("From empService()");
	}
}
