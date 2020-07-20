package com.durgasoft.frontend;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.controller.EmployeeController;
import com.durgasoft.vo.Employee;

public class Client {

	public static void main(String[] args) {
		/*
		 * EmployeeController employeeController = new EmployeeController();
		 * 
		 * List<Employee> list = employeeController.getEmployee(); for (Employee
		 * employee :list) { System.out.println(employee.getID());
		 * System.out.println(employee.getName()); }
		 */

		// Code to execute through XML file
		ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
		EmployeeController employeeController= context.getBean(EmployeeController.class);
		
		List<Employee> list = employeeController.getEmployee();
		for(Employee employee : list) 
		{
			System.out.println(employee.getID());
			System.out.println(employee.getName());
			
		}
			

	}
}
