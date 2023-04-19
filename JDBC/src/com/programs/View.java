package com.programs;

import java.sql.*;

public class View {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stuapp","root","user");
			Statement st = con.createStatement();
			String query = "select *from students";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("sname");
				String mobile = rs.getString("mobile");
				String age = rs.getString("age");
				
				System.out.println("id: "+id);
				System.out.println("name: "+name);
				System.out.println("mobile: "+mobile);
				System.out.println("age: "+age);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
