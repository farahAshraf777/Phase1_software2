package sw2_phase1;

public class specificDiscount extends discount {
	payment p;
	double c;
	public specificDiscount(payment p, double c) {
		this.p = p;
		this.c = c;
	}
	@Override
	public double Cost() {
		return ((p.Cost())*c);
	}
}
