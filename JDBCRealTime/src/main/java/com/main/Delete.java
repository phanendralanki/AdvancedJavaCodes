package com.main;

import java.util.Scanner;

import com.bean.Student;
import com.connection.DBConnect;
import com.dao.StudentDao;

public class Delete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		
		Student st = new Student();
		st.setId(id);
		StudentDao dao = new StudentDao(DBConnect.getConnection());
		boolean f = dao.deleteData(id);
		
		if(f) {
			System.out.println("data deleted succesfully");
		}else {
			System.out.println("there is a problem to delete data");
		}
		
		sc.close();
	}
}
