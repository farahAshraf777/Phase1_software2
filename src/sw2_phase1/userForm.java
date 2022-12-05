package sw2_phase1;

import java.util.Scanner;

public class userForm implements form{
	Storage s;
	check check;
	public userForm(Storage s, check check) {
		this.s = s;
		this.check = check;
	}

	@Override
	public void createForm(String sign) {
		Scanner myObj = new Scanner(System.in);
		if (sign == "sign up") {
			System.out.println("Enter username");
			String userName = myObj.nextLine();
			
			System.out.println("Enter enmail");
			String Email = myObj.nextLine();
			
			System.out.println("Enter password");
			String pass = myObj.nextLine();
			
			if(((check.CheckAccount(Email)) == "true")) {
				System.out.println("Error, this account is already exist");
			}
			else if(((check.CheckAccount(Email)) == "False")) {
				s.setUserName_password(Email, pass);
				System.out.println("your account created successfully");

			}
		}
		else {
			
			System.out.println("Enter enmail");
			String Email = myObj.nextLine();
			System.out.println("Enter password");
			String pass = myObj.nextLine();
			
			if( ((check.CheckAccount(Email)) == "true")) {
				System.out.println("Hello " + Email);
			}
			else if(((check.CheckAccount(Email)) == "False")) {
				System.out.println("Error, this account is not exist you should sign up first");
			}
			
		}
		
		
		
		
		
	}

}
