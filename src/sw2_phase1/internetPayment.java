package sw2_phase1;

public abstract class internetPayment implements service{
	public abstract void servicename();
	public void servicform(double cost, String mobileNum) {
		System.out.println(cost);
		System.out.println(mobileNum);
	}
	
}
