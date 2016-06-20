package com.hna.wjt.search.domin.PricePointSummary;

public class BasedOnPTCPricingClass {

	private FareClass Fare;
	private GuestType GuestType;

	public FareClass getFare() {
		return Fare;
	}

	public void setFare(FareClass fare) {
		Fare = fare;
	}

	public GuestType getGuestType() {
		return GuestType;
	}

	public void setGuestType(GuestType guestType) {
		GuestType = guestType;
	}

}
