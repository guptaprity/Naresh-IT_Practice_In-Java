# Product Equality Comparison (Overriding `equals` and `hashCode`)

## 📌 Program Overview
This program demonstrates how to compare two objects based on their **content** by overriding the `equals(Object obj)` method of the `Object` class.  
It also follows the **equals-hashCode contract** to ensure consistency when objects are compared.

---

## 🛠️ Requirements
- Create a **BLC (Business Logic Class)** named `Product`
  - Instance variables:
    - `private int productId`
    - `private String productName`
  - Provide a **parameterized constructor** to initialize properties.
  - Override the `equals(Object obj)` method to compare `Product` objects based on their **content**.
  - Override the `hashCode()` method to follow the `equals-hashCode` contract.
  - If the user tries to compare objects of different types (e.g., `Product` and `Employee`), print a proper message.

- Create an **ELC (Execution Logic Class)** named `ProductEquality` to test the application.

---
## Sample Output 
Are p1 and p2 equal? true

HashCode of p1: 73411702

HashCode of p2: 73411702

Comparing Product and Employee:

Two objects are not equal (different types).

false

<img width="1362" height="930" alt="image" src="https://github.com/user-attachments/assets/a5b72f65-7710-4a31-9ae6-5c0a7318e44a" />


## ✅ Key Takeaways

Overriding equals() ensures comparison is based on content, not reference.

Always override hashCode() when overriding equals() to maintain contract.

Good practice to use Objects.hash() for clean and reliable hashCode implementation.


## 📚 Concepts Covered

Method overriding

equals() and hashCode() contract

Object comparison in Java

Encapsulation and class design
