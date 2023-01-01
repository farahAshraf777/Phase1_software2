package com.Phase2.software2.paymentService.refund;
import static com.Phase2.software2.paymentService.payment.WayOfPaymentStorage.wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Phase2.software2.paymentService.checksRequests.Response;
import com.Phase2.software2.paymentService.payment.Wallet;
@RestController
@RequestMapping(value = "/refund")
public class RefundController {
	@Autowired
	RefundStroge RS = new RefundStroge();
	
	@PostMapping(value = "/askForRfund")
    public Response askForRfund(@RequestBody Refund r) {
        boolean res = RS.addRefund(r);
        Response response = new Response();

        response.setStatus(true);
        response.setMessage("your request is in waiting list");
        response.object = r;
        return response;
    }
	
	@PostMapping(value = "/admin/refundStatus")
    public Response refundStatus(@RequestBody Refund r) {
        boolean res = RS.addRefundStatus(r);
        Response response = new Response();
        response.setStatus(true);
        response.setMessage("The refund state : "+r.getRefundState());
        if((r.getRefundState()).equals("accept")) {
        	(RS.getRefunReq(r.getUserEmail())).setRefundState("accept");
        	Wallet w = wallet.get(r.getUserEmail());
        	w.setWalletMoney((w.getTotalCost())+(w.getWalletMoney()));
        }else
        	(RS.getRefunReq(r.getUserEmail())).setRefundState("reject");
        response.object = r;
        return response;
    }
	
    @GetMapping("/allrefundRequests")
    public Refund[] getAllRefundRequests() {
        return RS.getAllrefundRequest();
    }
    
    @GetMapping("/allRefundState")
    public Refund[] getAllRefundState() {
        return RS.getAllrefundState();
    }

}
