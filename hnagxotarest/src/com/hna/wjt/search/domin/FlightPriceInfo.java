package com.hna.wjt.search.domin;

public class FlightPriceInfo {

	private int BaseFareAmount=0;//��������
	private int TotalFareAmount=0;//�ܷ���
	private String Currency;//����
	private int FeeSum=0;//
	private int TaxesSum=0;//��˰
	private  int promote=0;
	
	private String FlightNumber;//�����
	private String ArrivalDate;//�ﵽʱ��
	private String DepartureDate;//����ʱ��
	private String destinationLocationName;
	private String OriginLocationName;
	
	
	private int Index;
	private boolean ISSelected=false;//ʮ��ϵͳѡ�����ͷ��ú���
	
	public int getBaseFareAmount() {
		return BaseFareAmount;
	}
	public void setBaseFareAmount(int baseFareAmount) {
		BaseFareAmount = baseFareAmount;
	}
	public int getTotalFareAmount() {
		return TotalFareAmount;
	}
	public void setTotalFareAmount(int totalFareAmount) {
		TotalFareAmount = totalFareAmount;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public int getFeeSum() {
		return FeeSum;
	}
	public void setFeeSum(int feeSum) {
		FeeSum = feeSum;
	}
	public int getTaxesSum() {
		return TaxesSum;
	}
	public void setTaxesSum(int taxesSum) {
		TaxesSum = taxesSum;
	}
	public int getPromote() {
		return promote;
	}
	public void setPromote(int promote) {
		this.promote = promote;
	}
	public String getFlightNumber() {
		return FlightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		FlightNumber = flightNumber;
	}
	public String getArrivalDate() {
		return ArrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		ArrivalDate = arrivalDate;
	}
	public String getDepartureDate() {
		return DepartureDate;
	}
	public void setDepartureDate(String departureDate) {
		DepartureDate = departureDate;
	}
	public boolean isISSelected() {
		return ISSelected;
	}
	public void setISSelected(boolean iSSelected) {
		ISSelected = iSSelected;
	}
	public int getIndex() {
		return Index;
	}
	public void setIndex(int index) {
		Index = index;
	}
	public String getDestinationLocationName() {
		return destinationLocationName;
	}
	public void setDestinationLocationName(String destinationLocationName) {
		this.destinationLocationName = destinationLocationName;
	}
	public String getOriginLocationName() {
		return OriginLocationName;
	}
	public void setOriginLocationName(String originLocationName) {
		OriginLocationName = originLocationName;
	}
	
	
	
	
}
