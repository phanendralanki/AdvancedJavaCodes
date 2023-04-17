package com.code;

public class Student {
	private String studentId;
	private String studentName;
	private String studentMobile;
	private String studentAge;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}
	public String getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}
	public StudentClass(String studentId, String studentName, String studentMobile, String studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMobile = studentMobile;
		this.studentAge = studentAge;
	}
	public StudentClass(String studentName, String studentMobile, String studentAge) {
		super();
		this.studentName = studentName;
		this.studentMobile = studentMobile;
		this.studentAge = studentAge;
	}
	
	
}
