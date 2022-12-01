package sw2_phase1;

public class overallDiscount extends discount {
	payment p;
	double c;
	public overallDiscount(payment p, double c) {
		this.p = p;
		this.c = c;
	}
	@Override
	public double Cost() {
		return ((p.Cost())*c);
	}

}
