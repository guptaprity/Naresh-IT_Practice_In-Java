# ValueModifier (Java Program)

## 📌 Overview
This Java program demonstrates the use of **functional interfaces** (specifically `Consumer<T>`) to perform modifications on an integer value.  
The program defines a method `modifyValue` which accepts an integer value and a `Consumer<Integer>`. It then applies the given consumer operation on the value.

The program includes three consumers:
1. **doubleValue** → Doubles the given integer.
2. **incrementBy** → Increments the integer by `3`.
3. **squareValue** → Squares the given integer.

---

## 🛠️ Class & Method Details

### **Class: `ValueModifier`**
- Contains the `modifyValue` method and `main` method.

### **Method: `modifyValue`**
- **Access Modifier:** `public`  
- **Non-Access Modifier:** `static`  
- **Return type:** `void`  
- **Parameters:** `int value, Consumer<Integer> consumer`  
- **Functionality:** Applies the consumer operation to the given integer.

---

✅ Test Cases & Expected Output
Test Case 1

Input:

5


Expected Output:

Original value: 5
After doubling the value: 10
After incrementing the value by 3: 8
After squaring the value: 25

Test Case 2

Input:

-8


Expected Output:

Original value: -8
After doubling the value: -16
After incrementing the value by 3: -5
After squaring the value: 64

Test Case 3

Input:

0


Expected Output:

Original value: 0
After doubling the value: 0
After incrementing the value by 3: 3
After squaring the value: 0

## 🎯 Key Learning

Using Java Functional Interfaces (Consumer<T>) for lambda-based operations.

Applying different transformations without rewriting multiple methods.

Demonstrating functional programming style in Java.
