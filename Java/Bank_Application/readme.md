# Bank Application in Java

## Objective
The Bank Application is a Java-based console program designed to simulate basic banking operations. It allows users to perform deposit, withdrawal, transfer, loan application, and balance check operations with proper input validation and error handling. The application demonstrates the use of Java interfaces, classes, custom exceptions, and exception handling mechanisms.

---

## Features
- Deposit money into the account.
- Withdraw money from the account with balance validation.
- Transfer funds between accounts with account existence and balance checks.
- Apply for a loan with predefined limits.
- Check account balance.
- Robust input validation using custom exceptions.
- Menu-driven interface for ease of use.
- Error handling using try-catch blocks and multi-catch blocks.

---

## Technologies & Concepts Used
- Java SE
- Object-Oriented Programming (OOP)
  - Classes: `BankAccount`, `Customer`, `ATM`
  - Interface: `Bank`
- Custom Exceptions
  - `InsufficientFundsException` (Checked)
  - `InvalidAmountException` (Unchecked)
  - `AccountNotFoundException` (Checked)
  - `LoanNotAllowedException` (Unchecked)
- Exception Handling
  - Try-with-resources
  - Multi-catch blocks
- Switch-case menu for user operations
- Input validation using `Scanner`

---

## Classes Overview

### Bank Interface
Defines abstract methods for banking operations:
- `deposit(double amount)`
- `withdraw(double amount)`
- `transfer(BankAccount toAccount, double amount)`
- `applyForLoan(double amount)`
- `getBalance()`

### BankAccount Class
Represents a bank account and implements `Bank` interface.  
- Attributes: `accountNumber`, `balance`
- Methods: Implements all banking operations with proper exception handling.

### Customer Class
Represents a customer who owns a bank account.  
- Attributes: `name`, `account` (HAS-A relationship with `BankAccount`)
- Methods: Getter methods for customer details.

### ATM Class
Entry point of the application.  
- Provides a menu-driven interface for customers to perform operations.
- Reads customer input, validates, and performs operations.
- Handles exceptions gracefully.

---

## Usage

1. Run the `ATM` class.
2. Enter the customer name (e.g., `Alice` or `Bob`).
3. Select an option from the menu:
    ```
    1. Deposit
    2. Withdraw
    3. Transfer
    4. Loan Application
    5. Check Balance
    6. Exit
    ```
4. Follow prompts to enter amounts for deposit, withdrawal, transfer, or loan application.
5. The application will display appropriate messages for successful operations or exceptions.

---

## Test Cases

### Test Case 1
<img width="512" height="497" alt="case1" src="https://github.com/user-attachments/assets/b07606bf-00db-44a0-bf02-2c64f3dc2acd" />


### Test Case 2
<img width="577" height="661" alt="case2" src="https://github.com/user-attachments/assets/a3eb6fac-5a74-4f6b-a62c-170c4e059047" />


### Test Case 3
<img width="533" height="642" alt="case3" src="https://github.com/user-attachments/assets/cf61365e-daed-474a-bd02-fc3e0ca40cdf" />


### Test Case 4
<img width="527" height="668" alt="case4" src="https://github.com/user-attachments/assets/edc0a51d-37e8-41be-ae86-80237648181f" />


### Test Case 5
<img width="530" height="485" alt="case5" src="https://github.com/user-attachments/assets/45333f76-9d16-4940-893b-70597197f058" />



