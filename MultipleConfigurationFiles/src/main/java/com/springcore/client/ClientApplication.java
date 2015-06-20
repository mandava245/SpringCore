package com.springcore.client;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.bean.FirstBean;
import com.springcore.bean.SecondBean;
import com.springcore.bean.ThirdBean;

public class ClientApplication 
{
    public static void main( String[] args )
    {
    	String[] cfgFiles = new String[]{"com/springcore/config/firstbean.xml","com/springcore/config/secondbean.xml","com/springcore/config/thirdbean.xml"};
        ApplicationContext context = new ClassPathXmlApplicationContext(cfgFiles);
        
        System.out.println("Loading Beans From Multiple Configuration Files");
        
        FirstBean firstBean = context.getBean("firstBean",FirstBean.class);
        System.out.println(firstBean.getBeanName());
        
        SecondBean secondBean = context.getBean("secondBean",SecondBean.class);
        System.out.println(secondBean.getBeanName());
        
        ThirdBean thirdBean = context.getBean("thirdBean",ThirdBean.class);
        System.out.println(thirdBean.getBeanName());
        
    }
}
