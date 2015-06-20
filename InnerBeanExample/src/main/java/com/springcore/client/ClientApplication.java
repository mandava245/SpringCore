package com.springcore.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.bean.FishBean;
import com.springcore.bean.WaterBean;

public class ClientApplication
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config/myBeans.xml");
    	WaterBean waterBean = context.getBean("waterBean",WaterBean.class);
    	FishBean fishBean = waterBean.getFishBean();
    	System.out.println("Fish Bean Name : "+fishBean.getFishName());
    	
    }
}
