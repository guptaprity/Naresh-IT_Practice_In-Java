# Product Discount Calculator 🛒

[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) 
[![License](https://img.shields.io/badge/License-MIT-green)](LICENSE)

---

## Overview
The **Product Discount Calculator** program demonstrates the use of **Java Functional Interfaces**, specifically the `Function<T,R>` interface, to calculate discounts on products during a festival. 

It uses **Java Records** to store product information and a `Function<Product, Double>` to compute the final discounted price.

---

## Features
- Input product details: **ID, Name, Price**.
- Calculate **discounted price** based on the following criteria:
  - **10% discount** if the product price is **≥ 5000**
  - **5% discount** if the product price is **< 5000**
- Display the final price after discount.

---

## Technologies Used
- Java 17+ (for Record support)
- Functional Interfaces (`Function<T,R>`)
- `Scanner` for input handling

---

## Components

### `Product` Record
Stores product information:
```java
record Product(Integer id, String name, Double price) {}

```
CalculateProductDiscount Class

Contains the main method which:

Reads product details from the user.

Uses a Function<Product, Double> to calculate the discounted price.

Prints the final price of the product.

## Sample Output

Test Case 01:

Enter Product Id :101
Enter Product Name :Laptop
Enter Product Price :50000
Final price of the product is :45000.0


Test Case 02:

Enter Product Id :102
Enter Product Name :Head Phone
Enter Product Price :4000
Final price of the product is :3800.0

## How it Works

Program reads product details: ID, Name, Price.

Creates a Product record with the input data.

Uses a Function<Product, Double> functional interface to:

Check the product price.

Calculate 10% discount if price ≥ 5000.

Calculate 5% discount if price < 5000.

Return the final discounted price.

Prints the discounted price on the console.

## Notes

Ensure product price is a valid number.

The discount is automatically applied based on the price threshold (5000).
