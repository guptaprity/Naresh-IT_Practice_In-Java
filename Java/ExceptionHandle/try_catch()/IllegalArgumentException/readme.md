# Area Calculator – Rectangle Area with Exception Handling

## 📌 Overview
This project demonstrates how to **calculate the area of a rectangle** in Java while incorporating **exception handling**.  
The program validates user input and throws an `IllegalArgumentException` if invalid dimensions are provided (length or width ≤ 0).  

This example is useful for beginners learning:
- Input validation in Java
- Using `IllegalArgumentException`
- Structured exception handling with `try-catch-finally`

---

## 🛠️ Features
- `calculateArea(double length, double width)`:
  - Calculates the area using the formula:  
    ```
    area = length * width
    ```
  - Throws an `IllegalArgumentException` if `length` or `width` is ≤ 0.
- `main` method:
  - Accepts user input using `Scanner`.
  - Handles both **invalid dimensions** and **non-numeric inputs**.
  - Ensures resources (`Scanner`) are closed using `finally`.

---

## Output

-------------
Input:
Enter length of rectangle: 5
Enter width of rectangle: 4

Output:
Area of rectangle with length 5 and width 4 is: 20.0



-------------
Input:
Enter length of rectangle: -5
Enter width of rectangle: 4

Output:
Error: Length and width must be > 0.



Input:
Enter length of rectangle: 5
Enter width of rectangle: 0

Output:
Error: Length and width must be > 0.


