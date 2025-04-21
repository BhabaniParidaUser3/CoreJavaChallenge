package day9ATMMachineProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATMMainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Map<Integer,User> userDatabase=new HashMap<>();
		userDatabase.put(12345, new User(12345,11111));
		userDatabase.put(56789, new User(56789,22222));
				
		
		boolean keeprunning = true;
		
		int maxAttempts = 3;
		int attempts = 0;
		boolean authenticated = false;
		User currentUser = null;
		System.out.println("Welcome To ATM Machine !\n");
		while (attempts < maxAttempts) {
			
			System.out.println("Enter ATM Number: ");
			int enteredAtmcardnumber = sc.nextInt();
			System.out.println("Enter ATM Pin: ");
			int enteredAtmpinnumber = sc.nextInt();
			
			User currentuser=userDatabase.get(enteredAtmcardnumber);
			if (currentuser != null && currentuser.getatmPin()==enteredAtmpinnumber) {
				authenticated = true;
		        break;
			} else {
		        attempts++;
		        System.out.println("Incorrect ATM Number or PIN! Attempts left: " + (maxAttempts - attempts));
		    }

			
		}
		
		if (authenticated) {
		    System.out.println("Login successful!\n");
			ATMOperationImplementation AOI = new ATMOperationImplementation(currentUser);

			while (keeprunning) {
				System.out.println(
						"1.Check available balance\n2.Withdraw amount\n3.Deposit Amount\n4.View MiniStatement\n5.Exit\nEnter your choice");
				int input = sc.nextInt();
				switch (input) {
				case 1:
					AOI.viewBalance();
					break;
				case 2:
					System.out.println("Enter Amount to Withdraw: ");
					double withdrawAmount = sc.nextDouble();
					AOI.withdrawAmount(withdrawAmount);
					break;
				case 3:
					System.out.println("Enter Amount to Deposit: ");
					double DepositedAmount = sc.nextDouble();
					AOI.depositAmount(DepositedAmount);
					break;
				case 4:
					AOI.viewMiniStatement();
					break;
				case 5:
					System.out.println("Collect your ATM Card\nThank you for choosing our ATM Machine");
					keeprunning = false;
					break;

				default:
					System.out.println("Enter correct choice");
					break;

				}

			}
		} else {
			System.out.println("Too many incorrect attempts. Your account has been locked. Please contact the bank.");
		}

	}

}
