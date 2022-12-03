package sw2_phase1;

public class internetPayment extends service{
	provider p ;
	public internetPayment(provider p) {
		this.p= p;
	}
	public void internetPaymentForm(double Cost , String amout) {
		p.ProviderForm(Cost, amout);
	}
	
}
