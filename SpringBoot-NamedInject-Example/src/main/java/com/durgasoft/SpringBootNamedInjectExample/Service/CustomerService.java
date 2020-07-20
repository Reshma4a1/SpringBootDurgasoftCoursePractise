package com.durgasoft.SpringBootNamedInjectExample.Service;

import javax.inject.Inject;
import javax.inject.Named;
import com.durgasoft.SpringBootNamedInjectExample.DAO.CustomerDAO;

@Named
public class CustomerService {
	
	@Inject
	private CustomerDAO customerDAO;
	
	public CustomerService() {
		System.out.println("Customer Service Constructor....");
	}
	
	
	public void getCustomers() {
		System.out.println("Customer service get method is called...");
		customerDAO.setCustomerDAO();
	}
	
	

}
