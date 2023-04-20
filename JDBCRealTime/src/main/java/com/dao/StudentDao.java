package com.dao;

import java.sql.*;

import com.bean.Student;
//import com.connection.DBConnect;

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
			String query = "insert into students(id,sname,mobile,age) values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, st.getId());
			ps.setString(2, st.getName());
			ps.setString(3, st.getMobile());
			ps.setString(4, st.getAge());
			
			int i = ps.executeUpdate();
			
			if(i==1) {
				f = true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public boolean editStudent(Student st) {
		boolean f = false;
		
		try {
			PreparedStatement ps = conn.prepareStatement("update student set sname=?,mobile=?,age=? where id=?");
			ps.setString(1, st.getName());
			ps.setString(2, st.getMobile());
			ps.setString(3, st.getAge());
			ps.setInt(4, st.getId());
			
			int i = ps.executeUpdate();
			if(i==1) {
				f = true;
			}else {
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	

}
