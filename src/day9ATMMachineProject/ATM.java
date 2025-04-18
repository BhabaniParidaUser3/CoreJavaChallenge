package day9ATMMachineProject;

public class ATM {

	private double balance;
	private double depositAmount;
	private double withdrawAmount;

	// default constructor
	public ATM() {

	}

	// getter setter
	public double getBalance() {
		return balance;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

}
