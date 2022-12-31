package com.Phase2.software2.paymentService.refund;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.springframework.stereotype.Service;

import com.Phase2.software2.paymentService.user.User;

@Service
public class RefundStroge {

	public static Map<String, Refund> askForrefund = new HashMap<String, Refund>();
	public static Map<String, Refund> refundState = new HashMap<String, Refund>();
	 
	public Boolean addRefund(Refund r){
        if (askForrefund.get(r.getUserEmail()) != null) {
            return false;
        }
        askForrefund.put(r.getUserEmail(), r);
        return true;
    }
	
	public Boolean addRefundStatus(Refund r){
        if (refundState.get(r.getUserEmail()) != null) {
            return false;
        }
        refundState.put(r.getUserEmail(), r);
        return true;
    }
	
	 public Refund getRefunReq(String userEmail){
		return askForrefund.get(userEmail);
		 
	 }
	 public Refund getrefundstate(String userEmail){
		return refundState.get(userEmail);
		 
	 }
	 
	 public Refund[] getAllrefundRequest() {
	        try {
	            Set<String> userEmail = askForrefund.keySet();
	            Refund[] u = new Refund[userEmail.size()];
	            int i = 0;
	            for (String userEmail1 : userEmail) {
	                u[i] = askForrefund.get(userEmail1);
	                i++;
	            }
	            return u;
	        } catch (Exception e) {
	            System.out.println("Exception in getAllPersons as" + e.getMessage());
	        }
	        return null;
	    }
	 

	public Refund[] getAllrefundState() {
        try {
            Set<String> userEmail = refundState.keySet();
            Refund[] u = new Refund[userEmail.size()];
            int i = 0;
            for (String userEmail1 : userEmail) {
                u[i] = refundState.get(userEmail1);
                i++;
            }
            return u;
        } catch (Exception e) {
            System.out.println("Exception in getAllPersons as" + e.getMessage());
        }
        return null;
    }
		 
}
