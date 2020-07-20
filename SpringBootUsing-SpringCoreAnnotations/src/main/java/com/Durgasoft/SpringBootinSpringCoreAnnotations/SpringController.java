package com.Durgasoft.SpringBootinSpringCoreAnnotations;


import org.springframework.stereotype.Component;


@Component
public class SpringController {
	
	public SpringController() {
		System.out.println("SpringController constructor ...........");
	}
	
	public void getData() {
		System.out.println("SpringController get data method is called....");
	}
	

}
