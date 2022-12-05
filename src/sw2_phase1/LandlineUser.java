package sw2_phase1;

public class LandlineUser implements user{
	public Landline getservice(String name) {
		if(name.equalsIgnoreCase("QuarterReceipt")){
	         return new QuarterReceipt();
	         
	      } 
		else if(name.equalsIgnoreCase("Monthlyreceipt")){
	         return new Monthlyreceipt();
	         
	      } 
	      return null;
	
	}

}
