package com.Phase2.software2.paymentService.serviceANDproviders;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Phase2.software2.paymentService.checksRequests.Response;


@RestController
@RequestMapping(value = "/provider")
public class ProviderController {

		@Autowired
		ProviderStorage S = new ProviderStorage();

		@GetMapping(value = "/search/{serviceProviderName}")
	    public Response<Provider> search(@PathVariable("serviceProviderName") String serviceProviderName) {
	        var provider = S.getProvider(serviceProviderName);
	        Response<Provider> response = new Response<Provider>();
	        if (provider == null) {
	            response.setStatus(false);
	            response.setMessage("provider service Not Found");
	            response.object = null;
	            return response;
	        }

	        response.setStatus(true);
	        response.setMessage("Successfully Search");
	        response.object = provider;

	        return response;
	    }

}
