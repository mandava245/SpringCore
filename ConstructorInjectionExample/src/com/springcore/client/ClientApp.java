package com.springcore.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.bean.Student;

public class ClientApp {

	public static void main(String[] args) {
		String cfgFile = "com/springcore/xml/myBeans.xml";
		ClassPathResource resource = new ClassPathResource(cfgFile);
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		Student student = (Student) factory.getBean("studentObj");
		System.out.println("Student Details: \n");
		System.out.println("Student Id: " + student.getStudentId());
		System.out.println("Student Name: " + student.getStudentName());
	}

}
