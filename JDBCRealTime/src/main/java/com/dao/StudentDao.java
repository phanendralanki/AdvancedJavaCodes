package com.dao;

import java.sql.*;

import com.bean.Student;
import com.connection.DBConnect;

public class StudentDao {

	// connection checking
	/*
	 * public static void main(String[] args) { Connection conn =
	 * DBConnect.getConnection(); System.out.println(conn);
	 * 
	 * }
	 */
	
	public StudentDao(Connection conn) {
		super();
		this.conn = conn;
	}

	private Connection conn;
	
	public boolean dataInsert(Student st) {
		boolean f = false;
		try {
			String query = "insert into students(sname,mobile,age) values(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setString(1, st.getName());
			ps.setString(2, st.getMobile());
			ps.setString(3, st.getAge());
			
			int i = ps.executeUpdate();
			
			if(i==1) {
				f = true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	

}
