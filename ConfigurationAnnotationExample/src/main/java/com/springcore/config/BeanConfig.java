package com.springcore.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springcore.dao.EmployeeDAO;
import com.springcore.dao.EmployeeDAOImpl;
import com.springcore.service.EmployeeService;
import com.springcore.service.EmployeeServiceImpl;

@Configuration
public class BeanConfig {
	@Value("oracle.jdbc.driver.OracleDriver")
	private String driverClassName;
	@Value("jdbc:oracle:thin:@localhost:1521:pavan")
	private String url;
	@Value("springcore")
	private String username;
	@Value("springcore")
	private String password;

	@Bean(name = "dataSource", autowire = Autowire.BY_TYPE)
	public DataSource dataSource() {

		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName(driverClassName);
		dmds.setUrl(url);
		dmds.setUsername(username);
		dmds.setPassword(password);

		return dmds;
	}

	@Bean(name = "employeeDAO", autowire = Autowire.BY_TYPE)
	public EmployeeDAO employeeDAO() {

		return new EmployeeDAOImpl();

	}

	@Bean(name = "empService", autowire = Autowire.BY_TYPE)
	public EmployeeService employeeService() {

		return new EmployeeServiceImpl();

	}
}
