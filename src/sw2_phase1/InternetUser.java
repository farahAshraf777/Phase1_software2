package sw2_phase1;

public class InternetUser implements user {
	public internetPayment getservice(String name) {
		if(name.equalsIgnoreCase("Vodafone")){
	         return new InternetPaymentVodafone();
	         
	      } 
		else if(name.equalsIgnoreCase("Orange")){
	         return new InternetPaymentOrange();
	         
	      } 
		else if(name.equalsIgnoreCase("We")){
	         return new InternetPaymentWe();
	      }
		else if(name.equalsIgnoreCase("Etisalat")){
	         return new InternetPaymentEtisalat();
	      }
		
	      return null;
	}
}
