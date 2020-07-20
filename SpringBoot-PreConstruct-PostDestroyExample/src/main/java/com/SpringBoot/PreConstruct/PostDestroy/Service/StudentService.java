package com.SpringBoot.PreConstruct.PostDestroy.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringBoot.PreConstruct.PostDestroy.DAO.StudentDAO;

@Component
public class StudentService {
	
	
	private StudentDAO studentDAO;
	
	

	public StudentService() {
		System.out.println("StudentService constructor");
	}
	
	public String getStudentService2() {
		System.out.println("StudentService get method is called");
		return "students";
	}
	
	
	@PostConstruct
	public String getStudentService() {
		System.out.println("StudentService get method post construct is called");
		return "students";
	}
	
	@PreDestroy
	public void SetDestroy( )
	{
		System.out.println("StudentService Destroy method is called");
		
	}

	@Autowired
	public void setStudentDAO(StudentDAO studentDAO) {
		System.out.println("StudentDAO set method is called");
		this.studentDAO = studentDAO;
	}
	
	
}
