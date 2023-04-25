package com.connection;

import java.sql.*;
public class DBConnect {
	public static Connection conn;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/phonebook","root","user");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
