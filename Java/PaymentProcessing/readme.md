# Assignment 01 - Payment Processing using Interface and Factory Method

## Problem Statement
Develop a scenario-based program for a **Payment Processing System** using **Interface** and implement **Factory Method** for initiating different types of payments. The program should apply discounts or cashback based on the payment type.

---

## Requirements

### Interface: `Payment`
- **Methods:**
  - `processPayment()` → void, abstract  
  - `applyDiscount()` → void, abstract  

### Implementing Classes
1. **CreditCardPayment**
   - `applyDiscount()` → Apply **10% discount** for credit card users.  
   - `processPayment()` → Process **credit card payment**.  

2. **UPIPayment**
   - `applyDiscount()` → Apply **₹100 cashback** for UPI users.  
   - `processPayment()` → Process **UPI payment**.  

---

### Business Logic Class: `PaymentGateway`
- **Method:**  
  - `initiatePayment(Payment payment)` → Returns object of `Payment` type.  
  - Prints a message like:  
    - *"Initiating Credit Card payment."*  
    - *"Initiating UPI payment."*  

---

### Execution Logic Class: `PaymentGatewayUsingInterface`
- Contains the `main()` method.  
- Takes user input using `Scanner`.  
- Uses `switch-case` to select payment method.  
- Handles wrong choices gracefully.  

---

## Test Cases

Select your payment Option :

Credit Card

UPI
Please Enter your Choice :
1
Initiating Credit Card payment.
Applying 10% discount for credit card users.
Processing credit card payment...


### Test Case 2

Select your payment Option :

Credit Card

UPI
Please Enter your Choice :
2
Initiating UPI payment.
Applying ₹100 cashback for UPI users.
Processing UPI payment...



### Test Case 3
Select your payment Option :

Credit Card

UPI
Please Enter your Choice :
3
Wrong Choice..


## Concepts Used

Interface (abstraction of payment methods).

Factory Method (object creation handled by PaymentGateway).

Polymorphism (dynamic method binding for discount and payment processing).

Switch-case control flow (to select payment type).


