package com.hna.wjt.ReservationRetrieveRS;

public class CustomerClass {

	private String FirstName;
	private String LastName;
	private EmailClass Email;
	private PhoneClass Phone;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public EmailClass getEmail() {
		return Email;
	}
	public void setEmail(EmailClass email) {
		Email = email;
	}
	public PhoneClass getPhone() {
		return Phone;
	}
	public void setPhone(PhoneClass phone) {
		Phone = phone;
	}
	
	
}
