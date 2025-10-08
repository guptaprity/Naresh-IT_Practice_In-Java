# 🚗 Car Exception Handling Simulation (Java)

A demonstration project showcasing **custom exception handling in Java**, designed to simulate real-world car-related error scenarios such as **car stopping**, **puncture**, and **engine overheating**.

This project is part of my Java practice repository, reflecting **clean code structure, modular design, and professional exception management** 
---

## 🧩 Project Overview

The project demonstrates how to:

* Create and use **custom checked exceptions** by extending the `Exception` class.
* Implement **static utility methods** that simulate different car conditions.
* Use **try-catch blocks** effectively to handle exceptions and ensure program stability.

---

## ⚙️ Classes and Responsibilities

### **1. CarStoppedException.java**

Custom exception class that triggers when the car stops unexpectedly.

```java
public class CarStoppedException extends Exception {
    public CarStoppedException(String message) {
        super(message);
    }
}
```

---

### **2. CarPunctureException.java**

Custom exception for puncture scenarios.

```java
public class CarPunctureException extends Exception {
    public CarPunctureException(String message) {
        super(message);
    }
}
```

---

### **3. CarHeatException.java**

Custom exception raised when the car’s engine temperature exceeds 50°C.

```java
public class CarHeatException extends Exception {
    public CarHeatException(String message) {
        super(message);
    }
}
```

---

### **4. CarTest.java**

Contains static methods to simulate different car situations and throw corresponding exceptions.

Key methods:

* `stop(String action)`
* `puncture(String action)`
* `carHeat(int temperature)`

---

### **5. CarUser.java**

Main class to execute and test all possible exception scenarios.

It includes 6 test cases to validate:

* Car stopped
* Car running
* Car punctured
* Car not punctured
* Car overheating
* Normal temperature

<img width="512" height="327" alt="image" src="https://github.com/user-attachments/assets/698fa72e-87ae-4a92-ba06-12adaed6a189" />

---

## 🧠 Concepts Covered

* Custom Exception Creation
* Exception Propagation (`throws`)
* Exception Handling (`try-catch`)
* Method Design with Exception Logic
* Java Package Structuring

---

## 🧪 Expected Output

```
Car stopped for some reason.
Car not stalled.
Car is punctured.
Car not punctured.
Car is heated more than 50 degrees Celsius.
Car temperature normal.
```

---

## 🛠️ Technologies Used

* **Java 17+**
* **Eclipse IDE**
* **Object-Oriented Programming (OOP)**
* **Custom Exception Handling**

---

## 📁 Project Structure

```
src/
└── com/prity/CustomException/
    ├── CarStoppedException.java
    ├── CarPunctureException.java
    ├── CarHeatException.java
    ├── CarTest.java
    └── CarUser.java
```

---

## 🚀 How to Run

1. Clone this repository

   ```bash
   git clone https://github.com/your-username/CarExceptionHandling.git
   ```
2. Open the project in **Eclipse** or **VS Code**.
3. Compile all files:

   ```bash
   javac com/prity/CustomException/*.java
   ```
4. Run the main class:

   ```bash
   java com.prity.CustomException.CarUser
   ```

---




## 

This project highlights a **practical understanding of exception hierarchies and error management** — essential for building reliable Java applications.

## I’ve learned to focus on:

* Writing **clean, modular, and maintainable code**
* Using **custom exceptions** for meaningful error reporting
* Designing **testable, reusable components**

---

## 🧑‍💻 Author

**Prity Gupta**
Java Developer | Full Stack Enthusiast
🌐 [GitHub](https://github.com/your-username)
📧 [pritygupta@example.com](mailto:pritygupt310@gmail.com)

---

## 🏷️ License

This project is licensed under the **MIT License** — feel free to use or modify it for educational and learning purposes.
