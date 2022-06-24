package com.airOne;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook{

	private List<Contact> contacts = new ArrayList<>();

	public void addContact(Contact contactObj) {
		contacts.add(contactObj);
	}
	
	public List<Contact> viewAllContacts(){
		return contacts;
	}
	
	public void viewContactGivenPhone(long phoneNumber) {
		contacts.forEach((contact) -> {
			if(contact.getPhoneNumer() == phoneNumber) {
				System.out.println(contact);
			}
		});
	}
	
	public boolean removeContact(long phoneNumber) {
		boolean isRemoved = false;
		isRemoved = contacts.removeIf((contact) -> contact.getPhoneNumer() == phoneNumber);

		return isRemoved;
	}
	
	public List<Contact> getContact() {
		return contacts;
	}

	public void setContact(List<Contact> contact) {
		this.contacts = contact;
	}
	
	
}
