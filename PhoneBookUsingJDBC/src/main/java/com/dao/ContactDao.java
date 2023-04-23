package com.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.entity.Contact;
public class ContactDao {
	private Connection conn;
	
	public ContactDao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean saveContact(Contact c) {
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
	
	public boolean editContact(Contact c) {
		boolean f = false;
		try {
			PreparedStatement ps = conn.prepareStatement("update contact set name=?,phone=? where id=?");
			ps.setString(1, c.getName());
			ps.setString(2, c.getPhone());
			ps.setInt(3,c.getId());
			
			int i = ps.executeUpdate();
			if(i==1) {
				f = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}
	
	public boolean deleteContact(int id) {
		boolean f = false;
		try {
			PreparedStatement ps = conn.prepareStatement("delete from contact where id=?");
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			if(i==1) {
				f = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	public List<Contact> getAllContacts(){
		List<Contact> list = new ArrayList();
		
		Contact obj = null;
		
		try {
			PreparedStatement ps = conn.prepareStatement("select *from contact");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				obj = new Contact();
				obj.setId(rs.getInt(1));
				obj.setName(rs.getString(2));
				obj.setPhone(rs.getString(3));
				
				list.add(obj);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
}
