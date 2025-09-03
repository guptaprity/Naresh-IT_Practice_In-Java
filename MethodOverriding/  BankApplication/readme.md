# Bank Application – Method Overriding Project

## 📌 Project Overview
This is a **Java-based Bank Application** project built using the concept of **Method Overriding**.  
The project demonstrates **polymorphism in Java** by creating different types of bank accounts – **Savings Account, Current Account, and Fixed Deposit Account** – each with its own implementation of the `calculateInterest()` method.  

It also validates user input and displays appropriate error messages when incorrect inputs are provided.

---

## 🏦 Classes & Structure

### 1. `BankAccount` (Base Class)
- **Fields**
  - `accountHolderName` (protected)  
  - `accountNumber` (protected)  
  - `balance` (protected)  
  - `IFSC_CODE` (public static final String – same for all accounts)  

- **Constructor**
  - Parameterized constructor with validations:
    - Account holder name cannot be empty.  
    - Account number cannot be empty.  
    - Balance cannot be negative.  

- **Methods**
  - `calculateInterest()` → Prints a generic message.  
  - `displayAccountDetails()` → Displays account details.  

---

### 2. `SavingsAccount` (Subclass of BankAccount)
- **Field**
  - `interestRate = 4.0`  

- **Constructor**
  - Calls the superclass constructor to initialize details.  

- **Methods**
  - `calculateInterest()` → Calculates and displays **4% interest** on balance.  

---

### 3. `CurrentAccount` (Subclass of BankAccount)
- **Field**
  - `overdraftLimit = 5000.0`  

- **Constructor**
  - Calls the superclass constructor.  

- **Methods**
  - `calculateInterest()` → Displays message that current accounts do not earn interest.  
  - `checkOverdraftLimit()` → Displays overdraft limit.  

---

### 4. `FixedDepositAccount` (Subclass of BankAccount)
- **Fields**
  - `interestRate = 6.5`  
  - `depositTerm` (years)  

- **Constructor**
  - Calls superclass constructor and validates `depositTerm` (must be positive).  

- **Methods**
  - `calculateInterest()` → Calculates interest as:  
    ```
    interest = (balance * interestRate * depositTerm) / 100
    ```

---

### 5. `BankApplication` (Main Class)
- Contains the `main()` method.  
- Uses **Scanner** for input and **switch-case** to handle user choice:  
  1. Savings Account  
  2. Current Account  
  3. Fixed Deposit Account  

---

## 🖥️ Sample Test Cases

### ✅ Test Case 1 – Savings Account
<img width="603" height="342" alt="image" src="https://github.com/user-attachments/assets/07bab8d7-14bf-4999-84ca-bdd9b426270b" />


---

### ✅ Test Case 2 – Current Account
<img width="677" height="377" alt="image" src="https://github.com/user-attachments/assets/ca39dfff-5d0e-49fc-b36f-bb8fd86a492b" />


---

### ✅ Test Case 3 – Fixed Deposit Account
<img width="676" height="420" alt="image" src="https://github.com/user-attachments/assets/4214d845-1306-4354-b0ee-81e084ece4a8" />

---

## 🚀 Concepts Used
- **Object-Oriented Programming (OOP)**
  - Inheritance
  - Method Overriding
  - Encapsulation  
- **Java Basics**
  - Scanner class for user input
  - Switch-case statements
  - Input validation using condition checks
  - Error handling with validation messages  

---

## 📊 UML Class Diagram

                ┌─────────────────────────┐
                │       BankAccount        │
                ├─────────────────────────┤
                │ - accountHolderName: String
                │ - accountNumber: String
                │ - balance: double
                │ + IFSC_CODE: String      │
                ├─────────────────────────┤
                │ + BankAccount(...)       │
                │ + calculateInterest():void
                │ + displayAccountDetails():void
                └───────────▲─────────────┘
                            │
        ┌───────────────────┼───────────────────┐
        │                   │                   │
┌─────────────────┐ ┌─────────────────┐ ┌─────────────────────┐
│ SavingsAccount  │ │ CurrentAccount  │ │ FixedDepositAccount │
├─────────────────┤ ├─────────────────┤ ├─────────────────────┤
│ - interestRate: │ │ - overdraftLimit│ │ - interestRate:     │
│   double=4.0    │ │   double=5000.0 │ │   double=6.5        │
│                 │ │                 │ │ - depositTerm: int  │
├─────────────────┤ ├─────────────────┤ ├─────────────────────┤
│ + calculateInter│ │ + calculateInter│ │ + calculateInterest()│
│ est(): void     │ │ est(): void     │ │ : void              │
│                 │ │ + checkOverdraft│ │                     │
│                 │ │ Limit(): void   │ │                     │
└─────────────────┘ └─────────────────┘ └─────────────────────┘
