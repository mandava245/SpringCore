package com.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcore.dao.EmployeeDAO;

@Component("empService") //If not mentioned any name it takes the default according to Naming Convention
public class EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;

	public void empService() {
		employeeDAO.empDao();
		System.out.println("From empService()");
	}
}
