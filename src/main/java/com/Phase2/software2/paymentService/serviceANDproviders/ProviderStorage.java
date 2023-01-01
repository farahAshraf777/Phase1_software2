package com.Phase2.software2.paymentService.serviceANDproviders;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class ProviderStorage {

	public static Map<String, Provider> providers = new HashMap<String, Provider>();

	public ProviderStorage() {
		providers.put("InternetPaymentEtisalat‏", new InternetPaymentEtisalat());
		providers.put("InternetPaymentOrange‏", new InternetPaymentOrange());
		providers.put("InternetPaymentVodafone‏", new InternetPaymentVodafone());
		providers.put("InternetPaymentWe‏", new InternetPaymentWe());
		providers.put("MobileRechargeWe‏", new MobileRechargeWe());
		providers.put("MobileRechargeEtisalat‏", new MobileRechargeEtisalat());
		providers.put("MobileRechargeVodafone‏", new MobileRechargeVodafone());
		providers.put("MobileRechargeOrange", new MobileRechargeOrange());
		providers.put("Landline‏QuarterReceipt‏", new LandlineQuarterReceipt‏‏());
		providers.put("Donations‏NGO‏", new Donations‏NGO‏());
		providers.put("Landline‏Monthlyreceipt‏", new Landline‏MonthlyReceipt‏());
		providers.put("Donations‏CancerHospital‏", new DonationsCancerHospital());
		providers.put("DonationsDSchools‏", new DonationsSchools‏());
	}
	public Provider getProvider(String serviceProviderName) {
        return providers.get(serviceProviderName);
    }
	
}
