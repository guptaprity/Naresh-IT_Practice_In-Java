## Runtime Polymorphism in Java 🐾
📌 Problem Statement

Create a program to demonstrate runtime polymorphism using method overriding.

A parent class Animal has a method sound().

Two child classes Dog and Cat override the method.

Based on user input (dog, cat, or others), print the corresponding sound.

## 🛠 Implementation

Animal → prints "Animal makes a sound".

Dog → prints "Dog barks".

Cat → prints "Cat meows".

The main class uses dynamic method dispatch to call the overridden methods.

📂 Folder Structure

RuntimePolymorphism/
│── src/

│   ├── Main.java

│   ├── Animal.java

│   ├── Dog.java

│   └── Cat.java

│── README.md


▶ Sample Input / Output

## Input

dog


## Output

Dog barks


## Input

cat


## Output

Cat meows


## Input

lion


## Output

Animal makes a sound
