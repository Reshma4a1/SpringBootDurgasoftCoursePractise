package com.Durgasoft.SpringBootUsingXmlSpringCore.DAO;

import java.util.ArrayList;
import java.util.List;
import com.Durgasoft.SpringBootUsingXmlSpringCore.VO.Student;

public class StudentDAO {

	public StudentDAO() {
		System.out.println("Student DAO Constructor");
	}

	public List<Student> findStudents() {
		System.out.println("List of students in DAO method......");
		Student student = new Student (100,"Reshma","Reshma@786.com");
		Student student1 = new Student (101,"Arif","Arif@786.com");
		Student student2 = new Student (102,"Afroz","Afroz@786.com");
		
		List<Student> studentlist = new ArrayList<Student>();
		studentlist.add(student);
		studentlist.add(student1);
		studentlist.add(student2);

		return studentlist;
	}
	
}
