package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Main");
		Hash addressBookser=new Hash();
		Scanner sc =new Scanner(System.in);
		int option;
		while(true) {
			System.out.println("what operation you want perform\n 1)Add AddressBook\n 2)edit contact\n 3)delete\n4)Display contact\n5) search by city 6. View by city\\n 7.view by state\n 8.sort Alphabetically");
			option =sc.nextInt();
			switch(option) {
			case 1:
				addressBookser.addAddressBook();
				break;
			case 2:
				addressBookser.editContact();
				break;
			case 3:
				addressBookser.deleteContact();
				break;
			case 4:
				addressBookser.display();
				break;
			case 5:
				addressBookser.addContact();
			case 6:
			   	System.out.println("Enter the city");
			    String city=sc.next();
			    addressBookser.viewCity(city);
			case 7:
			    System.out.println("Enter the state");
	         	String State=sc.next();
			    addressBookser.viewState(State);
			case 8:
				 addressBookser.sortAlphabatically();
			default:
					System.out.println("Enter the option");
			}
			
		System.out.println("Visit again to website");
		sc.close();
		
		}
	}

	public static Object values() {
		return null;
	}
}