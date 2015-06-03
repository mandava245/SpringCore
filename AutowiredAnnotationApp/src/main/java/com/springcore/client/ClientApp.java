package com.springcore.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.service.EmployeeService;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config/beans.xml");
		EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
		employeeService.empService();
	}

}
