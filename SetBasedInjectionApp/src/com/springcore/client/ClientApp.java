package com.springcore.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.springcore.bean.Cashier;
import com.springcore.bean.ShoppingCart;

public class ClientApp {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/springcore/config/beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		ShoppingCart cart = factory.getBean("shoppingCart",ShoppingCart.class);
		Cashier cashier = factory.getBean("cashier",Cashier.class);
		cashier.findTotalPrice(cart);
	}

}
