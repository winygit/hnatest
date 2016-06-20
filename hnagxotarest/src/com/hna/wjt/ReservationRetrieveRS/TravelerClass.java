package com.hna.wjt.ReservationRetrieveRS;

public class TravelerClass {

	private String FirstName;
	private String GuestTypeCode;
	private String LastName;
	
	private FormOfIdentificationClass FormOfIdentification;
	private PhoneClass Phone;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getGuestTypeCode() {
		return GuestTypeCode;
	}
	public void setGuestTypeCode(String guestTypeCode) {
		GuestTypeCode = guestTypeCode;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public FormOfIdentificationClass getFormOfIdentification() {
		return FormOfIdentification;
	}
	public void setFormOfIdentification(
			FormOfIdentificationClass formOfIdentification) {
		FormOfIdentification = formOfIdentification;
	}
	public PhoneClass getPhone() {
		return Phone;
	}
	public void setPhone(PhoneClass phone) {
		Phone = phone;
	}
	
	
}
