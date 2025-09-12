# Assignment 02 - Abstract Class `Animal`

This project demonstrates the use of **abstract classes**, **method overriding**, **upcasting**, and **pattern matching with `instanceof`** in Java.  
It models different animals (`Lion` and `Dog`) with their roaming behavior and unique sounds.

---

## 📂 Package Structure
com.abstractAssignmentTwo
│

├── Animal.java # Abstract base class

├── Lion.java # Subclass representing a Lion

├── Dog.java # Subclass representing a Dog

└── AnimalDemo.java # Main class to test the program


---

## 📝 Class Details

### 1. `Animal` (Abstract Class)
- Abstract method:
  ```java
  abstract void roam();
``
  Represents general roaming behavior of animals.
2. Lion

Extends Animal.

Methods:

public void roam() → prints "Lion Animal is roaming"

public void roar() → prints "Lion is roaring"

  3. Dog

Extends Animal.

Methods:

public void roam() → prints "Dog Animal is roaming"

public void bark() → prints "Dog is Barking

4. AnimalDemo (Main Class)

Contains main() method:

Creates Lion and Dog objects.

Demonstrates upcasting by storing them in an Animal reference.

Calls the roaming and unique methods (roar(), bark()).

Contains getAnimal(Animal a) method:

Uses pattern matching for instanceof to determine the type.

Calls both roam() and respective unique methods.

▶️ How to Run

1.Compile the files:

javac com/abstractAssignmentTwo/*.java

2.Run the AnimalDemo class:
java com.abstractAssignmentTwo.AnimalDemo

✅ Key Concepts Demonstrated

Abstract classes and methods

Method overriding

Upcasting

Pattern matching with instanceof

Polymorphism in Java

## Example Output
Dog Animal is roaming
Dog is Barking
Lion Animal is roaming
Lion is roaring

<img width="331" height="245" alt="image" src="https://github.com/user-attachments/assets/92223e9f-3b09-4190-ac82-627be22d95e9" />


