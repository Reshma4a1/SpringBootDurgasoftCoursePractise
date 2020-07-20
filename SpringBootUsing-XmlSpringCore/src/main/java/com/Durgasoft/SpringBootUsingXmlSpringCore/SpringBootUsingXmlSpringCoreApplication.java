package com.Durgasoft.SpringBootUsingXmlSpringCore;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Durgasoft.SpringBootUsingXmlSpringCore.Controller.StudentController;
import com.Durgasoft.SpringBootUsingXmlSpringCore.VO.Student;


public class SpringBootUsingXmlSpringCoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootUsingXmlSpringCoreApplication.class, args);
		
		//without using XML
		//ApplicationContext context = new AnnotationConfigApplicationContext(SpringBootInSpringCoreAnnotationsApplication.class)
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		StudentController studentController = context.getBean(StudentController.class);
	    List<Student>	students = studentController.getAllStudent();
		
		for(Student student : students)
		{
			System.out.println(student);
		}
	}

}
