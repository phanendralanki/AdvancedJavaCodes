package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stuapp","root","user");
	
			PreparedStatement ps = conn.prepareStatement("insert into students(sname,mobile,age) values(?,?,?)");
			
			ps.setString(1,"valli");
			ps.setString(2, "9885925751");
			ps.setString(3,"22");
			int i = ps.executeUpdate();
			
			if(i==1) {
				System.out.println("success");
			}else {
				System.out.println("failed");
			}
			conn.close();
		}catch(Exception e) {
//			e.printStackTrace();
			System.out.println("error");
		}
	}
}
