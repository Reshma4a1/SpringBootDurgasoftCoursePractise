package com.durgasoft.SpringScopeExample.StudentDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.durgasoft.SpringScopeExample.JdbcConnection.JdbcConnection;

//Single ton only once object is created and default spring is singleton
//prototype create multiple objects 
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class StudentDAO {
	
	@Autowired
	private JdbcConnection JdbcConnection;
	
	public StudentDAO()
	{
		System.out.println("StudentDAO Constructor");
	}
	
	public String getStudentsData()
	{
		System.out.println("StudentsDAO Method is called");
		return "students100";
	}

	public JdbcConnection getJdbcConnection()
	{
		//System.out.println("JdbcConnection get method");
		
		return JdbcConnection;
	}
}
