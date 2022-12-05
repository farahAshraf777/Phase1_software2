package sw2_phase1;

import java.util.Vector;

public class admin {
	double value;
	Storage s ;
	public void setStorage(Storage s) {
		this.s = s;
	}

	public Vector<String> getlistOfRefund() {
		 return s.getRefunReq();
	}
	
	public void setDiscountValue(double value) {
		this.value=value;
	}
	public double getDiscountValue() {
		return value;
	}
}
