package com.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.bean.Student;
import com.connection.DBConnect;
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
			PreparedStatement ps = conn.prepareStatement("update students set sname=?,mobile=?,age=? where id=?");
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
	
	
	public boolean deleteData(int id) {
		boolean f = false;
			
		try {
			PreparedStatement ps = conn.prepareStatement("delete from students where id=?");
			StudentDao dao = new StudentDao(DBConnect.getConnection());
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			if(i>=1) {
				f = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		return f;
	}

	
	public Student viewData(int id) {
		Student st = null;
		
		try {
			PreparedStatement ps = conn.prepareStatement("select *from students where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				st = new Student();
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setMobile(rs.getString(3));
				st.setAge(rs.getString(4));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return st;
		
	}
	
	public List<Student> getAllData(){
		List<Student> list = new ArrayList();
		Student st = null;
		
		try {
			PreparedStatement ps = conn.prepareStatement("select *from students");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				st = new Student();
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setMobile(rs.getString(3));
				st.setAge(rs.getString(4));
				list.add(st);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
