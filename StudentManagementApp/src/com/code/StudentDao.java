package com.code;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	
	public static boolean insertStudent(Student st) {
		boolean f = false;
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
	
	public static boolean deleteStudent(int id) {
		boolean f = false;
		try {
			Connection con = ConnectionProvider.createConnection();
			String query = "delete from students where id=?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1,id);
			pst.executeUpdate();
			f = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void showAllStudents() {
		
		try {
			Connection con = ConnectionProvider.createConnection();
			String query = "select *from students";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String mobile = rs.getString(3);
				String age = rs.getString(4);
				
				System.out.println("*********************");
				System.out.println("\tStudent Details");
				System.out.println("Id: "+id);
				System.out.println("name: "+name);
				System.out.println("mobile: "+mobile);
				System.out.println("age: "+age);
				System.out.println("*********************");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
		public static void showStudent(int id) {
			
			try {
				Connection con = ConnectionProvider.createConnection();
				String query = "select *from students where id =? ";
				PreparedStatement pst = con.prepareStatement(query);
				ResultSet rs = pst.executeQuery(query);
				while(rs.next()) {
					
					String name = rs.getString(2);
					String mobile = rs.getString(3);
					String age = rs.getString(4);
					
					System.out.println("*********************");
					System.out.println("\tStudent Details");
					
					System.out.println("name: "+name);
					System.out.println("mobile: "+mobile);
					System.out.println("age: "+age);
					System.out.println("*********************");
				}
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
}
