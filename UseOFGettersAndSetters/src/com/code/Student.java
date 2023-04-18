package com.code;

public class Student {
	private String name;
	private String rollNumber;
	
	public void display() {
		System.out.println(this.name);
		System.out.println(this.rollNumber);
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	//setter
	public void setName(String name) {
		this.name = name; //parameter name
	}
	
	public String getRollNumber() {
		return this.rollNumber;
	}
	//setter
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber; //parameter name
	}
}
