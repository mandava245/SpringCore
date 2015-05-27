package com.springcore.service;

import java.util.List;

import com.springcore.dao.EmployeeDAO;
import com.springcore.domain.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO empDao;

	public void setEmpDao(EmployeeDAO empDao) {
		this.empDao = empDao;
	}

	@Override
	public Employee getEmployee(int empNo) {
		Employee emp = empDao.getEmployee(empNo);
		return emp;
	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> list = empDao.getEmployees();
		return list;
	}

}
