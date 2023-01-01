package com.Phase2.software2.paymentService.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Phase2.software2.paymentService.checksRequests.Response;
import com.Phase2.software2.paymentService.discount.DiscountStorage;
import com.Phase2.software2.paymentService.serviceANDproviders.ProviderStorage;

@RestController
@RequestMapping(value = "/pay")
public class WayOfPaymentController {
	@Autowired
	WayOfPaymentStorage w = new WayOfPaymentStorage();
	ProviderStorage p = new ProviderStorage();
	DiscountStorage d = new DiscountStorage();
	
	@PostMapping(value = "/{serviceProviderName}/cash")
    public Response cashPayment(@PathVariable("serviceProviderName") String serviceProviderName, @RequestBody Cash c) {
		var provider = p.getProvider(serviceProviderName);
		var discount = d.getDiscount(serviceProviderName);
        boolean res = w.addCash(c);
        Response response = new Response();
        response.setStatus(true);
        c.setTotalCost(provider.getTaxes() + c.getAmount()) ;
        double totalDiscount = ((c.getTotalCost())* (discount.getSpecificdiscount()));
        c.setTotalCost((c.getTotalCost()-totalDiscount)) ;
        totalDiscount = (c.getTotalCost()*(discount.getOveralldiscount()));
        c.setTotalCost((c.getTotalCost()-totalDiscount)) ;
        response.setMessage("The total cost: " + c.getTotalCost());
        response.object = c;
        return response;
    }
	
	@PostMapping(value = "/{serviceProviderName}/wallet")
    public Response walletPayment(@PathVariable("serviceProviderName") String serviceProviderName, @RequestBody Wallet wallet) {
		var provider = p.getProvider(serviceProviderName);
		var discount = d.getDiscount(serviceProviderName);
		wallet.setTotalCost(provider.getTaxes() + wallet.getAmount()) ;
        double totalDiscount = ((wallet.getTotalCost())* (discount.getSpecificdiscount()));
        wallet.setTotalCost((wallet.getTotalCost()-totalDiscount)) ;
        totalDiscount = (wallet.getTotalCost()*(discount.getOveralldiscount()));
        wallet.setTotalCost((wallet.getTotalCost()-totalDiscount)) ;
        boolean res = w.addWallet(wallet);
        Response response = new Response();
        if (!res) {
            response.setStatus(false);
            response.setMessage("There is no enough money! or wallet money greater than wallet balance");
            return response;
        }
        wallet.setWalletMoney(wallet.getWalletMoney()-wallet.getTotalCost());
        response.setStatus(true);
        response.setMessage("The total cost: " + wallet.getTotalCost());
        response.object = wallet;
        return response;
    }
	@PostMapping(value = "/{serviceProviderName}/creditcard")
    public Response creditCardPayment(@PathVariable("serviceProviderName") String serviceProviderName, @RequestBody Creditcard card) {
		var provider = p.getProvider(serviceProviderName);
		var discount = d.getDiscount(serviceProviderName);
		card.setTotalCost(provider.getTaxes() + card.getAmount()) ;
        double totalDiscount = ((card.getTotalCost())* (discount.getSpecificdiscount()));
        card.setTotalCost((card.getTotalCost()-totalDiscount)) ;
        totalDiscount = (card.getTotalCost()*(discount.getOveralldiscount()));
        card.setTotalCost((card.getTotalCost()-totalDiscount)) ;
        boolean res = w.addCreditCard(card);
        Response response = new Response();
        if (!res) {
            response.setStatus(false);
            response.setMessage("There is no enough money!");
            return response;
        }
        card.setBalance(card.getBalance()-card.getTotalCost());
        response.setStatus(true);
        response.setMessage("The total cost: " + card.getTotalCost());
        response.object = card;
        return response;
    }
	@GetMapping("/getPaymentTransaction")
    public WayOfPayment[] getAllWayOfPayment() {
        return w.getAllWayOfPayment();
    }
	
	@GetMapping("/getWalletTransaction")
    public Wallet[] getWalletTransaction() {
        return w.getWalletTransaction();
    }
}
