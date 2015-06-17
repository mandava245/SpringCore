package com.springcore.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.config.BeansConfig;
import com.springcore.domain.Employee;
import com.springcore.service.EmployeeService;

public class ClientApplication 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
    	EmployeeService employeeService = context.getBean("employeeService",EmployeeService.class);
    	Employee employee = employeeService.getEmployeeDetails(88);
    	System.out.println(employee);
    }
}
