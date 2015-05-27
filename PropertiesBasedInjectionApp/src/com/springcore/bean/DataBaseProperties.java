package com.springcore.bean;

import java.util.Enumeration;
import java.util.Properties;

public class DataBaseProperties {
	private Properties dbProperties;

	public Properties getDbProperties() {
		return dbProperties;
	}

	public void setDbProperties(Properties dbProperties) {
		this.dbProperties = dbProperties;
	}

	public void displayInfo() {
		Enumeration<Object> enumeration = dbProperties.keys();
		while (enumeration.hasMoreElements()) {
			String id = (String) enumeration.nextElement();
			String value = dbProperties.getProperty(id);
			System.out.println(id + " = " + value);
		}
	}
}
