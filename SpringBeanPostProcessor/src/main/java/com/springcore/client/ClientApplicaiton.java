package com.springcore.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.bean.Cashier;
import com.springcore.bean.ShoppingCart;

public class ClientApplicaiton 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config/myBeans.xml");
    	Cashier cashier = context.getBean("cashierBean",Cashier.class);
    	ShoppingCart cart = context.getBean("shoppingCart",ShoppingCart.class);
    	cashier.calculateTotalPrice(cart);
    	context.close();
    }	
}
