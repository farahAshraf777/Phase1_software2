package sw2_phase1;

import java.util.Scanner;

public class adminForm implements form{
	admin a;
	public adminForm(admin a)
	{
		this.a = a;
	}
	@Override
	public void createForm(String sign) {
		Scanner myObj = new Scanner(System.in);
		if (sign == "sign up") {
			System.out.println("Enter admin name");
			String addminName = myObj.nextLine();
			
			System.out.println("Enter enmail");
			String Email = myObj.nextLine();
			
			System.out.println("Enter password");
			String pass = myObj.nextLine();
			System.out.print("Done "+ addminName);
			
		}
		else {
			
			System.out.println("Enter enmail");
			String Email = myObj.nextLine();
			System.out.println("Enter password");
			String pass = myObj.nextLine();
			System.out.print("hello "+ Email);
		}
	}
}
