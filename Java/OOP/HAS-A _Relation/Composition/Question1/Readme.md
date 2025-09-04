# 🚗 Java Composition Example – HAS-A Strong Relationship

This project demonstrates the concept of **Composition in Java**, a special type of **HAS-A relationship**.  
In **Composition**, one class is strongly dependent on another, meaning the contained object cannot exist without the container.  

Example:  
- A **Car HAS-A Engine**.  
- If the car object is destroyed, the engine object is also destroyed.  

---

## 🚀 What I Learned from This Project

- **Composition (Strong HAS-A Relationship)**  
  - `Car` contains an `Engine` object.  
  - The `Engine` is created inside the `Car` constructor and cannot exist without the `Car`.  

- **Class and Object Creation**  
  - Created classes (`Car`, `Engine`, `CompositionDemo`) and objects using the `new` keyword.  

- **Final Keyword Usage**  
  - Declared the `engine` reference as `final` to ensure the engine always belongs to the car.  

- **Constructor Initialization**  
  - Engine is created automatically when a `Car` is created → Strong dependency.  

- **toString() Method Overriding**  
  - Overridden in both `Car` and `Engine` classes to display details in a readable format.  

---

## 🛠 Project Structure

src/com/prity/composition/

## Sample Output 

Car [name=Naxon EV, model=20250, engine=Engine [type=Battery, horsePower=1200]]
<img width="680" height="585" alt="image" src="https://github.com/user-attachments/assets/74dc9978-fd61-41ea-8a06-0a1880c46559" />



├── CompositionDemo.java # Main class (execution starts here)

├── Car.java # Represents Car (HAS-A Engine)

└── Engine.java # Represents Engine (part of Car)


## 🛠 Tools & Technologies Used

Programming Language: Java

IDE: Eclipse

Concepts: Composition (Strong HAS-A), Constructors, final keyword, Method Overriding
