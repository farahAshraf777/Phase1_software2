package sw2_phase1;

import java.util.Map;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//Admin should enter first to set discount and amounts we need
		int Admin_choice = 0;
		double Discount_value;
		Storage DataBase = new Storage();
		RefundController RefundC = new RefundController(DataBase);
		admin adminObj = new admin();
		adminForm FORM = new adminForm(adminObj);
		accountadmin Ac_Ad = new accountadmin(FORM);
		Scanner myObj = new Scanner(System.in);
		while(Admin_choice != 5) {
			System.out.println("Admin Options");
			System.out.println("1. Sign up");
			System.out.println("2. Sign in");
			System.out.println("3. Add discount amount");
			System.out.println("4. Show refund requests to accept it or reject it");
			System.out.println("5. Exit");
			System.out.println("Enter your choice For example 2 to sign in");
			int choice = myObj.nextInt();
			Admin_choice = choice;
			
			if(Admin_choice == 1) {
				Ac_Ad.signUp("sign up");
			}else if(Admin_choice == 2) {
				Ac_Ad.signUp("sign in");
			}else if(Admin_choice == 3) {
				System.out.print("Enter discount value: ");
				Discount_value = myObj.nextDouble();
				adminObj.setDiscountValue(Discount_value);
			}else if(Admin_choice == 4) {
				System.out.println(DataBase.getRefunReq());
				RefundC.checkRefundValidation();
				
			}else if(Admin_choice == 5) {
				System.out.println("Exit");
			}
			System.out.println("");
		}
		// user enter to the system and choose from options
		int User_choice = 0;
		wallet user_wallet = new wallet();
		check ch =new check(DataBase, user_wallet);
		userForm user = new userForm(DataBase, ch);
		Accountuser account =new Accountuser(user);
		userRequest request = new userRequest();
		serviceController sc = new serviceController(DataBase);

		while(User_choice != 9) {
			System.out.println("User Options");
			System.out.println("1. Sign up");
			System.out.println("2. Sign in");
			System.out.println("3. Choose Service Name");
			System.out.println("4. Ask for refund");
			System.out.println("5. Pay");
			System.out.println("6. Check For discount");
			System.out.println("7. Search for a service");
			System.out.println("8. Add to wallet");
			System.out.println("9. Exit");
			System.out.println("Enter your choice For example 2 to sign in");
			
			int choice = myObj.nextInt();
			User_choice = choice;
			
			if(User_choice == 1) {
				account.signUp("sign up");
			}else if(User_choice == 2) {
				account.signin("sign in");
			}else if(User_choice == 3) {
				request.chooseService();
			}
			else if(User_choice == 4) {
				System.out.println("Enter Service name for refund");
				String Service_name = myObj.nextLine();
				Service_name = myObj.nextLine();
				request.askForRefund(Service_name);
			}else if(User_choice == 5) {
				request.paymentDiscout();
			}else if(User_choice == 6) {
				request.checkDiscount(adminObj);
			}else if(User_choice == 7) {
				System.out.println("Enter Service name");
				String Service_name = myObj.nextLine();
				Service_name = myObj.nextLine();
				sc.search(Service_name);
			}else if(User_choice == 8) {
				System.out.print("Enter amount to be adder to wallet: ");
				double Wallet_amount = myObj.nextDouble();
				request.setcheck(ch);
				request.addAmount(Wallet_amount);

			}else if(User_choice == 9) {
				System.out.println("Exit");
			}
			System.out.println("");
		}
		myObj.close();
	}
	
}
