package com.springcore.service;

import com.springcore.bean.Employee;
import com.springcore.dao.EmployeeDAO;
import com.springcore.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO employeeDAO;
	
	@Override
	public Employee searchEmployee(int empId) {
		Employee emp = employeeDAO.searchEmployee(empId);
		return emp;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO1) {
		this.employeeDAO = employeeDAO1;
	}
	
}
