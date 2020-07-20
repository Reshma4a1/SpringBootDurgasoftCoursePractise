package com.durgasoft.vo;

public class Employee {
	
	private int id;
	private String name;
	
	//constructor
	public Employee(int id,String name)
	{
		super();
		this.id = id;
		this.name = name;
	}
	
	//Getter and setter methods
	public void setID(int id)
	{
		this.id = id;
	}
	
	public int getID()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	

}
