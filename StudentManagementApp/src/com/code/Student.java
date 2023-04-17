package com.code;

public class Student {
	private int studentId;
	private String studentName;
	private String studentMobile;
	private String studentAge;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
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
	public Student(int studentId, String studentName, String studentMobile, String studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMobile = studentMobile;
		this.studentAge = studentAge;
	}
	public Student(String studentName, String studentMobile, String studentAge) {
		super();
		this.studentName = studentName;
		this.studentMobile = studentMobile;
		this.studentAge = studentAge;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMobile=" + studentMobile
				+ ", studentAge=" + studentAge + "]";
	}
	
	
}
