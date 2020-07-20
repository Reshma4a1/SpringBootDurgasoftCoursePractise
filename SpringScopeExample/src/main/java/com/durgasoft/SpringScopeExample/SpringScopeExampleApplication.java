package com.durgasoft.SpringScopeExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.durgasoft.SpringScopeExample.StudentDAO.StudentDAO;

@SpringBootApplication
public class SpringScopeExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringScopeExampleApplication.class, args);
		StudentDAO studentDAO = context.getBean(StudentDAO.class);
		System.out.println("StudentDAO : " + studentDAO);
		System.out.println("JDBC Connection : "+studentDAO.getJdbcConnection());
		
		
		StudentDAO studentDAO1 = context.getBean(StudentDAO.class);
		System.out.println("studentDAO1 : " + studentDAO1);
		System.out.println("JDBC Connection1 : "+studentDAO1.getJdbcConnection());
		
		
		StudentDAO studentDAO2 = context.getBean(StudentDAO.class);
		System.out.println("StudentDAO2 : " + studentDAO2);
		System.out.println("JDBC Connection2 : "+studentDAO2.getJdbcConnection());
	}

}
