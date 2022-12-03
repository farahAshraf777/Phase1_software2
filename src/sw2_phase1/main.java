package sw2_phase1;

public class main {

	public static void main(String[] args) {
//		double b = 500;
//		double c = 0.5;
//		payment p = new paymentWithoutDiscount(b);
//		p = new overallDiscount(p, c);
//		System.out.println(p.Cost());
//		
	//	donations s = new NGO();
		//s.donationForm(30, "011000297866");
		user s = new LandlineUser();
		//s.creatService("QuarterReceipt");
		service g = s.creatService("QuarterReceipt"); 
		g.landlineForm(30.0,"09876898676");
		//service g = new NGO();
		
	}

}
