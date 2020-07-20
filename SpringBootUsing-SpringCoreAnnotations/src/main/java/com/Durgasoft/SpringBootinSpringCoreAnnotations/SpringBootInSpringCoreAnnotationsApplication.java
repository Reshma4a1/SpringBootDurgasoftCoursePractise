package com.Durgasoft.SpringBootinSpringCoreAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
@Configuration
@ComponentScan("com.Durgasoft.SpringBootinSpringCoreAnnotations")
public class SpringBootInSpringCoreAnnotationsApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(SpringBootInSpringCoreAnnotationsApplication.class, args);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringBootInSpringCoreAnnotationsApplication.class);
		SpringController controller = context.getBean(SpringController.class);
		controller.getData();
	}

}
