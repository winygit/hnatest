package com.hna.wjt.ReservationRetrieveRS;

import com.hna.wjt.search.domin.FareFamilyContent.FareFamilyContentClass;
import com.hna.wjt.search.domin.FlightInformationSummary.FlightInformationListClass;
import com.hna.wjt.search.domin.SelectedTrip.TripPricingClass;
import com.hna.wjt.search.domin.TaxFeeContent.TaxFeeContentClass;

public class AirTripClass {

	private FareFamilyContentClass FareFamilyContent;
	private FlightFareClass FlightFare;
	private FlightInformationListClass FlightInformation;
	private TaxFeeContentClass TaxFeeContent;
	private TripPricingClass TripPricing;
	public FareFamilyContentClass getFareFamilyContent() {
		return FareFamilyContent;
	}
	public void setFareFamilyContent(FareFamilyContentClass fareFamilyContent) {
		FareFamilyContent = fareFamilyContent;
	}
	public FlightFareClass getFlightFare() {
		return FlightFare;
	}
	public void setFlightFare(FlightFareClass flightFare) {
		FlightFare = flightFare;
	}
	public FlightInformationListClass getFlightInformation() {
		return FlightInformation;
	}
	public void setFlightInformation(FlightInformationListClass flightInformation) {
		FlightInformation = flightInformation;
	}
	public TaxFeeContentClass getTaxFeeContent() {
		return TaxFeeContent;
	}
	public void setTaxFeeContent(TaxFeeContentClass taxFeeContent) {
		TaxFeeContent = taxFeeContent;
	}
	public TripPricingClass getTripPricing() {
		return TripPricing;
	}
	public void setTripPricing(TripPricingClass tripPricing) {
		TripPricing = tripPricing;
	}
	
	
	
}
