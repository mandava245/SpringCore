package com.springcore.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.bean.Student;

public class ClientApplication {
	public static void main(String[] args) {
		String configLocation = "com/springcore/config/myBeans.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(	configLocation);
		Student student1 = context.getBean("std", Student.class);
		student1.setStudentId(88);
		student1.setStudentName("Pavan Mandava");
		Student student2 = context.getBean("std",Student.class);
		System.out.println(student1.hashCode());
		System.out.println(student1);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println(student2.hashCode());
		System.out.println(student2);
	}
}
