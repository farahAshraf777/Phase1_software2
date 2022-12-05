package sw2_phase1;

import java.util.Map;
import java.util.Scanner;

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
//		user s = new LandlineUser();
		//s.creatService("QuarterReceipt");
//		service g = s.creatService("QuarterReceipt"); 
//		g.landlineForm(30.0,"09876898676");
//		Donators d = new Donators(); 
//		d.creatService("NGO");
//		donations n = new NGO();
//		n.donationForm(30.3, "09876898676");
		
//		wayOfPayment x = new creditcard();
//		payment y = new paymentWithoutDiscount(2.00,x);
//		y.p(200);
		
//		Storage s = new Storage();
//		userForm uf = new userForm(s);
//		account ac = new Accountuser(uf);
//		ac.signUp();
//		s.getMap();
//		Storage s = new Storage();
//		check c = new check(s);
//		userForm uf = new userForm(s, c);
//		account ac = new Accountuser(uf);
//		ac.signUp("sign up");
//		
//		ac.signUp("sign in");
//		s.getMap();
//		Storage s = new Storage();
//		wallet  w = new wallet();
//		check c = new check(s, w);
//		userRequest d = new userRequest();
//		d.setcheck(c);
//		d.addAmount(5000);
		
//		Donators u = new Donators();
//		donations d = u.getservice("NGO");
//		d.servicename();
//		d.servicform(200.00, "5465655");
//		InternetUser lu = new InternetUser();
//		internetPayment l = lu.getservice("We");
//		l.servicename();
//		l.servicform(20.33, "09876898676");

		/*Storage s=new Storage();
		serviceController d=new serviceController(s);
		s.servicename();
		System.out.println(d.search("Donaons"));*/
		
//		check ch =new check(s);
//		userForm user = new userForm(s,ch);
//		Accountuser account =new Accountuser(user);
//		account.signUp("sign up");
//		account.signUp("sign up");
//		account.signin("sign in");

//		account.signUp("sign up");
//		for (Map.Entry<String, String> me :
//			(s.getMap()).entrySet()) {
// 
//           // Printing keys
//           System.out.print(me.getKey() + ":");
//           System.out.println(me.getValue());
//           
//       }
//		for (Map.Entry<String, String> me :
//			(s.getMap()).entrySet()) {
// 
//           // Printing keys
//           System.out.print(me.getKey() + ":");
//           System.out.println(me.getValue());
//       }
////	
//		admin a = new admin();
//		admin b = new admin ();
//		a.setDiscountValue(0.1);
//		b.setDiscountValue(0.1);
//		wayOfPayment way=new creditcard();
//		way.setcost(500.0);
//		Cost c = new paymentWithoutDiscount(way);
//		c = new overallDiscount(a,(new specificDiscount(b,c)));
//		System.out.println(c.cost());
		//Cost a = new overallDisc
		
		//userRequest s = new userRequest();
		//s.paymentDiscout();
		
		//wayOfPayment way=new creditcard();
		//way.setcost(300.0);
		//payment p=new payment(way);
		//System.out.println(p.pay());
//		
//		Storage s = new Storage();
//		RefundController d = new RefundController(s);
//		d.addRefund("hahahahahahahah");
//		d.addRefund("rawdaa and hannen and walaa");
//		
		//userRequest s = new userRequest();
		//s.askForRefund();
		//service g = new NGO();
		
		//double value = 0.0 ;
//		admin d = new admin();
		//Scanner myObj = new Scanner(System.in);
		//System.out.println("Enter username");
		//double value = myObj.ne();
//		userRequest s = new userRequest();
//		s.checkDiscount(0);
		
		admin s = new admin();
		adminForm f = new adminForm(s);
		accountadmin d = new accountadmin(f);
		d.signUp("sign up");
		
	}

}
