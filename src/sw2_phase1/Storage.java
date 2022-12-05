package sw2_phase1;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;


//database only stores data we need 

public class Storage {
	 
	 Vector<String> refundRequest =new Vector<String>();
	 
	 public void  setRefund (String RefundReq) {
		 refundRequest.add(RefundReq);
	 }
	 
	 public Vector<String> getRefunReq(){
		return refundRequest;
		 
	 }
	 
	 
	 
	 
	 Map<String, String> Users = new HashMap<String, String>();
	 
	 public void setUserName_password(String Email, String password) {
		 Users.put(Email, password);
	 }
	 public  Map<String, String> getMap() {
		 return Users;
	 }
	 
	 
	 
	 Vector<String> servicName=new Vector<String>();
	 public void servicename() {
		 servicName.add("Mobile recharge services");
		 servicName.add("Internet Payment services");
		 servicName.add("Landline services");
		 servicName.add("Donations");

	 }
	 public  Vector<String> getservicename() {
		 return servicName;
	 }
}
