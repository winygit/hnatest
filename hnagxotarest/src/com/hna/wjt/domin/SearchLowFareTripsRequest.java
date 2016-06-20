package com.hna.wjt.domin;

public class SearchLowFareTripsRequest {
	private String leg;
	private String traveler;
	private String cabin;
	private String promotion;
	private boolean flexible;

	public SearchLowFareTripsRequest(String leg, String traveler, String cabin) {
		super();
		this.leg = leg;
		this.traveler = traveler;
		this.cabin = cabin;
	}

	public String getLeg() {
		return leg;
	}

	public void setLeg(String leg) {
		this.leg = leg;
	}

	public String getTraveler() {
		return traveler;
	}

	public void setTraveler(String traveler) {
		this.traveler = traveler;
	}

	public String getCabin() {
		return cabin;
	}

	public void setCabin(String cabin) {
		this.cabin = cabin;
	}

	public String getPromotion() {
		return promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	public boolean isFlexible() {
		return flexible;
	}

	public void setFlexible(boolean flexible) {
		this.flexible = flexible;
	}

}
