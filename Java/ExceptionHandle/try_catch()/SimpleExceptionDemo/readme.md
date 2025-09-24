# SimpleExceptionDemo – Exception Handling in Java  

This project demonstrates how to handle **InputMismatchException** in Java when reading integer input using the `Scanner` class.  
It also shows how to use exception-handling methods such as:  

- `getMessage()`  
- `toString()`  
- `println()` (custom message)  
- `printStackTrace()`  

---

## 🚀 Program Description

1. The program asks the user to input **two integers** (`a` and `b`).  
2. If the user enters any non-integer character (like `abc`), an **InputMismatchException** occurs.  
3. The exception is caught, and details are printed using different methods.  
4. Finally, the `Scanner` object is closed properly.


## 🧪 Test Cases
✅ Test Case 1: Valid Input

Input

Enter your first number: 10
Enter your second number: 20


## Output

You entered a = 10 and b = 20

❌ Test Case 2: Invalid Input for First Number

## Input

Enter your first number: abc


## Output

getMessage():=> null
toString():=> java.util.InputMismatchException
println():=> InputMismatchException occurred. Please enter only integer numbers.
printStackTrace():=> 
java.util.InputMismatchException
    at java.base/java.util.Scanner.throwFor(Scanner.java:939)
    at java.base/java.util.Scanner.next(Scanner.java:1594)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
    at com.prity.ExceptionHandling.SimpleExceptionDemo.main(SimpleExceptionDemo.java:15)

❌ Test Case 3: Invalid Input for Second Number

Input

Enter your first number: 10
Enter your second number: abc


## Output

getMessage():=> null
toString():=> java.util.InputMismatchException
println():=> InputMismatchException occurred. Please enter only integer numbers.
printStackTrace():=> 
java.util.InputMismatchException
    at java.base/java.util.Scanner.throwFor(Scanner.java:939)
    at java.base/java.util.Scanner.next(Scanner.java:1594)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
    at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
    at com.prity.ExceptionHandling.SimpleExceptionDemo.main(SimpleExceptionDemo.java:18)

## ⚡ Key Learnings

InputMismatchException occurs when non-integer input is given while expecting integers.

Exception handling methods provide different details about the error.

Always close the Scanner object using finally block.
