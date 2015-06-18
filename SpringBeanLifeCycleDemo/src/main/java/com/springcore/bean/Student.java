package com.springcore.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean {
	private int studentId;
	private String studentName;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("From setStudentId() Method");
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("From setStudentName() Method");
		this.studentName = studentName;
	}

	public void destroy() throws Exception {
		System.out.println("From destroy() Method");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("From afterPropertiesSet() Method");
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName="
				+ studentName + "]";
	}

}
