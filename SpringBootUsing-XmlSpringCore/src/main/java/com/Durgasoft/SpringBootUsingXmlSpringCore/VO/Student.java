package com.Durgasoft.SpringBootUsingXmlSpringCore.VO;

public class Student {

	private int Id;
	private String name;
	private String email;

	public Student(int Id, String name, String email) {
		super();
		this.Id = Id;
		this.name = name;
		this.email = email;

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		
		return "Student[Id =" + Id + ",name = "+name + " ,email = " +email +"]";
		
	}

}
