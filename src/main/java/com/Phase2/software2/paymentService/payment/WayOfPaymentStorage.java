package com.Phase2.software2.paymentService.payment;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.Phase2.software2.paymentService.user.User;
@Service
public class WayOfPaymentStorage {

	public static Map<String, WayOfPayment> wayOfPayment = new HashMap<String, WayOfPayment>();
	public static Map<String, Wallet> wallet = new HashMap<String, Wallet>();
	
	public Boolean addCash(Cash c){
        if (wayOfPayment.get(c.getUserEmail()) != null) {
            return false;
        }
        wayOfPayment.put(c.getUserEmail(), c);
        return true;
    }
	public Boolean addWallet(Wallet w){
        if (w.getbalance() < w.getWalletMoney() || w.getWalletMoney()<w.getTotalCost()) {
            return false;
        }
        wayOfPayment.put(w.getUserEmail(), w);
        wallet.put(w.getUserEmail(), w);
        return true;
    }
	public Wallet getWallet(String userEmail) {
        return wallet.get(userEmail);
    }
	public Boolean addCreditCard(Creditcard cc){
        if (cc.getBalance() < cc.getTotalCost()) {
            return false;
        }
        wayOfPayment.put(cc.getUserEmail(), cc);
        return true;
    }
	
	public WayOfPayment[] getAllWayOfPayment() {
        try {
            Set<String> userEmail = wayOfPayment.keySet();
            WayOfPayment[] w = new WayOfPayment[userEmail.size()];
            int i = 0;
            for (String userEmail1 : userEmail) {
                w[i] = wayOfPayment.get(userEmail1);
                i++;
            }
            return w;
        } catch (Exception e) {
            System.out.println("Exception in getAllPersons as" + e.getMessage());
        }
        return null;
    }
	
	public Wallet[] getWalletTransaction() {
        try {
            Set<String> userEmail = wallet.keySet();
            Wallet[] w = new Wallet[userEmail.size()];
            int i = 0;
            for (String userEmail1 : userEmail) {
                w[i] = wallet.get(userEmail1);
                i++;
            }
            return w;
        } catch (Exception e) {
            System.out.println("Exception in getAllPersons as" + e.getMessage());
        }
        return null;
    }
}
