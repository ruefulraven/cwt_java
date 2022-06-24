package com.airOne;

public class Contact {

	private String firstName;
	private String lastName;
	private long phoneNumer;
	private String email;
	
	public Contact(String firstName, String lastName, long phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumer = phoneNumber;
		this.email = email;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhoneNumer() {
		return phoneNumer;
	}

	public void setPhoneNumer(long phoneNumer) {
		this.phoneNumer = phoneNumer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumer=" + phoneNumer + ", email="
				+ email + "]";
	}
	
	
}
