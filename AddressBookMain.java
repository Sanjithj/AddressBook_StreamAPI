package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Main");
		Scanner sc =new Scanner(System.in);
		int option;
		while(true) {
			System.out.println("Operation want to perform\n 1)Add Contact\n 2)edit contact\n 3)delete\n4)Display contact");
			option =sc.nextInt();
			switch(option) {
			case 1:
				ServiceBook.addContact();
				break;
			case 2:
				ServiceBook.editContact();
				break;
			case 3:
				ServiceBook.deleteContact();
				break;
			case 4:
				ServiceBook.display();
				break;
			default:
				System.out.println("Enter the option");
			}
			
		System.out.println("Visit again to website");
		sc.close();
		
		}
	}
}