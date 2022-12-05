package sw2_phase1;

public class accountadmin implements account {
	adminForm ad;
	public accountadmin(adminForm ad) {
		this.ad = ad;
	}
	@Override
	public void signUp() {
		// TODO Auto-generated method stub
		ad.createForm();
	}

	@Override
	public void signin() {
		// TODO Auto-generated method stub
		ad.createForm();
	}

}
