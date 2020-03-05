package com.acc;

public class Employee {

	private String name;
	private String dept;
	
	public Employee(String name, String dept){
		this.name = name;
		this.dept = dept;
	}
	

	public void show() {
		System.out.println("Employee Name: " + name + " Employee Department: " + dept);
	}
	
	

}
