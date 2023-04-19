package com.main;
import com.bean.*;
import com.connection.DBConnect;
import com.dao.StudentDao;
public class Insert {
	public static void main(String[] args) {
		
		Student st = new Student();
		st.setId(1);
		st.setName("phanendra");
		st.setMobile("7013634111");
		st.setAge("21");
		
		StudentDao dao = new StudentDao(DBConnect.getConnection());
		boolean f = dao.dataInsert(st);
		
		if(f) {
			System.out.println("data inserted successfully");
		}else {
			System.out.println("went wrong");
		}
		
		
		
	}
}
