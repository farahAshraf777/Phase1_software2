package sw2_phase1;

public class Donators implements user{
	public donations getservice(String name) {
		if(name.equalsIgnoreCase("NGO")){
	         return new NGO();
	         
	      } 
		else if(name.equalsIgnoreCase("CancerHospital")){
	         return new CancerHospital();
	         
	      } 
		else if(name.equalsIgnoreCase("DSchools")){
	         return new DSchools();
	      }
		
	      return null;
	}
}
