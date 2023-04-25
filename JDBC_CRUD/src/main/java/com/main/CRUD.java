package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bean.Contact;
import com.connection.DBConnect;
import com.dao.ContactDao;

public class CRUD {
	public static void main(String[] args) {
		String name;
		String phone;

		Contact c = new Contact();

		ContactDao d = new ContactDao(DBConnect.getConnection());
		// inserting data
		while (true) {
			System.out.println("Enter operation");
			System.out.println("1.Add contact");
			System.out.println("2.update contact");
			System.out.println("3.Delete Contact");
			System.out.println("4.view all contacts");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter your name: ");
				name = sc.next();

				System.out.println("Enter mobile: ");
				phone = sc.next();

				c.setName(name);
				c.setPhone(phone);

				boolean f = d.insertData(c);
				if (f) {
					System.out.println("Data inserted successfully");
				} else {
					System.out.println("Error");
				}
				break;

			case 2:
				System.out.println("Enter your id: ");
				int id = sc.nextInt();

				System.out.println("Enter name: ");
				name = sc.next();

				System.out.println("Enter mobile: ");
				phone = sc.next();

				c.setId(id);
				c.setName(name);
				c.setPhone(phone);
				
				boolean update = d.updateData(c);
				if(update) {
					System.out.println("updated");
				}else {
					System.out.println("error");
				}
				break;
				
			case 3:
				System.out.println("Enter id: ");
				id = sc.nextInt();
				c.setId(id);
				
				boolean delete = d.deleteData(c);
				
				if(delete) {
					System.out.println("deleted");
				}else {
					System.out.println("sorry");
				}
				break;
				
			case 4:
				//to view the data
				List<Contact> list = d.viewData(c);
				
				for(Contact contact:list) {
					System.out.println("================");
					System.out.println("Id= "+contact.getId());
					System.out.println("Name = "+contact.getName());
					System.out.println("phone= "+contact.getPhone());
					
				}
			}
			
		}
		
	}
}
