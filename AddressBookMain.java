package com.bridgelabz;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Main");
		ServiceBook.addContact();
		ServiceBook.display();
		ServiceBook.editContact();
		ServiceBook.deleteContact();
	}
}
