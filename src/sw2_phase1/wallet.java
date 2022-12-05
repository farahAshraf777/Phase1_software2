package sw2_phase1;

public class wallet extends wayOfPayment{
	double balance = 4000;
	double amount = 0;
    String res;
	@Override
	//cant pay with wallet without put an amount in wallet
	public String pay() {
		if(getcost() > amount)
		{
			res = "There is no enough money";
		}
		else
		{
			res = "payment Done Successfully";
			amount = amount - (getcost());
		}
		return res;
	}
	public void setAmount(double amount) {
		this.amount += amount;
	}
	public double getAmount() {
		return amount;
	}
	public double getbalance() {
		return balance;
	}
}
