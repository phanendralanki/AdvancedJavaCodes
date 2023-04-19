package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnection {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stuapp","root","user");
			System.out.println(conn);
		}catch(Exception e) {
			e.printStackTrace();
			//System.out.println("error");
		}
	}
}
