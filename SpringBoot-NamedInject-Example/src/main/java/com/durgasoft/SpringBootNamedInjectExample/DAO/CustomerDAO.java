package com.durgasoft.SpringBootNamedInjectExample.DAO;

import javax.inject.Named;

@Named
public class CustomerDAO {
	
	public CustomerDAO() {
		System.out.println("Customer DAO constructor");
	}
	
	public String setCustomerDAO() {
		
		System.out.println("CustomerDAO Set method is called");
		return "CustomerData";
		
	}

}
