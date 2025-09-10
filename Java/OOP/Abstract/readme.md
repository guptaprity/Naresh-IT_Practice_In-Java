# Product Store - Abstract Class & Inheritance

## 📌 Project Overview
This project demonstrates the use of **abstract classes** and **hierarchical inheritance** in Java.  
We create a scenario-based program to display and manage **different types of products** (Digital and Physical).  
It showcases:
- Input validation in constructors
- Abstract methods (`applyDiscount`, `calculateTax`)
- Method overriding
- Polymorphism
- Real-world product calculations (discount, tax, shipping cost)

---

## 🏗️ Class Structure

### 1. **Product (Abstract Class)**
- Fields: `name`, `price`, `category`
- Constructor with input validation
- Abstract methods:
  - `applyDiscount(double percentage)`
  - `calculateTax()`
- Getter & Setter for `price`
- `toString()` for displaying product details

### 2. **DigitalProduct (Subclass of Product)**
- Extra field: `licenseKey`
- Overrides:
  - `applyDiscount(double percentage)` → applies discount and updates price
  - `calculateTax()` → returns 5% tax on discounted price
- `toString()` → displays digital product details

### 3. **PhysicalProduct (Subclass of Product)**
- Extra field: `shippingWeight`
- Overrides:
  - `applyDiscount(double percentage)` → applies discount and updates price
  - `calculateTax()` → returns 8% tax on discounted price
- Extra Method:
  - `calculateShippingCost()` → calculates shipping cost at **₹5 per KG**
- `toString()` → displays physical product details

### 4. **ProductStore (Main Class)**
- Provides a menu to select:
  - `1. Digital Product`
  - `2. Physical Product`
- Uses `Scanner` for user input
- Validates all inputs
- Demonstrates discount, tax, and shipping calculations

---
📊 Test Cases
✅ Test Case 1: Digital Product
Select Product Type:
1. Digital Product
2. Physical Product
1
Enter Digital Product Name : Java E Book
Enter Product Price : 1000
Enter Product Category : Electronics
Enter Product License Key : E_BOOK_001
Enter the discount % on final bill: 10
![WhatsApp Image 2025-09-10 at 22 31 57_123ddd46](https://github.com/user-attachments/assets/e5057995-5d9a-4390-ba25-1f43e4ba552d)


✅ Test Case 2: Physical Product
Select Product Type:
1. Digital Product
2. Physical Product
2
Enter Physical Product Name : Mobile
Enter Product Price : 50000
Enter Product Category : Electronics
Enter Product weight : 1
Enter the discount % on final bill: 12
![WhatsApp Image 2025-09-10 at 22 35 22_bd9e6890](https://github.com/user-attachments/assets/cf124130-01f4-404d-9e47-0cf8538b86a8)

1. Invalid Name
   Product name cannot be empty or null.
2. Negative Price
   Price cannot be negative.
3. Null Category
   Category cannot be empty or null.
4. Invalid Shipping Weight
   Shipping weight must be greater than zero.


## 🎯 Learning Outcomes

Abstract classes & methods in Java

Method overriding & polymorphism

Constructor validation

Hierarchical inheritance

Real-world product management simulation




