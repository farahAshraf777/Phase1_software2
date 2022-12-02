package sw2_phase1;

public class wallet implements wayOfPayment{
	int amount = 1000;
    String res;
	@Override
	public String pay(int cost) {
		// TODO Auto-generated method stub
		if(cost > amount)
		{
			res = "There is no enough money";
		}
		else
		{
			res = "Done";
			amount = amount - cost;
		}
		return res;
	}
}


