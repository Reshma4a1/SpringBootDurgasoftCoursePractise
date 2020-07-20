package com.Durgasoft.SpringBootUsingXmlSpringCore.Controller;

import java.util.List;

import com.Durgasoft.SpringBootUsingXmlSpringCore.Service.StudentService;
import com.Durgasoft.SpringBootUsingXmlSpringCore.VO.Student;

public class StudentController {
	
	private StudentService studentService;
	
	public StudentController() {
		System.out.println("StudentController constructor");
	}
	
	public List<Student> getAllStudent() {
		System.out.println("SpringController get data method is called....");
		return studentService.getStudentslist();
	}
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	

}
