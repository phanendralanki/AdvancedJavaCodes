package com.main;
import java.util.*;

import com.bean.Student;
import com.connection.DBConnect;
import com.dao.StudentDao;
public class Update {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student st = new Student();
		
		st.setId(1);
		st.setName("chandra pavan");
		st.setMobile("8008128131");
		st.setAge("25");
		
		StudentDao dao = new StudentDao(DBConnect.getConnection());
		
		boolean f = dao.editStudent(st);
		if(f) {
			System.out.println("student details updated");
		}else {
			System.out.println("sorry");
		}
		sc.close();
	}
}
