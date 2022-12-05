package sw2_phase1;

public class accountadmin implements account {
	adminForm ad;
	public accountadmin(adminForm ad) {
		this.ad = ad;
	}
	@Override
	public void signUp(String sUp) {
		ad.createForm(sUp);
		
	}
	@Override
	public void signin(String sIn) {
		ad.createForm(sIn);
	}

}
