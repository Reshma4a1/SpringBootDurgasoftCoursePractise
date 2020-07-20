package com.Durgasoft.SpringBootUsingXmlSpringCore.Service;

import java.util.List;

import com.Durgasoft.SpringBootUsingXmlSpringCore.DAO.StudentDAO;
import com.Durgasoft.SpringBootUsingXmlSpringCore.VO.Student;

public class StudentService {
	
	private StudentDAO studentDAO;
	
	public StudentService() {
		System.out.println("StudentService Constructor");
	}
	
	public List<Student> getStudentslist(){
		
		System.out.println("Getting list of data in Service method.....");
		return studentDAO.findStudents();
		
	}
	
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

}
