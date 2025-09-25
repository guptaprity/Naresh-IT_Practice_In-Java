# ClassCastException Demo

## 📌 Overview
This project demonstrates how to **intentionally trigger and handle a `ClassCastException`** in Java.  
The program attempts to cast heterogeneous objects into a `String` type. Whenever the cast is invalid, it throws a `ClassCastException`, which is then handled gracefully with a **try-catch block**.  

This example is highly useful for learners who want to understand **type casting issues** and **exception handling best practices** in Java.

---

## 🛠️ Features
- Declares an `Object[]` array containing **heterogeneous data types**.
- Attempts to cast each element to `String`.
- Successfully casts valid `String` objects.
- Catches and handles `ClassCastException` when incompatible objects (like `Integer` or `Boolean`) are cast to `String`.
- Prints both:
  - A **user-friendly error message**.
  - The **stack trace** for debugging.

---

## Output

Input:
Objects: {"Hello", "World", "Java"}

Expected Output:
Casting successful: Hello
Casting successful: World
Casting successful: Java



-------------
Input:
Objects: {"Hello", 123, "Java"}

Expected Output:
Casting successful: Hello
ClassCastException: Cannot cast java.lang.Integer to String.
java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
    at ClassCastExceptionDemo.handleClassCastException(ClassCastExceptionDemo.java:14)
    at ClassCastExceptionDemo.main(ClassCastExceptionDemo.java:26)



-------------
Input:
Objects: {"Hello", true, "Java"}

Expected Output:
Casting successful: Hello
ClassCastException: Cannot cast java.lang.Boolean to String.
java.lang.ClassCastException: java.lang.Boolean cannot be cast to java.lang.String
    at ClassCastExceptionDemo.handleClassCastException(ClassCastExceptionDemo.java:14)
    at ClassCastExceptionDemo.main(ClassCastExceptionDemo.java:26)
Casting successful: Java
