package com.Phase2.software2.paymentService.payment;

public abstract class WayOfPayment {
	double totalCost ;
	double amount;
	String wayOfPayment;
	String mobileNumber;
	String userEmail;
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getWayOfPayment() {
		return wayOfPayment;
	}
	
	public double getTotalCost() {
		return totalCost;
	}
	
	public double getAmount() {
		return amount;
	}
	
}
