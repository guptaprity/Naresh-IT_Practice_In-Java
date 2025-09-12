# Assignment 01 - Abstract Class `Shape`

This project demonstrates the use of **abstract classes** and **method overriding** in Java.  
It defines an abstract class `Shape` with two abstract methods, and three concrete subclasses: `Rectangle`, `Circle`, and `Triangle`.  
Each subclass provides its own implementation of calculating area and printing details.

---

## 📂 Package Structure
│
├── Shape.java # Abstract base class 


├── Rectangle.java # Subclass representing a Rectangle


├── Circle.java # Subclass representing a Circle


├── Triangle.java # Subclass representing a Triangle


└── Area.java # Testing class with main() method


---

## 📝 Class Details

### 1. `Shape` (Abstract Class)
- Methods:
  - `public abstract double getArea()`
  - `public abstract void printDetails()`

### 2. `Rectangle`
- Fields: `length`, `breadth`
- Constructor: `(double length, double breadth)`
- `getArea()` → returns `length * breadth`
- `printDetails()` → prints type, dimensions, and area.

### 3. `Circle`
- Field: `radius`
- Constructor: `(double radius)`
- `getArea()` → returns `π * radius²` (π ≈ 3.14)
- `printDetails()` → prints type, radius, and area.

### 4. `Triangle`
- Fields: `base`, `height`
- Constructor: `(double base, double height)`
- `getArea()` → returns `(base * height) / 2`
- `printDetails()` → prints type, base, height, and area.

---

## ▶️ How to Run

1. Compile the files:
   ```bash
   javac com/prity/abstracts/*.java
2. Run the Area  class:
   ```
   java com.prity.abstracts.Area

 ```

```
## ✅ Key Concepts Demonstrated

--Abstract classes and methods

--Method overriding

--Polymorphism (using Shape reference for different shapes)

--Object-Oriented Programming principles
    
 ## Output--

 <img width="1361" height="607" alt="image" src="https://github.com/user-attachments/assets/49e4a5c9-d1f9-4d67-aae7-e226eab26fb3" />
