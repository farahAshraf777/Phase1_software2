package sw2_phase1;

public class Donators extends user{

	//service s = new donation();
	@Override
	 public service creatService(String typeOfService) {
	
			if(typeOfService=="NGO") {
				return new NGO();
			}
			else if(typeOfService=="school") {
				return new DSchools();
			}
			else if(typeOfService=="CancerHospital") {
				return new CancerHospital();
			}
			
			return null;
		
	
	}

	

}
