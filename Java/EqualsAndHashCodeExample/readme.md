# Book Equality Check 📚

## 📌 Problem Statement
Create a program in Java to compare two books using `equals()` and `hashCode()`.  
Two books are considered equal if both their `title` and `author` are the same.

## 🛠️ Implementation
- `Book` class has two fields: `title` and `author`.  
- Overrides:
  - `equals(Object obj)` → compares title and author.
  - `hashCode()` → generates hash code based on title and author.  
- In `MainApp2`, user input is taken for two books and equality is checked.

## 📂 Folder Structure
BookEqualityCheck/

│── src/

│ ├── MainApp2.java

│ └── Book.java

│── README.md


## 📥 Input Format
1. Title of first book (single word, use `next()`)  
2. Author of first book (single word, use `next()`)  
3. Title of second book (single word, use `next()`)  
4. Author of second book (single word, use `next()`)

## 📤 Output Format
- First line: `"Books are equal"` OR `"Books are not equal"`.  
- Second line: `"Book1 HashCode: <number>"`  
- Third line: `"Book2 HashCode: <number>"`  

## ▶️ Sample Run

**Input**

Java
James
Java
James


**Output**
Books are equal
Book1 HashCode: 2301506
Book2 HashCode: 2301506


**Input**
Java
James
Python
Guido


**Output**
Books are not equal
Book1 HashCode: 2301506
Book2 HashCode: 72409520


## 🚀 How to Run
```bash
javac MainApp2.java
java MainApp2
