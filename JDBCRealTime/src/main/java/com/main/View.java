package com.main;

import java.util.List;

import com.bean.Student;
import com.connection.DBConnect;
import com.dao.StudentDao;

public class View {
	public static void main(String[] args) {
		
		/*
		StudentDao dao = new StudentDao(DBConnect.getConnection());
		Student st = dao.viewData(4);
		
		if(st==null) {
			System.out.println("user not available");
		}
		else {
		System.out.println("Name= "+st.getName());
		System.out.println("Mobile= "+st.getMobile());
		System.out.println("age= "+st.getAge());
		}
		
		*/
		
		//To get all data
		StudentDao dao = new StudentDao(DBConnect.getConnection());
		List<Student> list = dao.getAllData();
		for(Student s:list) {
			System.out.println("Name= "+s.getName());
			System.out.println("Mobile= "+s.getMobile());
			System.out.println("Age= "+s.getAge());
			System.out.println("------------");
		}
		
	}
}
