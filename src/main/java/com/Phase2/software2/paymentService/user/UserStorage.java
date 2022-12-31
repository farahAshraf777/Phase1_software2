package com.Phase2.software2.paymentService.user;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class UserStorage{
	public static Map<String, User> users = new HashMap<String, User>();

	public Boolean addUser(User u){
        if (users.get(u.getUserEmail()) != null) {
            return false;
        }
        users.put(u.getUserEmail(), u);
        return true;
    }
	public User getUser(String userEmail) {
        return users.get(userEmail);
    }
	public User[] getAllUsers() {
        try {
            Set<String> userEmail = users.keySet();
            User[] u = new User[userEmail.size()];
            int i = 0;
            for (String userEmail1 : userEmail) {
                u[i] = users.get(userEmail1);
                i++;
            }
            return u;
        } catch (Exception e) {
            System.out.println("Exception in getAllPersons as" + e.getMessage());
        }
        return null;
    }
				
}


