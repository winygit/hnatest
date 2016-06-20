package com.hna.wjt.search.domin.SelectedTrip;

public class FareClass {
	private int BaseFareAmount;
	private String BaseFareCurrency;
	private int TotalFareAmount;
	private String TotalFareCurrency;

	private FeesClass Fees;
	private TaxesClass Taxes;

	public int getBaseFareAmount() {
		return BaseFareAmount;
	}

	public void setBaseFareAmount(int baseFareAmount) {
		BaseFareAmount = baseFareAmount;
	}

	public String getBaseFareCurrency() {
		return BaseFareCurrency;
	}

	public void setBaseFareCurrency(String baseFareCurrency) {
		BaseFareCurrency = baseFareCurrency;
	}

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

	public FeesClass getFees() {
		return Fees;
	}

	public void setFees(FeesClass fees) {
		Fees = fees;
	}

	public TaxesClass getTaxes() {
		return Taxes;
	}

	public void setTaxes(TaxesClass taxes) {
		Taxes = taxes;
	}

}
