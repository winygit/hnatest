package com.hna.wjt.search.domin.SelectedTrip;


public class SelectedTripClass {

	private String Uri;
	private FlightItineraryPricePointsClass FlightItineraryPricePoints;
	private TripPricingClass TripPricing;
	public String getUri() {
		return Uri;
	}
	public void setUri(String uri) {
		Uri = uri;
	}
	public FlightItineraryPricePointsClass getFlightItineraryPricePoints() {
		return FlightItineraryPricePoints;
	}
	public void setFlightItineraryPricePoints(
			FlightItineraryPricePointsClass flightItineraryPricePoints) {
		FlightItineraryPricePoints = flightItineraryPricePoints;
	}
	public TripPricingClass getTripPricing() {
		return TripPricing;
	}
	public void setTripPricing(TripPricingClass tripPricing) {
		TripPricing = tripPricing;
	}
	
	
}
