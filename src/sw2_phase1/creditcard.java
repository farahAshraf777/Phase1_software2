package sw2_phase1;

public class creditcard extends wayOfPayment{
	double amount = 1000;
    String res;
	@Override
	public String pay() {
		if(getcost() > amount)
		{
			res = "There is no enough money";
		}
		else
		{
			res = "payment Done Successfully";
			amount = amount - getcost();
		}
		return res;
	}
}
