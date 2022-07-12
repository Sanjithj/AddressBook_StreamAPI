package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Hash {
	HashMap<String, ServiceBook> addressBook = new HashMap<>();
    Scanner sc = new Scanner(System.in);

  
   public ServiceBook findAddressBook(String addBookName) {

       for (Map.Entry<String, ServiceBook> itrator : addressBook.entrySet()) {
           if (itrator.getKey().equalsIgnoreCase(addBookName)) {
               return itrator.getValue();
           }
       }

       return null;

   }
   public void addAddressBook() {

       System.out.println(" enter the name of the address  ");
       String name = sc.next();

       if (addressBook.get(name) != null) {

           System.out.println(" this book already exists");
           return;
       }

       addressBook.put(name, new ServiceBook());

   }
   public void addContact() {
   	System.out.println("enter the address book name");
   	
   	String addressBook=sc.next();
   	ServiceBook addBook=findAddressBook(addressBook);
   	if(addBook==null) {
   		System.out.println("this is not exist");
   		return;
   	}
   	ServiceBook.addContacts(addressBook);
   }
   public void editContact() {
   	System.out.println("please enter the address book ");
   	String addressBook=sc.next();
   	ServiceBook addBook=findAddressBook(addressBook);
   	if(addBook==null) {
   		System.out.println("this is not exist");
   		return;
   	}
   	addBook.editContact();
   }
   public void deleteContact() {
   	System.out.println("please enter the address book ");
   	String addressBook=sc.next();
   	ServiceBook addBook=findAddressBook(addressBook);
   	if(addBook==null) {
   		System.out.println("this is not exist");
   		return;
   	}
   	addBook.editContact();
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
   public void find(String name, String state, String City) {
   	

   	addressBook.values().stream().forEach((addBook) -> {
           ((Stream<ServiceBook>) ServiceBook.addressBookMang).filter(contact -> {

                       if (City.equalsIgnoreCase("city"))
                           return Contacts.getCity().equalsIgnoreCase(state);
                       else
                           return Contacts.getState().equalsIgnoreCase(state);
                   }).filter(contact -> Contacts.getFirst_name().equalsIgnoreCase(name))
                   .forEach(contact -> System.out.println(contact));
       });
   
}
public void viewCity(String city) {
}
public void viewState(String state) {
}
public static char[] get(String name) {
	return null;
}
public void sortAlphabatically() {
}
}