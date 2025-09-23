# Student Notification Program 🎓

[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) 
[![License](https://img.shields.io/badge/License-MIT-green)](LICENSE)

---

## Overview
The **Student Notification Program** demonstrates the use of **Java Functional Interfaces** to notify students upon successful registration in a course. It uses **Java Records** to represent student data and a `Consumer<Student>` to display personalized welcome messages.

---

## Features
- Input the number of students to register.
- Capture student details: **ID, Name, Course**.
- Display a **custom welcome notification** for each student.
- Handles invalid input for the number of students.

---

## Technologies
- Java 17+ (for `record` support)
- Functional Interfaces: `Consumer<T>`
- Scanner for input

---
## How it Works

Program reads the number of students.

Loops to input ID, Name, Course for each student.

Creates a Student record with the input.

Consumer<Student> prints a personalized notification message.

Scanner closes automatically after all inputs.


## Output 
<img width="1377" height="867" alt="image" src="https://github.com/user-attachments/assets/236cf283-d6f9-41e8-b538-2ee770e80268" />
