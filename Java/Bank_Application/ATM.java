package com.prity.Custom_Exception.Custom_Application;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            BankAccount acc1 = new BankAccount(1111, 60000);
            BankAccount acc2 = new BankAccount(2222, 3000);
            Customer customer1 = new Customer("Alice", acc1);
            Customer customer2 = new Customer("Bob", acc2);

            boolean exit = false;

            while (!exit) {
                System.out.println("\nSelect an option :");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Transfer");
                System.out.println("4. Loan Application");
                System.out.println("5. Check Balance");
                System.out.println("6. Exit");
                System.out.print("Enter your option: ");
                int option = sc.nextInt();
                if(option==6) {
                	System.out.println("Thank you for using the ATM. Goodbye!");
                	System.exit(0);
                }
                sc.nextLine(); // Consume newline

                System.out.print("Enter Customer name: ");
                String name = sc.nextLine().trim();

                Customer currentCustomer = null;
                if (name.equalsIgnoreCase(customer1.getName())) {
                    currentCustomer = customer1;
                } else if (name.equalsIgnoreCase(customer2.getName())) {
                    currentCustomer = customer2;
                }

                if (currentCustomer == null) {
                    System.out.println("Customer not found!");
                    continue;
                }
                   
               
                BankAccount account = currentCustomer.getAccount();

                try {
                    switch (option) {
                        case 1:
                            System.out.print("Enter amount to deposit: ");
                            double depositAmt = sc.nextDouble();
                            account.deposit(depositAmt);
                            break;
                        case 2:
                            System.out.print("Enter amount to withdraw: ");
                            double withdrawAmt = sc.nextDouble();
                            account.withdraw(withdrawAmt);
                            break;
                        case 3:
                            System.out.print("Enter amount to transfer: ");
                            double transferAmt = sc.nextDouble();
                            Customer targetCustomer = (currentCustomer == customer1) ? customer2 : customer1;
                            account.transfer(targetCustomer.getAccount(), transferAmt);
                            break;
                        case 4:
                            System.out.print("Enter loan amount to apply: ");
                            double loanAmt = sc.nextDouble();
                            account.applyForLoan(loanAmt);
                            break;
                        case 5:
                            System.out.println("Current balance: " + account.getBalance());
                            break;
//                        case 6:
//                            System.out.println("Thank you for using the ATM. Goodbye!");
//                            exit = true;
//                            break;
                        default:
                            System.out.println("Invalid option. Try again.");
                    }
                } catch (InsufficientFundsException | AccountNotFoundException e) {
                    System.out.println("Invalid operation: " + e.getMessage());
                } catch (InvalidAmountException | LoanNotAllowedException e) {
                    System.out.println("Invalid operation: " + e.getMessage());
                }
            }
        }
    }
}

