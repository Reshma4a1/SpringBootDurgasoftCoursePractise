package com.durgasoft.SpringBootBeanAnnotationExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyApplicationConfiguration {
	
	@Bean
	public Employee getEmployee() {
		return new Employee(9,"reshma");
		
	}

}
