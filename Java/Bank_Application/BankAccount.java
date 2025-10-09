package com.prity.Custom_Exception;

class BankAccount implements Bank {
    private long accountNumber;
    private double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid deposit amount.");
        }
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid withdrawal amount.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    @Override
    public void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid transfer amount.");
        }
        if (toAccount == null) {
            throw new AccountNotFoundException("Target account not found.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for transfer.");
        }
        this.balance -= amount;
        toAccount.balance += amount;
        System.out.println("Transfer successful. Your new balance: " + balance);
    }

    @Override
    public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid loan amount.");
        }
        if (amount > 50000 || balance < 50000) {
            throw new LoanNotAllowedException("Loan not allowed. Either amount exceeds limit or balance is too low.");
        }
        balance += amount;
        System.out.println("Loan approved. New balance: " + balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

