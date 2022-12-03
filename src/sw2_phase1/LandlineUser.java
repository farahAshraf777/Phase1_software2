package sw2_phase1;

public class LandlineUser extends user {

	
	@Override
	public service creatService(String typeOfService) {
		if(typeOfService=="QuarterReceipt") {
			return new QuarterReceipt();
		}
		else if(typeOfService=="Monthlyreceipt") {
			return new Monthlyreceipt();
		}
		return null;
	}

}
