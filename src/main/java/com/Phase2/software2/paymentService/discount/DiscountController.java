package com.Phase2.software2.paymentService.discount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Phase2.software2.paymentService.checksRequests.Response;
import com.Phase2.software2.paymentService.payment.Cash;
import com.Phase2.software2.paymentService.payment.Creditcard;
import com.Phase2.software2.paymentService.payment.Wallet;
import com.Phase2.software2.paymentService.payment.WayOfPaymentStorage;
import com.Phase2.software2.paymentService.serviceANDproviders.ProviderStorage;
import com.Phase2.software2.paymentService.user.User;


@RestController
@RequestMapping(value = "/addDiscount")
public class DiscountController {
	@Autowired
	
	DiscountStorage ds = new DiscountStorage();
	
	@PostMapping(value = "/{serviceProviderName}")
    public Response addDiscount(@PathVariable("serviceProviderName") String serviceProviderName, @RequestBody Discount sd) {
        boolean res = ds.addDiscount(sd);
        Response response = new Response();
        response.setStatus(true);
        response.setMessage("successfully added");
        response.object = sd;
        return response;
    }
	@GetMapping("/checkDiscount")
    public Discount[] getAllDiscount() {
        return ds.getAllDiscount();
    }

}
