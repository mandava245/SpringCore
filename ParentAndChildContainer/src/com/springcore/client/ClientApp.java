package com.springcore.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.springcore.bean.ServiceBean;

public class ClientApp {

	public static void main(String[] args) {
		Resource parentResource = new ClassPathResource("com/springcore/config/dao-bean.xml");
		BeanFactory parentFactory = new XmlBeanFactory(parentResource);
		Resource childResource = new ClassPathResource("com/springcore/config/service-bean.xml");
		BeanFactory childFactory = new XmlBeanFactory(childResource, parentFactory);
		ServiceBean serviceBean = childFactory.getBean("serviceObj", ServiceBean.class);
		serviceBean.serviceMethod();
	}

}
