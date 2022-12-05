package sw2_phase1;

import java.util.Vector;

public class admin {
//	String adminName;
//	String Email;
//	String password;
	double value;
	Storage s ;
	public void setStorage(Storage s) {
		this.s = s;
	}

	public Vector<String> getlistOfRefund() {
		 return s.getRefunReq();
	}
	
	
//	public void setadminName(String adminName)
//	{
//		this.adminName = adminName;
//	}
//	
//	public void setEmail(String Email)
//	{
//		this.Email = Email;
//	}
//	
//	public void setpassword(String password)
//	{
//		this.password = password;
//	}
	public void setDiscountValue(double value) {
		this.value=value;
	}
	public double getDiscountValue() {
		return value;
	}
}
