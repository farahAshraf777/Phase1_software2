package sw2_phase1;

import java.util.Map;

public class Accountuser implements account{
	userForm uf;
	public Accountuser(userForm uf) {

		this.uf=uf;

		}

	public void signUp(String sUp) {
		uf.createForm(sUp);
	}

	
	public void signin(String sIn) {
		uf.createForm(sIn);
	}

	
}
