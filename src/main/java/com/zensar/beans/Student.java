package com.zensar.beans;

import java.util.Arrays;
import java.util.Properties;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Student implements InitializingBean, DisposableBean, BeanNameAware{
	
	private int studentID;
	
	private String studentName;
	
	private int studentAge;

	
	public Student() {
		super();
		System.out.println("In constructor");
	}



	public Student(int studentID, String studentName, int studentAge) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		System.out.println("In setter method");
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}



	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentAge="
				+ studentAge + "]";
	}



	public void destroy() throws Exception {
		System.out.println("In destroy method");
		
	}



	public void afterPropertiesSet() throws Exception {
		System.out.println("In init method, getting initialized");
		
	}



	public void setBeanName(String name) {
		System.out.println("Bean name is " +  name);
		
	}


	


	
		

}
