package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hash {
	HashMap<String, ServiceBook> addressBook = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	   
	    public ServiceBook findAddressBook(String adBookName) {

	        for (Map.Entry<String, ServiceBook> itrator : addressBook.entrySet()) {
	            if (itrator.getKey().equalsIgnoreCase(adBookName)) {
	                return itrator.getValue();
	            }
	        }

	        return null;

	    }
	    public void addAddressBook() {

	        System.out.println(" enter the name of the address book which you want to see ");
	        String name = sc.next();

	        if (addressBook.get(name) != null) {

	            System.out.println(" this book already exists");
	            return;
	        }


	    }
	    public void addContact() {
	    	System.out.println("enter the address book name");
	    	
	    	String addressBook=sc.next();
	    	ServiceBook addBook=findAddressBook(addressBook);
	    	if(addBook==null) {
	    		System.out.println("this is not exist");
	    		return;
	    	}
	    	ServiceBook.addContact();
	    }
	    public void editContact() {
	    	System.out.println("please enter the address book ");
	    	String addressBook=sc.next();
	    	ServiceBook addBook=findAddressBook(addressBook);
	    	if(addBook==null) {
	    		System.out.println("this is not exist");
	    		return;
	    	}
	    	ServiceBook.editContact();
	    }
	    public void deleteContact() {
	    	System.out.println("please enter the address book ");
	    	String addressBook=sc.next();
	    	ServiceBook addBook=findAddressBook(addressBook);
	    	if(addBook==null) {
	    		System.out.println("this is not exist");
	    		return;
	    	}
	    	ServiceBook.deleteContact();
	    }
	    
	    public void display() {
	    	System.out.println("please enter the address book ");
	    	String addressBook=sc.next();
	    	ServiceBook addBook=findAddressBook(addressBook);
	    	if(addBook==null) {
	    		System.out.println("this is not exist");
	    		return;
	    	}
	    	ServiceBook.display();
	    	
	    }
	    
}
