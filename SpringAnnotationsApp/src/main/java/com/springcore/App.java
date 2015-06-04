package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.domain.Employee;
import com.springcore.service.EmployeeService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config/beans.xml");
        EmployeeService empService = context.getBean("empService", EmployeeService.class);
        Employee emp = empService.searchEmployee(88);
        System.out.println(emp);
    }
}
