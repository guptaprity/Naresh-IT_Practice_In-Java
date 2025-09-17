# ⚡ Java Execution Flow (Inheritance + Static & Instance Blocks)

This project demonstrates the **execution order** of different blocks and variables in Java when using **inheritance**.

---

## 📘 What I Implemented
I wrote a Java program with two classes:

- **Parent class**
- **Child class** (extends Parent)
  
Each class contains:
- A **static variable** (initialized with a print statement using a helper method).
- A **static block**.
- An **instance initializer block**.
- A **constructor**.

In the `Child` class, I created the `main()` method and instantiated an object to observe the exact execution sequence.

---

## 🔑 Key Concepts Covered
1. **Static Variable Execution**
   - Executed when the class is loaded.
   - Parent static variables → Parent static blocks → Child static variables → Child static blocks.

2. **Instance Initializer & Constructor Execution**
   - Executed when an object is created.
   - Parent instance initializer → Parent constructor → Child instance initializer → Child constructor.

3. **Main Method**
   - Executes after class loading.
   - Explicit object creation triggers the instance blocks and constructors.

---

## 🛠 Code Structure
- `Parent` class → static members, instance block, constructor.  
- `Child` class → extends `Parent`, overrides static/instance/constructor.  
- `ExecutionFlow` → main method to run the program.  

---

## ✅ Expected Output
<img width="1280" height="673" alt="image" src="https://github.com/user-attachments/assets/8092f2ef-89c1-4bce-a971-575e3b7735b8" />


---

## 📂 Learning Outcome
This program helps understand:
- The **execution flow** of static/instance blocks & constructors in Java.
- Why **Parent class parts always execute before Child class parts**.
- The difference between **class loading time** execution vs **object creation time** execution.


