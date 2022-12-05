package sw2_phase1;

import java.util.Scanner;

public class adminForm implements form{

	admin a;
	public adminForm(admin a)
	{
		this.a = a;
	}
		@Override
		public void createForm() {
			
	Scanner myObj = new Scanner(System.in);
			
			System.out.println("Enter adminName");
			String adminName = myObj.nextLine();
			a.setadminName(adminName);
			
			System.out.println("Enter enmail");
			String Email = myObj.nextLine();
			a.setEmail(Email);
			
			System.out.println("Enter password");
			String pass = myObj.nextLine();
			a.setpassword(pass);
		}
}
