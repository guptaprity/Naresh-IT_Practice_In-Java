package com.prity.methodOverridingScenario;
import java.util.Scanner;
public class BankApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please select the Account Type :");
        System.out.println("        1) Saving Account");
        System.out.println("        2) Current Account");
        System.out.println("        3) Fixed Deposit Account");
        System.out.print("Please enter the type of account you want to open : [1/2/3] ");
        
        int choice = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter account Holder Name :");
        String name = sc.nextLine();
        System.out.print("Enter account Number :");
        String accNo = sc.nextLine();
        System.out.print("Enter the Amount :");
        double balance = sc.nextDouble();
        
        
        switch (choice) {
        case 1:
            SavingsAccount sa = new SavingsAccount(name, accNo, balance, balance);
            sa.displayAccountDetails();
            sa.calculateInterest();
            break;

        case 2:
            CurrentAccount ca = new CurrentAccount(name, accNo, balance, balance);
            ca.displayAccountDetails();
            ca.calculateInterest();
            ca.checkOverdraftLimit();
            break;

        case 3:
            System.out.print("Enter the deposit term [For How many years you want to deposit] :");
            int term = sc.nextInt();
            FixedDepositAccount fda = new FixedDepositAccount(name, accNo, balance, term, term);
            fda.displayAccountDetails();
            fda.calculateInterest();
            break;

        default:
            System.out.println("Invalid choice. Please select between 1, 2, or 3.");
    }

	}
	

}



class BankAccount{
	protected String accountHolderName;
	protected String accountNumber;
	protected double balance;
	
	public static final String IFSC_CODE = "SBIHYD151285";

	public BankAccount(String accountHolderName, String accountNumber, double balance) {
		super();
		if(accountHolderName==null) {
			System.out.println("Account holder name cannot be empty.");
			System.exit(0);
		}
		if(accountNumber ==null) {
			System.out.println("Account number cannot be empty.");
			System.exit(0);
		}
		if(balance < 0) {
			System.out.println("Balance cannot be negative.");
			System.exit(0);
		}
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void calculateInterest() {
		System.out.println("Generic bank interest calculation.");
	}
	
	public void displayAccountDetails() {
		System.out.println(" Enter account Holder Name :"+ accountHolderName);
		System.out.println(" Enter account Number :"+ accountNumber);
		System.out.println(" Balance RS :"+ balance);
		System.out.println("   IFSC CODE :"+ IFSC_CODE);
	}
}
//SavingsAccount

class SavingsAccount extends BankAccount{
	protected double interestRate = 4.0;

	public SavingsAccount(String accountHolderName, String accountNumber, double balance, double interestRate) {
		super(accountHolderName, accountNumber, balance);
		//this.interestRate = interestRate;
	}
	
    @Override

	public void calculateInterest() {
		double interest = (balance * interestRate) / 100;
        System.out.println("Savings Account Interest RS :" + interest);
	}
}

class CurrentAccount extends BankAccount{
	protected double overdraftLimit = 5000.0;

	public CurrentAccount(String accountHolderName, String accountNumber, double balance, double overdraftLimit) {
		super(accountHolderName, accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}
    @Override

	  public void calculateInterest() {
	        System.out.println("Current accounts do not earn interest.");
	    }

	    public void checkOverdraftLimit() {
	        System.out.println("Overdraft limit RS :" + overdraftLimit);
	    }
}
class FixedDepositAccount extends BankAccount{
	protected double interestRate = 6.5;
	protected int depositTerm;
	public FixedDepositAccount(String accountHolderName, String accountNumber, double balance, double interestRate,
			int depositTerm) {
		super(accountHolderName, accountNumber, balance);
		if(depositTerm < 0) {
			System.out.println("depositTerm can't be negative.");
			System.exit(0);
		}
		
		this.depositTerm = depositTerm;
	}
	
	   @Override
	    public void calculateInterest() {
	        double interest = (balance * interestRate * depositTerm) / 100;
	        System.out.println("Fixed Deposit Interest for " + depositTerm + " years RS :" + interest);
	    }
	
}
