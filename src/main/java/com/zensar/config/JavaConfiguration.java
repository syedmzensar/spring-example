package com.zensar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zensar.beans.Student;


@ComponentScan("com.zensar.beans")
@PropertySource(value = "data.properties")
@Configuration
public class JavaConfiguration {
	
	/*
	 * @Bean public Student student() { return new Student(1,"Syed", 20); }
	 * 
	 * @Bean public Student studentOne() { return new Student(2,"Rahul", 22); }
	 */

}
