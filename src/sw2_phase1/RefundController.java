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
}
