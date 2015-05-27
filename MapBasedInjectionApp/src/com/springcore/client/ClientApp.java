package com.springcore.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.springcore.bean.Question;

public class ClientApp {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/springcore/cfg/beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Question ques = factory.getBean("questionObj",Question.class);
		ques.displayInfo();		
	}

}
