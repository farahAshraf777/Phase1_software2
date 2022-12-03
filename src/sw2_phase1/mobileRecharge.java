package sw2_phase1;

public class mobileRecharge extends service{
	provider p ;
	public mobileRecharge(provider p) {
		this.p= p;
	}
	public void mobileRechargeForm(double Cost , String amout) {
		p.ProviderForm(Cost, amout);
	}
	
}
