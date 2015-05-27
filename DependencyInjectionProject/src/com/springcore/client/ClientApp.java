package com.springcore.client;

import java.util.List;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.domain.Employee;
import com.springcore.service.EmployeeService;

public class ClientApp {

	public static void main(String[] args) {
		String cfgFile = "com/springcore/xml/beans.xml";
		ClassPathResource resource = new ClassPathResource(cfgFile);
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		EmployeeService empService = (EmployeeService)factory.getBean("empServiceObj") ;
		
		/*Employee semp=empService.getEmployee(88);
		if(semp!=null){
			System.out.println(semp.getEmpNo());
			System.out.println(semp.getEmpName());
			System.out.println(semp.getSalary());
		}
		else{
		System.out.println("Employee Not Found ");
		}*/
		
		List<Employee> list = empService.getEmployees();
		System.out.println("Employees Details:  \n");
		for(Employee emp : list){
			System.out.println(emp.getEmpNo());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println("-----------------");
		}
		
	}

}
