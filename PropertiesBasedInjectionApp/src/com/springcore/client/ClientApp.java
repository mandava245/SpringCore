package com.springcore.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.springcore.bean.DataBaseProperties;

public class ClientApp {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/springcore/config/beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		DataBaseProperties dataBaseProperties = factory.getBean("dbPropertiesObj",DataBaseProperties.class);
		dataBaseProperties.displayInfo();
	}

}