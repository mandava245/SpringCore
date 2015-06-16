package com.springcore.client;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.config.MyBeans;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyBeans.class);
		DataSource dataSource = (DataSource) context.getBean("dataSource");

		try {
			Connection connection = dataSource.getConnection();
			DatabaseMetaData dbmd = connection.getMetaData();
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDatabaseProductVersion());
			System.out.println(dbmd.getDriverName());
			System.out.println(dbmd.getDriverVersion());
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
