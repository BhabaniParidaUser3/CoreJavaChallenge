package day9ATMMachineProject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ATMOperationImplementation implements ATMOperationsInterface {
	ATM atm = new ATM();
	List<String> minist = new ArrayList<>();
	
	private User user;
	public ATMOperationImplementation(User user)
	{
		this.user=user;
	}

	@Override
	public void viewBalance() {
		System.out.println("Available Balance is : " + atm.getBalance()+"\n");

	}

	@Override
	public void depositAmount(double depositAmount) {
		System.out.println(depositAmount + " Deposited successfully");
		atm.setBalance(atm.getBalance() + depositAmount);
		String entry=LocalDateTime.now()+" - "+depositAmount+" Deosited\n";
		minist.add(entry);
		viewBalance();

	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount % 100==0  || withdrawAmount % 500==0)
		{
			if (withdrawAmount <= atm.getBalance()) {
				System.out.println("Collect the cash" + withdrawAmount);
				atm.setBalance(atm.getBalance() - withdrawAmount);
				String entry=LocalDateTime.now()+" - "+withdrawAmount+" Withdrawn\n";
				minist.add(entry);			
				viewBalance();
			} else {
				System.out.println("Insufficient Balance!!!");
			}
			
		}
		else
		{
			System.out.println("Please enter the amount in multiples of 100 and 500\n");
		}
		

	}

	@Override
	public void viewMiniStatement() {
		if(minist.isEmpty())
		{
			System.out.println("No Transaction Record ");
		}
		else
		{
			for (String statement : minist) {
				System.out.println(statement);
			}
		}

		
	}

}
