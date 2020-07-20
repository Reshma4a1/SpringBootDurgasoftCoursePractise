package com.Durgasoft.SpringBootUsingSpringAnnotationsandXML.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Durgasoft.SpringBootUsingSpringAnnotationsandXML.Service.StudentService;
import com.Durgasoft.SpringBootUsingSpringAnnotationsandXML.VO.Student;

@Controller
public class StudentController {

	@Autowired
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
