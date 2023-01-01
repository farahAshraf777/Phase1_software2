package com.Phase2.software2.paymentService.admin;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class AdminStorage {
	 public static Map<String, Admin> admins = new HashMap<String, Admin>();
	 public Boolean addAdmin(Admin a){
	        if (admins.get(a.getAdminEmail()) != null) {
	            return false;
	        }
	        admins.put(a.getAdminEmail(), a);
	        return true;
	    }
		public Admin getAdmin(String adminEmail) {
	        return admins.get(adminEmail);
	    }
		
}
