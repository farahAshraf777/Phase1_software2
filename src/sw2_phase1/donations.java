package sw2_phase1;

public abstract class donations implements service {
	public abstract void servicename();
	public void servicform(double cost, String mobileNum) {
		System.out.println(cost);
		System.out.println(mobileNum);
	}
	
}