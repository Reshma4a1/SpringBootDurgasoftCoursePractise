package com.durgasoft.SpringBootBeanAnnotationExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class SpringBootBeanAnnotationExampleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootBeanAnnotationExampleApplication.class, args);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.durgasoft.SpringBootBeanAnnotationExample");
		context.refresh();
		
		Employee employee = context.getBean(Employee.class);
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
	}

}
