package com.Phase2.software2.paymentService.payment;

public class Creditcard extends WayOfPayment{
	double balance;
	
	public Creditcard() {
		wayOfPayment = "Creditcard";
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
