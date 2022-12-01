package sw2_phase1;

public class paymentWithoutDiscount extends payment{
	public double c;
	public paymentWithoutDiscount(double c) {
		this.c = c;
	}
	@Override
	public double Cost() {
		return c;
	}
	
}
