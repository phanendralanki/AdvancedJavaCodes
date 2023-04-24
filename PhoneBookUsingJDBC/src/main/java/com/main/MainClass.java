package com.main;

import com.conn.DBConnect;
import com.dao.ContactDao;
import com.entity.Contact;


import java.util.List;
import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) {
		
		//Connection conn = DBConnect.getConnection();
		//System.out.println(conn);
		
		boolean f = true;
		while(f) {
			System.out.println("---------------");
			System.out.println("1.Save contact");
			System.out.println("2.update contact");
			System.out.println("3.Delete contact");
			System.out.println("4.view contacts");
			System.out.println("---------------");
		
		
		String name,mobile;
		Contact c = new Contact();
		ContactDao cd = new ContactDao(DBConnect.getConnection());
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
		
			case 1:
				System.out.println("Enter name ");
				name = sc.next();
				System.out.println("Enter phone: ");
				mobile = sc.next();
				
				c.setName(name);
				c.setPhone(mobile);
				
				
				boolean ex = cd.saveContact(c);
				
				if(ex) {
					System.out.println("success");
				}else {
					System.out.println("Failed");
				}
				break;
				
			case 2:
				System.out.println("Enter your id: ");
				int id = sc.nextInt();
				System.out.println("Enter name: ");
				name = sc.next();
				System.out.println("Enter phone: ");
				mobile = sc.next();
				
				c.setId(id);
				c.setName(name);
				c.setPhone(mobile);
				
				boolean result = cd.editContact(c);
				if(result) {
					System.out.println("successfully updated");
				}else {
					System.out.println("Error while updating");
				}
				break;
			case 3:
				System.out.println("Enter id: ");
				id = sc.nextInt();
				boolean delete = cd.deleteContact(id);
				if(delete) {
					System.out.println("Successfully deleted");
				}
				break;
			case 4:
				List<Contact> list = cd.getAllContacts();
				
				for(Contact contact:list) {
					System.out.println("ID= "+contact.getId());
					System.out.println("Name= "+contact.getName());
					System.out.println("Mobile = "+contact.getPhone());
					System.out.println("====================");
				}
				
				break;
				
			case 5:
				f = false;
				
				

		}
		sc.close();
		}
	}
}
