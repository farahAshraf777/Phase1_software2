package sw2_phase1;

public class overallDiscount extends discount {
	admin discountvalue;
	//wayOfPayment pay;
	public overallDiscount(admin discountvalue ,Cost c) {
		super(c);
		this.discountvalue=discountvalue;
		//this.pay =pay;
	}
	@Override
	public double cost() {
		return Math.abs((c.cost())*(discountvalue.getDiscountValue())-c.cost());
	}
}
