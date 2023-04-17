package com.code;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	static Connection con;
	public void createConnection() {
		try {
		//load the driver
		Class.forName("com.mysql.jdbc.Driver");
		//create the connection
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stuapp","root","user");
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
