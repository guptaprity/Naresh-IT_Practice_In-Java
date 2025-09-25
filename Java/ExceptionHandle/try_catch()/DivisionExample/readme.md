# Division Example – Exception Handling in Java

## 📌 Overview
This project demonstrates **exception handling** in Java, specifically handling the `ArithmeticException` that occurs during **division by zero**.  
It is implemented in a clean, modular structure to highlight **best practices** in Java programming, such as:
- Defensive programming (validating inputs)
- Using **try-catch blocks** effectively
- Writing reusable and testable methods

---

## 🛠️ Features
- `performDivision(int dividend, int divisor)`:
  - Performs integer division.
  - Throws an `ArithmeticException` if the divisor is `0`.
- Exception handling in `main` using **try-catch**.
- User input via `Scanner`.
- Graceful error messages when invalid operations occur.

---

## Output 
TEST CASE 1 :
------------
Input as : 
Enter dividend : 10
Enter divisor : 2

Output as :
Result of division : 5


TEST CASE 2 : 
-------------
Input as : 
Enter dividend : 5
Enter divisor : 0

Output :
ArithmeticException caught: Division by zero: dividend=5, divisor=0
