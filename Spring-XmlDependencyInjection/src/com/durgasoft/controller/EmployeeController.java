package com.durgasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.durgasoft.service.EmployeeService;
import com.durgasoft.vo.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService ;
	//EmployeeService employeeService = new EmployeeService();

	public List<Employee> getEmployee() {
		System.out.println("Begin : EmployeeController to get employees");

		List<Employee> employeeList = employeeService.getAllEmployees();
		
		System.out.println("End : EmployeeController to get employees");

		return employeeList;

	}
	
	
	//injection through setter methods
	public void setEmployeeService(EmployeeService employeeService)
	{
		this.employeeService = employeeService;
	}
}
