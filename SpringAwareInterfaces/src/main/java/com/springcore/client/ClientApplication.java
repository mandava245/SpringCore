package com.springcore.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.bean.Employee;


public class ClientApplication 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config/myBeans.xml");
    	Employee employee1 = (Employee) context.getBean("employee1");
    	System.out.println(employee1);
    	Employee employee2 =  (Employee) context.getBean("employee2");
    	System.out.println(employee2);
    }
}
