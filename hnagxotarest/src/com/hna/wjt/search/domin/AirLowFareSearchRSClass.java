package com.hna.wjt.search.domin;

import com.hna.wjt.search.domin.FareFamilyContent.FareFamilyContentClass;
import com.hna.wjt.search.domin.FlightInformationSummary.FlightInformationSummaryClass;
import com.hna.wjt.search.domin.FlightItineraryPricePoints.FlightItineraryPricePointsClass;
import com.hna.wjt.search.domin.PricePointSummary.PricePointSummaryClass;
import com.hna.wjt.search.domin.SelectedTrip.SelectedTripClass;
import com.hna.wjt.search.domin.TaxFeeContent.TaxFeeContentClass;

public class AirLowFareSearchRSClass {

	private String Uri;
	private String RqCriteria;

	private FareFamilyContentClass FareFamilyContent;
	private FlightInformationSummaryClass FlightInformationSummary;
	private FlightItineraryPricePointsClass FlightItineraryPricePoints;
	private PricePointSummaryClass PricePointSummary;
	private SelectedTripClass SelectedTrip;
	private TaxFeeContentClass TaxFeeContent;

	private String UserSessionId;

	public String getUri() {
		return Uri;
	}

	public void setUri(String uri) {
		Uri = uri;
	}

	public String getRqCriteria() {
		return RqCriteria;
	}

	public void setRqCriteria(String rqCriteria) {
		RqCriteria = rqCriteria;
	}

	public FareFamilyContentClass getFareFamilyContent() {
		return FareFamilyContent;
	}

	public void setFareFamilyContent(FareFamilyContentClass fareFamilyContent) {
		FareFamilyContent = fareFamilyContent;
	}

	public FlightInformationSummaryClass getFlightInformationSummary() {
		return FlightInformationSummary;
	}

	public void setFlightInformationSummary(
			FlightInformationSummaryClass flightInformationSummary) {
		FlightInformationSummary = flightInformationSummary;
	}

	public FlightItineraryPricePointsClass getFlightItineraryPricePoints() {
		return FlightItineraryPricePoints;
	}

	public void setFlightItineraryPricePoints(
			FlightItineraryPricePointsClass flightItineraryPricePoints) {
		FlightItineraryPricePoints = flightItineraryPricePoints;
	}

	public PricePointSummaryClass getPricePointSummary() {
		return PricePointSummary;
	}

	public void setPricePointSummary(PricePointSummaryClass pricePointSummary) {
		PricePointSummary = pricePointSummary;
	}

	public TaxFeeContentClass getTaxFeeContent() {
		return TaxFeeContent;
	}

	public void setTaxFeeContent(TaxFeeContentClass taxFeeContent) {
		TaxFeeContent = taxFeeContent;
	}

	public SelectedTripClass getSelectedTrip() {
		return SelectedTrip;
	}

	public void setSelectedTrip(SelectedTripClass selectedTrip) {
		SelectedTrip = selectedTrip;
	}

	public String getUserSessionId() {
		return UserSessionId;
	}

	public void setUserSessionId(String userSessionId) {
		UserSessionId = userSessionId;
	}

}
