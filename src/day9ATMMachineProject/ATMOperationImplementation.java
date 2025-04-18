package day9ATMMachineProject;

import java.util.HashMap;
import java.util.Map;

public class ATMOperationImplementation implements ATMOpearationsInterface {
	ATM atm = new ATM();
	Map<Double, String> minist = new HashMap<>();

	@Override
	public void viewBlance() {
		System.out.println("Available Balance is : " + atm.getBalance());

	}

	@Override
	public void depositAmount(double depositAmount) {
		System.out.println(depositAmount + " Deposited successfully");
		atm.setBalance(atm.getBalance() + depositAmount);
		minist.put(depositAmount, " Deposit Amount");
		viewBlance();

	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if (withdrawAmount <= atm.getBalance()) {
			System.out.println("Collect the cash" + withdrawAmount);
			atm.setBalance(atm.getBalance() - withdrawAmount);
			minist.put(withdrawAmount, " WithDrawn Amount");
			viewBlance();
		} else {
			System.out.println("Insufficient Balance!!!");
		}

	}

	@Override
	public void viewMiniStatement() {
		for (Map.Entry<Double, String> m : minist.entrySet()) {
			System.out.println(m.getKey() + "" + m.getValue());
		}
	}

}
