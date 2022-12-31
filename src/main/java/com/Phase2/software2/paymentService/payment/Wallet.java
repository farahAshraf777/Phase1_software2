package com.Phase2.software2.paymentService.payment;

public class Wallet extends WayOfPayment{
	double balance = 4000;
	double walletMoney;
	public double getWalletMoney() {
		return walletMoney;
	}

	public void setWalletMoney(double walletMoney) {
		this.walletMoney = walletMoney;
	}

	public Wallet() {
		wayOfPayment = "Wallet";
	}
    
	public double getbalance() {
		return balance;
	}
}
