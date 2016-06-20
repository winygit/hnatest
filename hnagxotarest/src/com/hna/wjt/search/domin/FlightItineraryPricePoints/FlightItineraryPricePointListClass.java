package com.hna.wjt.search.domin.FlightItineraryPricePoints;

public class FlightItineraryPricePointListClass {

	private String ID;
	private int Index;
	private int Leg;
	private FlightInformationAttributesListClass [] FlightInformationAttributes;
	private String FlightInformationRef;
	private String PricePointRef;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public int getIndex() {
		return Index;
	}
	public void setIndex(int index) {
		Index = index;
	}
	public int getLeg() {
		return Leg;
	}
	public void setLeg(int leg) {
		Leg = leg;
	}
	public FlightInformationAttributesListClass[] getFlightInformationAttributes() {
		return FlightInformationAttributes;
	}
	public void setFlightInformationAttributes(
			FlightInformationAttributesListClass[] flightInformationAttributes) {
		FlightInformationAttributes = flightInformationAttributes;
	}
	public String getFlightInformationRef() {
		return FlightInformationRef;
	}
	public void setFlightInformationRef(String flightInformationRef) {
		FlightInformationRef = flightInformationRef;
	}
	public String getPricePointRef() {
		return PricePointRef;
	}
	public void setPricePointRef(String pricePointRef) {
		PricePointRef = pricePointRef;
	}
	
	

}
