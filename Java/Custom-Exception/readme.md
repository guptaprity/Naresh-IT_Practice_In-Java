# Car Exception Handling Program (Java)

This project demonstrates **custom exception handling in Java** using a real-life car scenario.  
It includes user-defined exceptions for different car problems such as stopping, puncture, and overheating.

---

## 📌 Objective

To implement and test:
- Custom exception classes
- Throwing exceptions using conditions
- Handling exceptions using `try-catch`
- Static methods for simulation

---

## 🧩 Custom Exception Classes

### 1. `CarStoppedException`
- Extends `Exception`
- Thrown when the car stops for reasons other than puncture or overheating.

### 2. `CarPunctureException`
- Extends `Exception`
- Thrown when the car is punctured.

### 3. `CarHeatException`
- Extends `Exception`
- Thrown when car engine temperature exceeds **50°C**.

All exception classes contain:
- A **parameterized constructor** accepting an error message.

---

## ⚙️ CarTest Class

This class contains **static methods** to simulate different car conditions.

### Methods:

#### `stop(String status)`
- Throws `CarStoppedException` if input is `"stop"`
- Otherwise prints: `Car not stalled.`

#### `puncture(String status)`
- Throws `CarPunctureException` if input is `"puncture"`
- Otherwise prints: `Car not punctured.`

#### `carHeat(int temperature)`
- Throws `CarHeatException` if temperature > 50
- Otherwise prints: `Car temperature normal.`

---

## 🚘 CarUser (ELC – Execution Logic Class)

This is the **main class** used to test all scenarios.

It:
- Calls methods from `CarTest`
- Handles exceptions using `try-catch`
- Displays proper output messages

---

## ✅ Test Cases & Expected Output

| Test Case | Method Call | Expected Output |
|--------|---------------------------|----------------|
| Car stopped | `CarTest.stop("stop")` | Car stopped for some reason. |
| Car running | `CarTest.stop("go")` | Car not stalled. |
| Car punctured | `CarTest.puncture("puncture")` | Car is punctured. |
| No puncture | `CarTest.puncture("move")` | Car not punctured. |
| Overheated | `CarTest.carHeat(60)` | Car is heated more than 50 degrees Celsius. |
| Normal temp | `CarTest.carHeat(40)` | Car temperature normal. |



---

## 🧠 Concepts Used

- Custom Exceptions
- Exception Handling (`try-catch`)
- `throw` keyword
- Static methods
- Parameterized constructors
- Conditional logic
- Object-Oriented Programming (OOP)

---


