package com.code;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
	static boolean f = false;
	public static boolean insertStudent(Student st) {
		try {
			//jdbc code
			Connection con = ConnectionProvider.createConnection();
			String q = "insert into students(sname,mobile,age) values(?,?,?)";
			//preparedStatement
			PreparedStatement pst = con.prepareStatement(q);
			pst.setString(1, st.getStudentName());
			pst.setString(2, st.getStudentMobile());
			pst.setString(3, st.getStudentAge());
			pst.executeUpdate();
			
			f = true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
