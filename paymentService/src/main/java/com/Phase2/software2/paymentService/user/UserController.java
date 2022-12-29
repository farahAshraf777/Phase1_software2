
package com.Phase2.software2.paymentService.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Phase2.software2.paymentService.checksRequests.Response;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	UserStorage f = new UserStorage();
	
	@PostMapping(value = "/signUp")
    public Response signUp(@RequestBody User u) {
        boolean res = f.addUser(u);
        Response response = new Response();
        if (!res) {
            response.setStatus(false);
            response.setMessage("User Already Exists");
            return response;
        }

        response.setStatus(true);
        response.setMessage("Sign Up sucessfully");
        response.object = u;
        return response;
    }
	@GetMapping(value = "/signIn/{userEmail}")
    public Response<User> signIn(@PathVariable("userEmail") String userEmail) {
        var user = f.getUser(userEmail);
        Response<User> response = new Response<User>();
        if (user == null) {
            response.setStatus(false);
            response.setMessage("User Not Found");
            response.object = null;

            return response;
        }

        response.setStatus(true);
        response.setMessage("Sign in Successfully");
        response.object = user;

        return response;
    }

    @GetMapping("/get")
    public User[] getAll() {
        return f.getAllUsers();
    }

}
