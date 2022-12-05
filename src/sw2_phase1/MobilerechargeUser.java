package sw2_phase1;

public class MobilerechargeUser implements user {

	public mobileRecharge getservice(String name) {
		if(name.equalsIgnoreCase("Vodafone")){
	         return new MobileRechargeVodafone();
	         
	      } 
		else if(name.equalsIgnoreCase("Orange")){
	         return new MobileRechargeOrange();
	         
	      } 
		else if(name.equalsIgnoreCase("We")){
	         return new MobileRechargeWe();
	      }
		else if(name.equalsIgnoreCase("Etisalat")){
	         return new MobileRechargeEtisalat();
	      }
		
	      return null;
	}

}
