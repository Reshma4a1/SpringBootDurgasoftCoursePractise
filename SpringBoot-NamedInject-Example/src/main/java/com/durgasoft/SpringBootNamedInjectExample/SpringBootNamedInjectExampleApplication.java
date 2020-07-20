package com.durgasoft.SpringBootNamedInjectExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.durgasoft.SpringBootNamedInjectExample.Service.CustomerService;

@SpringBootApplication
public class SpringBootNamedInjectExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootNamedInjectExampleApplication.class, args);
		CustomerService customerService = context.getBean(CustomerService.class);
		customerService.getCustomers();
	}

}
