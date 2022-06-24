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
	
	public Contact viewContactGivenPhone(long phoneNumber) {
		Contact contactViaPhoneNumber = null;
		for(Contact contact : contacts) {
			if(contact.getPhoneNumer() == phoneNumber) {
				contactViaPhoneNumber = contact;
			}
		}
		return contactViaPhoneNumber;
	}
	
	public boolean removeContact(long phoneNumber) {
		boolean isRemoved = false;
		int index = 0;
		int contactIndex = 0; 
		for(Contact contact : contacts) {
			if(contact.getPhoneNumer() == phoneNumber) {
				System.out.println("index: " + index);
				isRemoved = true;
				contactIndex = index;
			}
			index++;
		}
		if(isRemoved) {
			contacts.remove(contactIndex);
		}
		return isRemoved;
	}
	
	public List<Contact> getContact() {
		return contacts;
	}

	public void setContact(List<Contact> contact) {
		this.contacts = contact;
	}
	
	
}
