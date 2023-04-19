package com.programs;

import java.sql.*;
import java.util.*;

public class JDBCCrud {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stuapp", "root", "user");
			System.out.println("Enter operation");
			System.out.println("1.insert");
			System.out.println("2.update");
			System.out.println("3.delete");
			System.out.println("4.view");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			String query, name, mobile, age;
			int id;
			switch (choice) {
			case 1:
				System.out.println("Enter name: ");
				name = sc.next();
				System.out.println("Enter mobile: ");
				mobile = sc.next();
				System.out.println("Enter age: ");
				age = sc.next();

				query = "insert into students(sname,mobile,age) values(?,?,?)";
				PreparedStatement ps = con.prepareStatement(query);
				query = "insert into students";
				ps.setString(1, name);
				ps.setString(2, mobile);
				ps.setString(3, age);

				int i = ps.executeUpdate();
				if (i == 1) {
					System.out.println("Data inserted succesfully");
				} else {
					System.out.println("Data not inserted");
				}
				break;
			case 2:
				// update
				System.out.println("Enter student id: ");
				id = sc.nextInt();
				System.out.println("Enter student name: ");
				name = sc.next();
				System.out.println("Enter student mobile: ");
				mobile = sc.next();
				System.out.println("Enter student age: ");
				age = sc.next();
				
				query = "update students set sname=?,mobile=?,age=? where id=?";
				ps = con.prepareStatement(query);
				ps.setString(1, name);
				ps.setString(2,mobile);
				ps.setString(3, age);
				ps.setInt(4, id);
				
				
				i = ps.executeUpdate();
				if (i == 1) {
					System.out.println("updated successfully");
				} else {
					System.out.println("updation not possible");
				}
				break;
			case 3:
				//delete
				System.out.println("Enter id: ");
				id = sc.nextInt();
				query = "delete from students where id=?";
				ps = con.prepareStatement(query);
				ps.setInt(1, id);
				i = ps.executeUpdate();
				if (i == 1) {
					System.out.println("student deleted");
				} else {
					System.out.println("not deleted");
				}
				break;
			case 4:
				//view
				query = "select *from students";
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query);
				while(rs.next()) {
					System.out.println("name: "+rs.getString(2));
					System.out.println("mobile: "+rs.getString(3));
					System.out.println("age: "+rs.getString(4));
				}
				break;
			}
			
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
