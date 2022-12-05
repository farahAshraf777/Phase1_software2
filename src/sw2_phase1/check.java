package sw2_phase1;

import java.util.Map;

public class check {
	wallet w;
	Storage s;
	public check(Storage s, wallet w) {
		this.s = s;
		this.w = w;
	}

	public String CheckAccount(String Email) {
		String str="False";
		for (String i : (s.getMap()).keySet()) {
		      if(i.equals(Email) ) {
		      	 str="true";
		      }
		    }
		return str;
	}
	public boolean checkBalance(double amount) {
		if((amount + w.getAmount()) > w.getbalance()) {
			return false;
			
		}
		return true;	
	}
	

}
