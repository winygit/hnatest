package com.hna.wjt.AirVerifyRS.domin;

import com.hna.wjt.search.domin.FareFamilyContent.FareFamilyContentClass;
import com.hna.wjt.search.domin.FlightInformationSummary.FlightInformationListClass;
import com.hna.wjt.search.domin.SelectedTrip.TripPricingClass;
import com.hna.wjt.search.domin.TaxFeeContent.TaxFeeContentClass;

public class TripOptionClass {

	private String Uri;
	private FareFamilyContentClass FareFamilyContent;
	//
	private FlightInformationListClass FlightInformation;
	private TaxFeeContentClass TaxFeeContent;
	private TripPricingClass TripPricing;
	public String getUri() {
		return Uri;
	}
	public void setUri(String uri) {
		Uri = uri;
	}
	public FareFamilyContentClass getFareFamilyContent() {
		return FareFamilyContent;
	}
	public void setFareFamilyContent(FareFamilyContentClass fareFamilyContent) {
		FareFamilyContent = fareFamilyContent;
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
