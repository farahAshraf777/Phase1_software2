package sw2_phase1;

public abstract class discount extends Cost{
	Cost c ;
	public discount(Cost c) {
		this.c = c ;
	}
	public abstract double cost();

}
