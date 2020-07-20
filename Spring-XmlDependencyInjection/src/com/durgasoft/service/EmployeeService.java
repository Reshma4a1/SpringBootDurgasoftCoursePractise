package com.durgasoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.durgasoft.dao.EmployeeDAO;
import com.durgasoft.vo.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO employeedao ;
	//Instead of creating the object here will be creating bean in XML file
	//EmployeeDAO employeedao = new EmployeeDAO();
	
	public List<Employee> getAllEmployees(){
		System.out.println("Begin : EmployeeService to get the all employees");
		
		List<Employee> allEmployee = employeedao.findAllEmployees();
		System.out.println("End : EmployeeService to get the all employees");
		
		return allEmployee;
		
	}
	public void setEmployeedao(EmployeeDAO employeedao) {
		this.employeedao = employeedao;
	}


}
