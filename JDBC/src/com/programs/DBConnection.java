package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnection {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stuapp","root","user");
			//System.out.println(conn);
			
			PreparedStatement ps = conn.prepareStatement("insert into students(sname,mobile,age) values(?,?,?)");
			
			ps.setString(1,"sanjay");
			ps.setString(2, "8121211550");
			ps.setString(3,"12");
			int i = ps.executeUpdate();
			
			if(i==1) {
				System.out.println("success");
			}else {
				System.out.println("failed");
			}
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
