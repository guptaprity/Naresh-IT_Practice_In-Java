# 💳 Payment Processing System (Java)

This is a **Java program** that demonstrates **Method Overloading** with a real-world scenario of processing payments using **Cash**, **Credit Card**, and **Debit Card**.  
The project validates inputs, masks sensitive card details, and shows how different overloaded methods can handle different payment types.

---

## 📌 Features
- **Cash Payment** – validates positive amount  
- **Credit Card Payment** – validates card number (16 digits) + amount  
- **Debit Card Payment** – validates card number (16 digits) + amount  
- **Helper Methods**:
  - `validateAmount(double)` → ensures amount > 0  
  - `validateCardNumber(String)` → ensures 16-digit card  
  - `maskCardNumber(String)` → hides all digits except last 4 (e.g. `****-****-****-1234`)  

---

## 🛠️ Technologies Used
- **Java SE**
  
- **Scanner Class** (for user input)
  
- **Method Overloading**
  
- **Encapsulation (Helper Methods with `private`)**

---

## 📖 Sample Output

✅ Test Case 1 – Cash Payment

Payment Menu

Please select any one Payment Method from the Menu :

1) Payment by using Cash
 
2) Payment by using Credit Card
  
3) Payment by using Debit Card

Please enter your Payment choice [1/2/3]

1
Enter the amount you want to pay through cash :

12000

Processing payment via Cash...

Amount Paid RS :12000.0

Payment Successful!


✅ Test Case 2 – Credit Card Payment

Enter your name :

RaviShankar

Enter your 16 digit Credit Card Number :

1234987645672345

Enter your Payment Amount :

12000

Processing payment via Credit Card...

Card Holder: RaviShankar

Card Number: ****-****-****-2345

Amount Paid RS :12000.0

Payment Successful!

✅ Test Case 3 – Debit Card Payment

Enter your 16 digit Debit Card Number :

1234123412341234
Enter your Payment Amount :
12000
Processing payment via Debit Card...
Card Number: ****-****-****-1234
Amount Paid RS :12000.0
Payment Successful!
