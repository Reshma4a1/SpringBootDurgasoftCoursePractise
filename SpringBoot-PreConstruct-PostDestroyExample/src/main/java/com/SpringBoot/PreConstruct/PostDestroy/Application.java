package com.SpringBoot.PreConstruct.PostDestroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringBoot.PreConstruct.PostDestroy.DAO.StudentDAO;
import com.SpringBoot.PreConstruct.PostDestroy.Service.StudentService;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(Application.class, args);
		StudentService studentService = context.getBean(StudentService.class);
		
		System.out.println(studentService);
		System.out.println(studentService.getStudentService2());
		
		studentService.SetDestroy();

		
		
		
	}

}
