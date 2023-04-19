package com.programs;
import java.sql.*;
class Update {
	public static void main(String[] args) {
		try {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stuapp","root","user");
		  String query = "update students set sname=?,mobile=?,age=? where id=?";
		  PreparedStatement pst = con.prepareStatement(query);
		  pst.setString(1, "vara");
		  pst.setString(2,"6281230122");
		  pst.setString(3, "40");
		  pst.setInt(4, 3);
		  int i = pst.executeUpdate();
		  if(i==1) {
			  System.out.println("updated successfully");
		  }else {
			  System.out.println("updation not possible");
		  }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
