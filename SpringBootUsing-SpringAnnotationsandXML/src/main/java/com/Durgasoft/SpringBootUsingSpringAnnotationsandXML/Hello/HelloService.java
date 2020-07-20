package com.Durgasoft.SpringBootUsingSpringAnnotationsandXML.Hello;
/**
 * 
 * @author AG50530
 *
 */

public class HelloService {
	
	private String message;
	
	public String sayHello() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
