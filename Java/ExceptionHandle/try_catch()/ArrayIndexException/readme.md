# ArrayIndexOutOfBoundsException Demo 

This project demonstrates **exception handling in Java** using `ArrayIndexOutOfBoundsException`.  
It prompts the user to enter an array index and safely handles invalid index access using exception handling techniques.  

---


---

## 📌 Program Flow  
1. An integer array `a` is declared with **2 elements**:  
   ```java
   a[0] = 10;
   a[1] = 20;
2 The user is prompted to enter an index value using the Scanner class.

3 If the entered index is valid (0 or 1) → prints the value of the array element.

4 If the entered index is invalid (outside 0–1 range) → catches the ArrayIndexOutOfBoundsException and prints error details using:

5 getMessage()

6 toString()

7 printStackTrace()

8 A custom message with System.out.println().


🧪 Test Cases
✅ Test Case 1

Input:

3


Output:

getMessage():=> Index 3 out of bounds for length 2
toString():=> java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
println():=> You tried to access an invalid array index. Please check the index range.
printStackTrace():=>
java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
    at com.testing.ArrayIndexExceptionDemo.main(ArrayIndexExceptionDemo.java:12)

✅ Test Case 2

Input:

2


Output:

getMessage():=> Index 2 out of bounds for length 2
toString():=> java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
println():=> You tried to access an invalid array index. Please check the index range.
printStackTrace():=>
java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    at com.testing.ArrayIndexExceptionDemo.main(ArrayIndexExceptionDemo.java:12)

✅ Test Case 3

Input:

1


Output:

20

✅ Test Case 4

Input:

0


Output:

10

##  Learning Outcome

Understanding ArrayIndexOutOfBoundsException in Java.

Using exception methods:

getMessage()

toString()

printStackTrace()

Adding custom error messages for better debugging.
