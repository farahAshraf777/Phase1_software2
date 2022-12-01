package sw2_phase1;

public class main {

	public static void main(String[] args) {
		double b = 500;
		double c = 0.5;
		payment p = new paymentWithoutDiscount(b);
		p = new overallDiscount(p, c);
		System.out.println(p.Cost());
		
	}

}
