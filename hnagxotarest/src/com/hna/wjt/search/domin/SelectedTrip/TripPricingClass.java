package com.hna.wjt.search.domin.SelectedTrip;

public class TripPricingClass {
	private int TotalFareAmount;
	private String TotalFareCurrency;
	private TravelerTripPricingListClass[] TravelerTripPricing;

	public int getTotalFareAmount() {
		return TotalFareAmount;
	}

	public void setTotalFareAmount(int totalFareAmount) {
		TotalFareAmount = totalFareAmount;
	}

	public String getTotalFareCurrency() {
		return TotalFareCurrency;
	}

	public void setTotalFareCurrency(String totalFareCurrency) {
		TotalFareCurrency = totalFareCurrency;
	}

	public TravelerTripPricingListClass[] getTravelerTripPricing() {
		return TravelerTripPricing;
	}

	public void setTravelerTripPricing(
			TravelerTripPricingListClass[] travelerTripPricing) {
		TravelerTripPricing = travelerTripPricing;
	}

}
