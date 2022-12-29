package com.Phase2.software2.paymentService.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Phase2.software2.paymentService.checksRequests.Response;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
	@Autowired
	AdminStorage f = new AdminStorage();
	
	@PostMapping(value = "/signUp")
    public Response signUp(@RequestBody Admin a) {
        boolean res = f.addAdmin(a);
        Response response = new Response();
        if (!res) {
            response.setStatus(false);
            response.setMessage("Admin Already Exists");
            return response;
        }

        response.setStatus(true);
        response.setMessage("Sign up sucessfully");
        response.object = a;
        return response;
    }
	@GetMapping(value = "/signIn/{adminEmail}")
    public Response<Admin> signIn(@PathVariable("adminEmail") String adminEmail) {
        var admin = f.getAdmin(adminEmail);
        Response<Admin> response = new Response<Admin>();
        if (admin == null) {
            response.setStatus(false);
            response.setMessage("Admin Not Found");
            response.object = null;

            return response;
        }

        response.setStatus(true);
        response.setMessage("Sign in Successfully");
        response.object = admin;

        return response;
    }

}
