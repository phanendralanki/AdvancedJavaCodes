package com.dao;

import com.bean.Contact;
import com.connection.DBConnect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class ContactDao {
	
	/* DATABASE OPERATIONS 
	 * - insert(name,phone)
	 * - update(id) -> name,phone
	 * - delete (id)
	 * - view(all)
	 * */
	
	private Connection conn;
	
	public ContactDao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	//insert 
	public boolean insertData(Contact c) {
		boolean f = false;
		
		try {
			
			PreparedStatement ps = conn.prepareStatement("insert into contact(name,phone) values(?,?)");
			ps.setString(1, c.getName());
			ps.setString(2, c.getPhone());
			
			int i = ps.executeUpdate();
			
			if(i==1) {
				f = true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	//update
	public boolean updateData(Contact c) {
		boolean f = false;
		
		try {
			PreparedStatement ps = conn.prepareStatement("update contact set name=?,phone=? where id=?");
			ps.setString(1, c.getName());
			ps.setString(2, c.getPhone());
			ps.setInt(3, c.getId());
			
			int i = ps.executeUpdate();
			if(i==1) {
				f = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	//delete
	public boolean deleteData(Contact c) {
		boolean f = false;
		
		try {
			PreparedStatement ps = conn.prepareStatement("delete from contact where id=?");
			ps.setInt(1, c.getId());
			int i = ps.executeUpdate();
			
			if(i==1) {
				f = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
		
	}
	
	//view
	public List<Contact> viewData(Contact c) {
		
		List<Contact>list = new ArrayList();
		Contact contact = null;
		try {
			PreparedStatement ps = conn.prepareStatement("select *from contact");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				contact = new Contact();
				contact.setId(rs.getInt(1));
				contact.setName(rs.getString(2));
				contact.setPhone(rs.getString(3));
				list.add(contact);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
}
