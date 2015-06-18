package com.springcore.bean;

import java.io.File;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object beanObject, String beanName)
			throws BeansException {
		System.out.println("postProcessAfterInitialization() Method :: "+beanName);
		return beanObject;
	}

	public Object postProcessBeforeInitialization(Object beanObject, String beanName)
			throws BeansException {
		System.out.println("postProcessBeforeInitialization() Method :: "+ beanName);
		if(beanObject instanceof Cashier){
			Cashier cashier = (Cashier) beanObject;
			String directory= cashier.getFilePath();
			File file = new File(directory);
			boolean b = file.mkdirs();
			if(b){
				System.out.println("Directory is Created :: "+ directory);
			}
			else{
				System.out.println("Directory Already Exists...!!!");
			}
		}
		return beanObject;
	}

}