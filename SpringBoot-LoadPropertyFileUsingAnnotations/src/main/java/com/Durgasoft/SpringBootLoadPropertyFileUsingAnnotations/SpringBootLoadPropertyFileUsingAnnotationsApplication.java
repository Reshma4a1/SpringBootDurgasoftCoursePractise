package com.Durgasoft.SpringBootLoadPropertyFileUsingAnnotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:db.properties")
public class SpringBootLoadPropertyFileUsingAnnotationsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootLoadPropertyFileUsingAnnotationsApplication.class, args);
		JdbcConnection jdbcConnection = context.getBean(JdbcConnection.class);
		jdbcConnection.getConnection();
	}

}
