package codesoft.internship;

public class AccountBalance {
	private double balance;
	
	public AccountBalance() {
		
	}

	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "AccountBalance [balance=" + balance + "]";
	}
	
}
