package com.airOne;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer;
		PhoneBook pbook = new PhoneBook();
		System.out.println("Press any button to Start!!!");
		boolean isTrue = true;
		while(isTrue) {
			
			System.out.println("1 - ADD CONTACT, 2 - VIEW ALL CONTACTS, 3 - VIEW CONTACT VIA PHONENUMBER, 4 - REMOVE CONTACT VIA PHONE NUMBER, 5 - EXIT");
			answer = scanner.next();
			switch (answer) {
				case "1": {
					System.out.println("FirstName: ");
					String fname = scanner.next();
					System.out.println("LastName: ");
					String lname = scanner.next();
					System.out.println("PhoneNumber: ");
					long phonenumber = scanner.nextLong();
					System.out.println("Email: ");
					String email = scanner.next();
					Contact contact = new Contact(fname, lname, phonenumber, email);
					//System.out.println(contact);
					pbook.addContact(contact);
					break;
				}
				case "2":{
					System.out.println(pbook.viewAllContacts());
					break;
				}
				case "3": {
					System.out.println("Enter phone number: ");
					long pnumber = scanner.nextLong();
					pbook.viewContactGivenPhone(pnumber);
					break;
				}
				case "4": {
					System.out.println("Enter Phone number to remove contact: ");
					long pnumberToRemove = scanner.nextLong();
					System.out.println("Contact removed via phone Number: " + pbook.removeContact(pnumberToRemove));
					break;
				}
				case "5":{
					System.out.println("Bye-Bye");
					isTrue = false;
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + answer);
			}
		}
		System.out.println("Thank you!");
		scanner.close();
	}

}
