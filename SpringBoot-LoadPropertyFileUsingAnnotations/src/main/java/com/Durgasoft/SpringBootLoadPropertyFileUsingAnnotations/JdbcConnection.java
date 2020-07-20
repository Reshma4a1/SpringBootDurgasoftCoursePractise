package com.Durgasoft.SpringBootLoadPropertyFileUsingAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {
	
	@Value("${driver.class.name}")
	private String driverClassName;
	@Value("${url}")
	private String url;
	@Value("${db.username}")
	private String userName;
	@Value("${password}")
	private String password;
	 
	public JdbcConnection() {
		 
	 }
	
	public void getConnection() {
		System.out.println("driverClassName : " + driverClassName);
		System.out.println("url : " + url);
		System.out.println("userName : " + userName);
		System.out.println("password : " + password);
	}

}
