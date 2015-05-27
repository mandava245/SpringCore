package com.springcore.service;

import java.util.List;

import com.springcore.domain.Employee;

public interface EmployeeService {
	public Employee getEmployee(int empNo);
	public List<Employee> getEmployees();
}
