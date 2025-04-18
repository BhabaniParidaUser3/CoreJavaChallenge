package day9ATMMachineProject;

import java.util.Scanner;

public class ATMMainClass {

	public static void main(String[] args) {
		ATMOperationImplementation AOI = new ATMOperationImplementation();
		Scanner sc = new Scanner(System.in);

		int atmnumber = 12345;
		int atmpin = 8895;
		System.out.println("Welcome To ATM Machine !\n");
		System.out.println("Enter ATM Number: ");
		int atmcardnumber = sc.nextInt();
		System.out.println("Enter ATM Pin: ");
		int atmpinnumber = sc.nextInt();
		if ((atmcardnumber == atmnumber) && (atmpinnumber == atmpin)) {
			while (true) {
				System.out.println(
						"1.Check available balance\n2.Withdraw amount\n3.Deposit Amount\n4.View MiniStatement\n5.Exit\nEnter your choice");
				int input = sc.nextInt();
				if (input == 1) {
					AOI.viewBlance();
				} else if (input == 2) {
					System.out.println("Enter Amount to Withdraw: ");
					double withdrawAmount = sc.nextDouble();
					AOI.withdrawAmount(withdrawAmount);

				} else if (input == 3) {
					System.out.println("Enter Amount to Deposit: ");
					double DepositedAmount = sc.nextDouble();
					AOI.depositAmount(DepositedAmount);

				} else if (input == 4) {
					AOI.viewMiniStatement();
				} else if (input == 5) {
					System.out.println("Collect your ATM Card\nThank you for choosing our ATM Machine");
					System.exit(0);

				} else {
					System.out.println("Enter correct choice");
				}
			}
		} else {
			System.out.println("Incorrect ATM number or ATM pin !!!");
		}

	}

}
