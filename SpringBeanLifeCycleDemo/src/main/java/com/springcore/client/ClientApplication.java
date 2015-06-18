package com.springcore.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.bean.Student;

public class ClientApplication 
{
    public static void main( String[] args )
    {
    		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("com/springcore/config/myBeans.xml");
    		Student student = context.getBean("std",Student.class);
    		System.out.println(student);
    		context.close();//Also we can use context.destroy() to destroy the Bean Object
    		//context.destroy();
    }
}
