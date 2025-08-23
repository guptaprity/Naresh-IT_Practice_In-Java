# 📘 Java Aggregation Example – HAS-A Relationship

This project demonstrates the concept of **Aggregation in Java**, also known as the **HAS-A relationship**.  
Aggregation represents a relationship where one class contains a reference to another class, but both can exist independently.  

---

## 🚀 What I Learned from This Project

- **Aggregation (HAS-A Relationship)**  
  A **Student HAS-A College**. Both `Student` and `College` can exist independently.  
  → Example of real-world mapping.

- **Class and Object Creation**  
  Created multiple classes (`College`, `Student`, `Aggregation`) and objects using the `new` keyword.

- **Constructors**  
  Used constructors to initialize values when objects are created.

- **toString() Method Overriding**  
  Overridden in both `Student` and `College` classes to display object details instead of memory addresses.

- **Reusability**  
  One `College` object can be shared by multiple `Student` objects.

---

## 🛠 Project Structure

src/com/prity/aggregation/
│
├── Aggregation.java # Main class (execution starts here)
├── College.java # Represents College entity
└── Student.java # Represents Student entity (HAS-A College)

🛠 Tools & Technologies Used

Programming Language: Java

IDE: Eclipse

Concepts: Aggregation (HAS-A), Classes & Objects, Constructors, Method Overriding

###Sample Output
<img width="1676" height="686" alt="image" src="https://github.com/user-attachments/assets/244be87c-b51d-4b4c-b14f-5f03e479e96e" />
