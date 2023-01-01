package com.Phase2.software2.paymentService.discount;

import java.util.*;

import org.springframework.stereotype.Service;

import com.Phase2.software2.paymentService.user.User;

@Service
public class DiscountStorage {
	public static Map<String, Discount> discount = new HashMap<String, Discount>();

	public Boolean addDiscount(Discount s){
        if (discount.get(s.getNameservice()) != null) {
            return false;
        }
        discount.put(s.getNameservice(), s);
        return true;
    }
	public Discount getDiscount(String nameservice){
		return discount.get(nameservice);
	 }
	public Discount[] getAllDiscount() {
        try {
            Set<String> nameservice = discount.keySet();
            Discount[] d = new Discount[nameservice.size()];
            int i = 0;
            for (String nameservice1 : nameservice) {
                d[i] = discount.get(nameservice1);
                i++;
            }
            return d;
        } catch (Exception e) {
            System.out.println("Exception in getAllPersons as" + e.getMessage());
        }
        return null;
    }
}
