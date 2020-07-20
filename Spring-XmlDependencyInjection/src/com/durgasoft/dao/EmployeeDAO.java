package com.durgasoft.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.durgasoft.vo.Employee;


@Repository
public class EmployeeDAO {
	
	public EmployeeDAO() {
		System.out.println("Employee DAO Constructor");
	}

	// DAO is mainly used to get the data from the database

	public List<Employee> findAllEmployees() {

		System.out.println("Begin : EmployeeDAO to find the employees");

		Employee employee1 = new Employee(100, "Reshma");
		Employee employee2 = new Employee(101, "Arif");
		Employee employee3 = new Employee(102, "Afroz");
		
		List<Employee> employeelist = new ArrayList<Employee>();
		employeelist.add(employee1);
		employeelist.add(employee2);
		employeelist.add(employee3);
		System.out.println("End : EmployeeDAO to find the employees");
		return employeelist;

	}

}
