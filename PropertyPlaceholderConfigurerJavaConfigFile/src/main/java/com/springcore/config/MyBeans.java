package com.springcore.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class MyBeans {
	
	@Value("${oracle.driverClassName}")
	private String driverClassName;
	
	@Value("${oracle.url}")
	private String url;
	
	@Value("${oracle.username}")
	private String username;
	
	@Value("${oracle.password}")
	private String password;
	
	@Bean(name="dataSource")
	public DataSource dataSource(){
			
		DriverManagerDataSource dmds = new DriverManagerDataSource();
			
			dmds.setDriverClassName(driverClassName);
			dmds.setUrl(url);
			dmds.setUsername(username);
			dmds.setPassword(password);
			
			return dmds;
	}
	
	@Bean
	public static PropertyPlaceholderConfigurer propertyPlaceholder(){
		
		PropertyPlaceholderConfigurer placeholderConfigurer = new PropertyPlaceholderConfigurer();
		Resource resource = new ClassPathResource("com/springcore/config/mysql.properties");
		placeholderConfigurer.setLocation(resource);
		
		return placeholderConfigurer;
	}
}
