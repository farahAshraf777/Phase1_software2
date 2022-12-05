package sw2_phase1;

public abstract class wayOfPayment {
	double cost ;
	public void setcost(double cost) {
		this.cost=cost;
	}
	public double getcost() {
		return cost;
	}
	public abstract String pay();
}
