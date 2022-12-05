package sw2_phase1;

public class payment {
	
	wayOfPayment pay;
	public  payment(wayOfPayment pay) {
		this.pay=pay;
	}	
	public String pay() {
		return (pay.pay());
	}

}
