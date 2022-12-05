package sw2_phase1;

public class RefundController {
	Storage s ; 
	public RefundController(Storage s ){
		this.s=s ;
	}
	
	public void addRefund(String refundReq) {
		s.setRefund(refundReq);
		System.out.println(s.getRefunReq());
	}
	// set refund state by admin
	public void checkRefundValidation() {
		for(int i=0;i<(s.getRefunReq()).size();i++) {
			if(i%2 == 0)
				s.setrefundstate("The refund is accepted");
			else
				s.setrefundstate("The refund is rejected");
		}
	}
}
