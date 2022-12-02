package sw2_phase1;

public class accountuser implements account {
	userForm uf;

	public accountuser(userForm uf) {
		this.uf = uf;
	}

	public void signUp() {
		uf.createForm();
	}

	@Override
	public void signin() {
		// TODO Auto-generated method stub
		uf.createForm();
	}

}
