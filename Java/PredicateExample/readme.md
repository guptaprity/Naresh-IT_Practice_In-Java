
                                       #CalculationLogic

# Java Predicate Example

This project demonstrates how to use **Java Predicates** with custom logic to test numbers against different conditions.

---

## 📌 Problem Statement
Write a Java program that defines a method `testPredicate` to test a given number against a provided predicate.

**Class Name:** `CalculationLogic`  
**Method Name:** `testPredicate`  
- Access Modifier: `public`  
- Non-Access Modifier: `static`  
- Return Type: `boolean`  
- Parameters: `int`, `Predicate<Integer>`  

This method should return a boolean value indicating whether the given number satisfies the provided predicate.

---

## 📌 Predicates Used
1. **isEven** → Checks if the number is even.  
2. **isGreaterThanTen** → Checks if the number is greater than 10.  
3. **isPrime** → Checks if the number is prime.

## 📌 Concepts Used

Predicate Functional Interface (java.util.function.Predicate)

Lambda Expressions in Java

Prime Number Checking Logic

Java Scanner for Input

---
                                              #Car Selling Eligibility using Predicate

                                     📌 Problem Statement

Develop a scenario-based Java program using the Functional Interface Predicate<T> to check whether a Car is eligible for sale or not.

Requirements:

Create a record called Car with the following fields:

brand (String)

price (Double)

mileage (Integer)

Create an ELC class CarSelling with a main method.

Use Scanner class for input and create a Car object.

Define a Predicate<Car> to verify car eligibility based on:

Car price should be less than or equal to 5,00,000 (5 lac).

Car mileage should be greater than or equal to 20.

# ✅ Key Concepts Used

Java Record → to define an immutable Car class with less boilerplate.

Functional Interface Predicate<T> → to implement eligibility logic in a functional way.

Scanner Class → to read input from the user.

Lambda Expressions → to define predicates in concise form.




                                              

