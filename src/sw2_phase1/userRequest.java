package sw2_phase1;

public class userRequest {

public void paymentDiscout () {
	admin a = new admin();
	admin b = new admin ();
	a.setDiscountValue(0.1);
	b.setDiscountValue(0.1);
	wayOfPayment way=new creditcard();
	way.setcost(500.0);
	Cost c = new paymentWithoutDiscount(way);
	c = new overallDiscount(a,(new specificDiscount(b,c)));
	System.out.println(c.cost());
}
public void askForRefund() {

	Storage s = new Storage();
	RefundController d = new RefundController(s);
	d.addRefund("hahahahahahahah");
	d.addRefund("rawdaa and hannen and walaa");
	
}
public void checkDiscount(double discoutValue) {
	if(discoutValue==0) {
		System.out.println("there is no discount");
	}
	else {
		System.out.println("there is discount its value " + discoutValue);
	}
}
}
