package com.hna.wjt.CalculateTrip.domin;

import com.hna.wjt.search.domin.FareFamilyContent.FareFamilyContentClass;
import com.hna.wjt.search.domin.FlightInformationSummary.FlightInformationListClass;
import com.hna.wjt.search.domin.SelectedTrip.TripPricingClass;
import com.hna.wjt.search.domin.TaxFeeContent.TaxFeeContentClass;

public class TripClass {
	private String Uri;
	private TripPricingClass TripPricing;// price信息
	private FlightInformationListClass FlightInformation;// 航班信息
    private TaxFeeContentClass TaxFeeContent;
	private FareFamilyContentClass FareFamilyContent;
	public String getUri() {
		return Uri;
	}

	public void setUri(String uri) {
		Uri = uri;
	}

	public TripPricingClass getTripPricing() {
		return TripPricing;
	}

	public void setTripPricing(TripPricingClass tripPricing) {
		TripPricing = tripPricing;
	}

	public FlightInformationListClass getFlightInformation() {
		return FlightInformation;
	}

	public void setFlightInformation(
			FlightInformationListClass flightInformation) {
		FlightInformation = flightInformation;
	}

	public TaxFeeContentClass getTaxFeeContent() {
		return TaxFeeContent;
	}

	public void setTaxFeeContent(TaxFeeContentClass taxFeeContent) {
		TaxFeeContent = taxFeeContent;
	}

	public FareFamilyContentClass getFareFamilyContent() {
		return FareFamilyContent;
	}

	public void setFareFamilyContent(FareFamilyContentClass fareFamilyContent) {
		FareFamilyContent = fareFamilyContent;
	}

}
