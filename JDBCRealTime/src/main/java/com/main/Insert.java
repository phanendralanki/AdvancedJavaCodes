package com.main;
import com.bean.*;
import com.connection.DBConnect;
import com.dao.StudentDao;

import java.util.*;
public class Insert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter mobile");
		String mobile = sc.next();
		System.out.println("Enter age");
		String age = sc.next();
		
		//setting the data to beans
		Student st = new Student();
		st.setId(id);
		st.setName(name);
		st.setMobile(mobile);
		st.setAge(age);
		
		//getting the method from dao
		StudentDao dao = new StudentDao(DBConnect.getConnection());
		boolean f = dao.dataInsert(st);
		
		if(f) {
			System.out.println("data inserted successfully");
		}else {
			System.out.println("went wrong");
		}
		
		
		
	}
}
