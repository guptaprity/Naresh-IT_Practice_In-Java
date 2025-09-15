# 🛒 Payment Processing System

This project demonstrates **loose coupling** in Java using **sealed interfaces** and **dynamic polymorphism**.  
It simulates an **online shopping cart checkout system** where a customer can pay via **Credit Card, Debit Card, or UPI**.

---

---

## 🚀 Features
- **Sealed Interface (`Payment`)** restricts payment options to:
  - `CreditCardPayment`
  - `DebitCardPayment`
  - `UPIPayment`
- Loose coupling using interface references (`Payment pay = null;`).
- Demonstrates **dynamic polymorphism** in `ShoppingCart`.
- Implements both **payment** and **refund** processes.

---

## ⚙️ Classes Overview

### 1. `Payment` (Sealed Interface)
- **Methods:**
  - `makePayment(double amount)`
  - `makeRefund(double amount)`

### 2. `CreditCardPayment`
- **Field:** `cardHolderName`  
- Handles payments and refunds via Credit Card.

### 3. `DebitCardPayment`
- **Field:** `bankName`  
- Handles payments and refunds via Debit Card.

### 4. `UPIPayment`
- **Field:** `upiId`  
- Handles payments and refunds via UPI.

### 5. `ShoppingCart`
- **Field:** `totalAmount`  
- **Methods:**
  - `checkout(Payment payment)` → Makes payment dynamically.
  - `cancelOrder(Payment payment)` → Initiates refund dynamically.

### 6. `Customer` (Main Class)
- Accepts input from the user:
  - Bill amount
  - Payment method
  - Payment details (Name, Bank, or UPI ID)
- Uses **switch-case** to process payments.

---

## Output

Test Case 1 :

-------------

Enter your total bill Amount :

7000

Choose Payment Method:

1. Credit Card
   
2. Debit Card
 
3. UPI
 
1
Starting checkout for amount RS :7000.0

Paid RS :7000.0 using Credit Card Holder : MR. Ravi


Order Canceled. Initiating Refund...

Cancelling order for amount RS :7000.0

Refunded RS :7000.0 to Credit Card Holder : MR. Ravi


Test Case 2 :

-------------

Enter your total bill Amount :

9000

Choose Payment Method:

1. Credit Card
   
2. Debit Card
   
3. UPI
2
Starting checkout for amount RS :9000.0

Paid RS :9000.0 using Debit Card Bank: State Bank of India


Order Canceled. Initiating Refund...

Cancelling order for amount RS :9000.0

Refunded RS :9000.0 to Debit Card Bank: State Bank of India


Test Case 3 :
-------------
Enter your total bill Amount :

12000

Choose Payment Method:

1. Credit Card
   
2. Debit Card
   
3. UPI
   
3
Starting checkout for amount RS :12000.0

Paid RS 12000.0 using UPI ID : reach_scott@upi


Order Canceled. Initiating Refund...

Cancelling order for amount RS :12000.0

Refunded RS 12000.0 to UPI ID : reach_scott@upi

## Learning Outcomes

Understanding of sealed interfaces in Java.

Implementation of loose coupling and dynamic polymorphism.

Real-world simulation of a payment gateway system.
