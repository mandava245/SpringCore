package com.springcore.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.bean.Employee;
import com.springcore.service.EmployeeService;

public class ClientApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config/myBeans.xml");
		EmployeeService empService = (EmployeeService) context.getBean("employeeService");
		Employee emp= empService.searchEmployee(101);
		System.out.println("Employee Details:");
		System.out.println(emp);
	}

}
