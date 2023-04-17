package com.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Welcome to student Management ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("press 1 to Add Student");
			System.out.println("press 2 to delete Student");
			System.out.println("press 3 to display Student");
			System.out.println("press 4 to update Student");
			System.out.println("press 5 to exit");
			int c = Integer.parseInt(br.readLine());
			
			if(c==1) {
				//add student
				System.out.println("Enter user name: ");
				String name = br.readLine();
				
				System.out.println("Enter user mobile: ");
				String mobile = br.readLine();
				
				System.out.println("Enter user age: ");
				String age = br.readLine();
				
				//create student object to store student
				Student st = new Student(name,mobile,age);
				
				System.out.println(st);
			}
			else if(c==2) {
				//delete
			}else if(c==3) {
				//display
			}else if(c==4) {
				//update
			}else if(c==5){
				break;
			}else {
				//invalid
			}
		}
		System.out.println("Thank you for using");
		
	}
}
