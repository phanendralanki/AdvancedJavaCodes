package com.programs;

import java.sql.*;

public class Delete {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stuapp","root","user");
			
			String query = "delete from students where id=?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1,3);
			int f = pst.executeUpdate();
			if(f==1) {
				System.out.println("data deleted");
			}else {
				System.out.println("not possible");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
