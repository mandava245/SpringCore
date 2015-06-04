package com.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcore.dao.EmployeeDAO;
import com.springcore.domain.Employee;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;

	public Employee searchEmployee(int empNo) {
		Employee emp = employeeDAO.searchEmployee(empNo);
		return emp;
	}

}
