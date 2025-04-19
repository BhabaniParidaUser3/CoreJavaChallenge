package day9ATMMachineProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATMMainClass {

	public static void main(String[] args) {
		
		Map<Integer,User> userDatabase=new HashMap<>();
		userDatabase.put(12345, new User(12345,11111));
		userDatabase.put(56789, new User(56789,22222));
				
		
		Scanner sc = new Scanner(System.in);
		boolean keeprunning = true;

		/*
		 * int atmnumber = 12345; int atmpin = 8895;
		 */
		System.out.println("Welcome To ATM Machine !\n");
		System.out.println("Enter ATM Number: ");
		int enteredAtmcardnumber = sc.nextInt();
		System.out.println("Enter ATM Pin: ");
		int enteredAtmpinnumber = sc.nextInt();
		
		User currentuser=userDatabase.get(enteredAtmcardnumber);
		if (currentuser != null && currentuser.getatmPin()==enteredAtmpinnumber) {
			ATMOperationImplementation AOI = new ATMOperationImplementation(currentuser);

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
			System.out.println("Incorrect ATM number or ATM pin !!!");
		}

	}

}
