package com.springcore.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.bean.Student;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config/beans.xml");
		Student std = (Student) context.getBean("studentObj");
		System.out.println("Student Details : ");
		System.out.println("Student Id : "+std.getSid());
		System.out.println("Student Name : "+std.getSname());
		System.out.println("Student CGPA : "+std.getCgpa());
	}

}
