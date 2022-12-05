package sw2_phase1;

import java.util.Vector;
public class serviceController {
	Storage s;
	public serviceController(Storage s) {
		this.s=s;
	}

	public String search(String ServiceNam){
		String str="Not Found!";
		for(int i=0;i<((s.getservicename()).size());i++) {
			if(ServiceNam==(s.getservicename()).get(i)) {
				return ServiceNam;
			}
		}
		return str;
	}

}
