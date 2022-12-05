package sw2_phase1;

public class paymentWithoutDiscount extends Cost{
	wayOfPayment pay;
	public paymentWithoutDiscount(wayOfPayment pay) {
		this.pay =pay;

	}
	@Override
	public double cost() {
		return pay.getcost();
	}
	
}
