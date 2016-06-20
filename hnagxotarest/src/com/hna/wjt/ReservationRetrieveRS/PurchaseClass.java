package com.hna.wjt.ReservationRetrieveRS;

public class PurchaseClass {

	private String PurchaseAmount;
	private String PurchaseCurrency;
	private String FormOfPayment;
	private String PaymentCardTypeCode;
	public String getPurchaseAmount() {
		return PurchaseAmount;
	}
	public void setPurchaseAmount(String purchaseAmount) {
		PurchaseAmount = purchaseAmount;
	}
	public String getPurchaseCurrency() {
		return PurchaseCurrency;
	}
	public void setPurchaseCurrency(String purchaseCurrency) {
		PurchaseCurrency = purchaseCurrency;
	}
	public String getFormOfPayment() {
		return FormOfPayment;
	}
	public void setFormOfPayment(String formOfPayment) {
		FormOfPayment = formOfPayment;
	}
	public String getPaymentCardTypeCode() {
		return PaymentCardTypeCode;
	}
	public void setPaymentCardTypeCode(String paymentCardTypeCode) {
		PaymentCardTypeCode = paymentCardTypeCode;
	}
	
}
