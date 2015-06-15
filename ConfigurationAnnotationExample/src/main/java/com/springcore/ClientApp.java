package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.config.BeanConfig;
import com.springcore.service.EmployeeService;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		EmployeeService eservice = context.getBean("empService",EmployeeService.class);
		String name = eservice.searchEmployeeName(88);
		System.out.println("Employee Name: " + name);
	}

}
