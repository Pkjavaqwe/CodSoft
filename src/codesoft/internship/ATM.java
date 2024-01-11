package codesoft.internship;

import java.util.Scanner;

public class ATM {
	
	AccountBalance balanceObject = new AccountBalance();

	public void atmInterface() {
		System.out.println("Choose");
		System.out.println("1: To check your Balance");
		System.out.println("2: To Deposit Amount to your Account Balance");
		System.out.println("3: To Withdraw Amount from your Bank Account");
		
		Scanner sc =new Scanner(System.in);
		int choice =sc.nextInt();
		
		switch( choice ) {
		
		case 1: 
			checkBalance();
			break;
		case 2:
			System.out.println("Enter amount to deposit");
			double amount=sc.nextDouble();
			depositAmount(amount);
			break;
		case 3:
			System.out.println("Enter amount to withdraw");
			double amount1=sc.nextDouble();
			withdrawAmount(amount1);
			break;	
			
		default :
			System.out.println("please enter valid choice from menu give below");
			atmInterface();
		}
	}
	
	private void withdrawAmount( double amount) {
        
		if(amount<=balanceObject.getBalance()) {
			balanceObject.setBalance(balanceObject.getBalance()-amount);
			
		    System.out.println("Rs "+amount +" withdrawn successfully" );
			System.out.println("your Accont Balance is "+ balanceObject.getBalance() );	atmInterface();
			
		}
		else {
			System.out.println("Insufficient Account Balance");
		}
	}

	private void depositAmount( double amount ) {
		
		
		
		balanceObject.setBalance(amount+balanceObject.getBalance());
		
	    System.out.println("Rs "+amount +" deposited successfully" );
		System.out.println("your Accont Balance is "+ balanceObject.getBalance() );
		atmInterface();
		
	}

	private void checkBalance() {
		
	System.out.println("Account Balance: "+ balanceObject.getBalance());
	atmInterface();
		
	}
	
	public static void main(String[] args) {
		ATM object = new ATM();
		object.atmInterface();
	}

	

}
