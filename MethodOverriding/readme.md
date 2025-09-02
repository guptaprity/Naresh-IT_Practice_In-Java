# Employee Salary Calculation Application 💼

This project demonstrates **Method Overriding** in Java by creating an **Employee Salary Calculation Application**.  
The program calculates salaries for **Full-Time Employees** and **Part-Time Employees** based on user input, with proper input validation.

---

## 📌 Project Structure

- **Employee (Base Class)**
  - Fields: `id`, `name`
  - Method: `calculateSalary()` → returns `0.0` (default)

- **FullTimeEmployee (Subclass of Employee)**
  - Field: `salary`
  - Overrides `calculateSalary()` → returns fixed salary
  - Validates that salary is not negative

- **PartTimeEmployee (Subclass of Employee)**
  - Fields: `hourlyRate`, `hoursWorked`
  - Overrides `calculateSalary()` → returns `hourlyRate * hoursWorked`
  - Validates that hourly rate and working hours are not negative

- **EmployeeSalary (Main Class)**
  - Contains `main()` method
  - Provides a menu for choosing employee type (Full-Time / Part-Time)
  - Takes inputs, validates them, and displays calculated salary

---

## 🚀 Features

- Demonstrates **Inheritance & Method Overriding** in Java  
- Validates user input with appropriate **error messages**  
- Uses **object-oriented design principles**  
- Menu-driven console application  

---

## 📚 Learning Outcomes

Understanding of Method Overriding in Java

How to implement input validation

Use of inheritance to extend functionality

Designing a menu-driven console application

## 🛠️ Technologies Used
- **Java** (JDK 8 or later)
- **OOP Concepts**: Inheritance, Method Overriding, Encapsulation
- **Scanner** for user input

### ✅ Case 1: Full-Time Employee
<img width="396" height="306" alt="image" src="https://github.com/user-attachments/assets/99f1d69f-0838-48bc-9a2a-df207ba842dc" />


### ✅ Case 2: Part-Time Employee
<img width="541" height="357" alt="image" src="https://github.com/user-attachments/assets/9df2a0f9-9767-4751-bad7-785632a6c13d" />

### ✅ Case 3: Part-Time Employee
<img width="427" height="206" alt="image" src="https://github.com/user-attachments/assets/a53f5c75-8ec5-40a4-80bb-bbbaead40fc2" />




