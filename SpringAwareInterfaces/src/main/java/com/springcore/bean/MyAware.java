package com.springcore.bean;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyAware implements BeanNameAware,ApplicationContextAware {

	public void setApplicationContext(ApplicationContext contxt)
			throws BeansException {
		System.out.println("setApplicationContext() is Executed");
		System.out.println("setApplicationContext() :: Bean Definition Names : "+ Arrays.toString(contxt.getBeanDefinitionNames()));
	}

	public void setBeanName(String beanName) {
		System.out.println("setBeanName() is Executed");
		System.out.println("setBeanName() :: Bean Name Defined in the context : "+ beanName);
	}

}
