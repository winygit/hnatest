package com.hna.wjt.search.domin.FlightInformationSummary;

public class FlightListClass {
	private String TotalTravelDuration;
	private FlightSegmentListClass[] FlightSegment;

	public String getTotalTravelDuration() {
		return TotalTravelDuration;
	}

	public void setTotalTravelDuration(String totalTravelDuration) {
		TotalTravelDuration = totalTravelDuration;
	}

	public FlightSegmentListClass[] getFlightSegment() {
		return FlightSegment;
	}

	public void setFlightSegment(FlightSegmentListClass[] flightSegment) {
		FlightSegment = flightSegment;
	}

}
