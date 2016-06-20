package com.hna.wjt.ReservationRetrieveRS;

public class ReservationClass {
	private String Status;
	private String  Description;
	private PurchaseClass  Purchase;
	//private ReservationElementClass ReservationElement;
	private CustomerClass Customer;
	private TravelerClass Traveler;
	
	public PurchaseClass getPurchase() {
		return Purchase;
	}
	public void setPurchase(PurchaseClass purchase) {
		Purchase = purchase;
	}
	/*
	public ReservationElementClass getReservationElement() {
		return ReservationElement;
	}
	public void setReservationElement(ReservationElementClass reservationElement) {
		ReservationElement = reservationElement;
	}
	*/
	public CustomerClass getCustomer() {
		return Customer;
	}
	public void setCustomer(CustomerClass customer) {
		Customer = customer;
	}
	public TravelerClass getTraveler() {
		return Traveler;
	}
	public void setTraveler(TravelerClass traveler) {
		Traveler = traveler;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	

	
}
