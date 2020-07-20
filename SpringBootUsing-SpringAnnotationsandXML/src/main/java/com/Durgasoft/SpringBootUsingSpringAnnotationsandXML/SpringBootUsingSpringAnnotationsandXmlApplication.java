package com.Durgasoft.SpringBootUsingSpringAnnotationsandXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Durgasoft.SpringBootUsingSpringAnnotationsandXML.Controller.StudentController;
import com.Durgasoft.SpringBootUsingSpringAnnotationsandXML.Hello.HelloService;
import com.Durgasoft.SpringBootUsingSpringAnnotationsandXML.VO.Student;

//@SpringBootApplication
public class SpringBootUsingSpringAnnotationsandXmlApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootUsingSpringAnnotationsandXmlApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		StudentController controller= context.getBean(StudentController.class);
		//controller.getAllStudent();
		
		HelloService hello = context.getBean(HelloService.class);
		System.out.println(hello.sayHello());
		
		for(Student student : controller.getAllStudent())
		{
			System.out.println(student);
		}
	}

}
