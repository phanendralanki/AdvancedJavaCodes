package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBCreation {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "user";
		
		String sql = "create database if not exists facebook";
		
		try {
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pst = con.prepareStatement(sql);
			pst.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
