package sw2_phase1;

import java.util.Scanner;

public class userRequest {
	check c;
	public void setcheck(check c) {
		this.c=c;
	}
	public void paymentDiscout () {
		admin a = new admin();
		admin b = new admin ();
		a.setDiscountValue(0.1);
		b.setDiscountValue(0.2);
		wayOfPayment way=new creditcard();
		way.setcost(500.0);
		Cost c = new paymentWithoutDiscount(way);
		c = new overallDiscount(a,(new specificDiscount(b,c)));
		System.out.println(c.cost());
	}
	public void askForRefund(String ServiceName) {
	
		Storage s = new Storage();
		RefundController d = new RefundController(s);
		d.addRefund(ServiceName);
		
	}
	public void checkDiscount(admin a) {
		if((a.getDiscountValue())==0) {
			System.out.println("there is no discount");
		}
		else {
			System.out.println("there is discount its value " + (a.getDiscountValue()));
		}
	}
	public void addAmount(double amount) {
		if(c.checkBalance(amount)) {
			System.out.println("Successfully added");
		}else {
			System.out.println("Cant be added please enter anouther amount less than the balance");
		}
	}
	public void chooseService() {
		Donators d = new Donators();
		MobilerechargeUser mru = new MobilerechargeUser();
		InternetUser lu = new InternetUser();
		LandlineUser landuser = new LandlineUser();
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Service Provider options");
		System.out.println("1. Mobile recharge services We");
		System.out.println("2. Mobile recharge services Vodafone");
		System.out.println("3. Mobile recharge services Orange");
		System.out.println("4. Mobile recharge services Etisalat");
		System.out.println("5. Internet Payment services We");
		System.out.println("6. Internet Payment services Vodafone");
		System.out.println("7. Internet Payment services Orange");
		System.out.println("8. Internet Payment services Etisalat");
		System.out.println("9. Landline services Monthly receipt");
		System.out.println("10. Landline services Quarter receipt");
		System.out.println("11. Donations Cancer Hospital");
		System.out.println("12. Donations Schools");
		System.out.println("13. Donations NGOs");
		
		System.out.println("Enter your choice");
		int choice = myObj.nextInt();
		
		System.out.println("Enter Amount");
		double amount = myObj.nextDouble();
		
		System.out.println("Enter Mobile num");
		String Mobile_num = myObj.nextLine();
		Mobile_num = myObj.nextLine();
		
		if(choice == 1) {
			mobileRecharge mr = mru.getservice("We");
			mr.servicename();
			mr.servicform(amount, Mobile_num);
		}else if(choice == 2) {
			mobileRecharge mr = mru.getservice("Vodafone");
			mr.servicename();
			mr.servicform(amount, Mobile_num);
		}else if(choice == 3) {
			mobileRecharge mr = mru.getservice("Orange");
			mr.servicename();
			mr.servicform(amount, Mobile_num);
		}else if(choice == 4) {
			mobileRecharge mr = mru.getservice("Etisalat");
			mr.servicename();
			mr.servicform(amount, Mobile_num);
		}else if(choice == 5) {
			internetPayment l = lu.getservice("We");
			l.servicename();
			l.servicform(amount, Mobile_num);
		}else if(choice == 6) {
			internetPayment l = lu.getservice("Vodafone");
			l.servicename();
			l.servicform(amount, Mobile_num);
		}else if(choice == 7) {
			internetPayment l = lu.getservice("Orange");
			l.servicename();
			l.servicform(amount, Mobile_num);
		}else if(choice == 8) {
			internetPayment l = lu.getservice("Etisalat");
			l.servicename();
			l.servicform(amount, Mobile_num);
		}else if(choice == 9) {
			Landline land = landuser.getservice("Monthlyreceipt");
			land.servicename();
			land.servicform(amount, Mobile_num);
		}else if(choice == 10) {
			Landline land = landuser.getservice("QuarterReceipt");
			land.servicename();
			land.servicform(amount, Mobile_num);
		}else if(choice == 11) {
			donations donation = d.getservice("CancerHospital");
			donation.servicename();
			donation.servicform(amount, Mobile_num);
		}else if(choice == 12) {
			donations donation = d.getservice("DSchools");
			donation.servicename();
			donation.servicform(amount, Mobile_num);
		}else if(choice == 13) {
			donations donation = d.getservice("NGO");
			donation.servicename();
			donation.servicform(amount, Mobile_num);
		}
		
	}

}
