package com.springcore.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication2
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config/myBeans.xml");
    	
    	String[] beans = context.getAliases("std1");
    	for (String string : beans) {
			System.out.println(string);
		}
    }
}
