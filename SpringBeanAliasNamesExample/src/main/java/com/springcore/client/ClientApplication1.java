package com.springcore.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.bean.Student;

public class ClientApplication1
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config/myBeans.xml");
    	
    	Student student1 = context.getBean("std",Student.class);
    	
    	System.out.println(student1.getStudentId());
    	System.out.println(student1.getStudentName());
    	
    	System.out.println("----------------------");

    	Student student2 = context.getBean("std2",Student.class);
        
    	System.out.println(student2.getStudentId());
    	System.out.println(student2.getStudentName());

    	System.out.println("----------------------");

    	Student student3 = context.getBean("std2",Student.class);
        
    	System.out.println(student3.getStudentId());
    	System.out.println(student3.getStudentName());

    }
}
