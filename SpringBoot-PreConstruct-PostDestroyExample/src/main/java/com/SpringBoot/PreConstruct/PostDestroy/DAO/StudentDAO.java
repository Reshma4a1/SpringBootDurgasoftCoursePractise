package com.SpringBoot.PreConstruct.PostDestroy.DAO;

import org.springframework.stereotype.Component;

@Component
public class StudentDAO {
	
	
	public StudentDAO() {
		System.out.println("Student DAO Constructor");
		
	}
	
	
	

}
