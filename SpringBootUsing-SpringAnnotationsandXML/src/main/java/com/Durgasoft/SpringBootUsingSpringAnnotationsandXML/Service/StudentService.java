package com.Durgasoft.SpringBootUsingSpringAnnotationsandXML.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Durgasoft.SpringBootUsingSpringAnnotationsandXML.DAO.StudentDAO;
import com.Durgasoft.SpringBootUsingSpringAnnotationsandXML.VO.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;

	public StudentService() {
		System.out.println("StudentService Constructor");
	}

	public List<Student> getStudentslist() {

		System.out.println("Getting list of data in Service method.....");
		return studentDAO.findStudents();

	}

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

}
