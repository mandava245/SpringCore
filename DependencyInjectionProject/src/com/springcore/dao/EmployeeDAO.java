package com.springcore.dao;

import java.util.List;

import com.springcore.domain.Employee;

public interface EmployeeDAO {
	public Employee getEmployee(int empNo);
	public List<Employee> getEmployees();
}
