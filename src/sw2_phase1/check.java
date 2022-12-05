package sw2_phase1;

import java.util.Map;

public class check {
	Storage s;
	public check(Storage s) {
		this.s=s;
	}

	public String CheckAccount(String Email) {
		String str="False";
		for (String i : (s.getMap()).keySet()) {
		      if(i == Email) {
		      	 str="true";
		      }
		    }
		return str;
	}
	

}
