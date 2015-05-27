package com.springcore.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.details.Address;
import com.springcore.details.Student;

public class ClientApp {

	public static void main(String[] args) {
		String cfgFile = "com/springcore/cfg/beans.xml";
		ClassPathResource resource = new ClassPathResource(cfgFile);
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		Student student = (Student) factory.getBean("studentObj");
		Address address = student.getAddress();
		System.out.println("Student Details: \n");
		System.out.println("Student Id: "+student.getStudentId());
		System.out.println("Student Name: "+ student.getStudentName());
		System.out.println("City: "+ address.getCity());
		System.out.println("State: "+address.getState());
		System.out.println("Country: "+ address.getCountry());
	}

}
