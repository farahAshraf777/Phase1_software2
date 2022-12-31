package com.Phase2.software2.paymentService.serviceANDproviders;

public abstract class Provider {
	String serviceProviderName;
	double taxes;

	public double getTaxes() {
		return taxes;
	}

	public String getServicename() {
		return serviceProviderName;
	}

}
