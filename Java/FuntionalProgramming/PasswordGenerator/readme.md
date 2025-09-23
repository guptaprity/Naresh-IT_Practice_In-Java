# Password Generator (Java - Supplier Interface)

## Overview
This program demonstrates how to use the **`Supplier<T>`** functional interface in Java to generate secure random passwords.  
The generated password:
- Has a length of **8 characters**
- Includes a mix of **uppercase letters, lowercase letters, digits, and special characters**

This project is a practical example of combining Java's **functional programming features** with traditional `Random` utilities to solve a real-world problem.

---

## Key Concepts Used
- **Supplier Interface (`Supplier<T>`)** → Represents a supplier of results; it does not take input but returns a result.  
- **Random Class** → Used to generate random indexes for character selection.  
- **Functional Programming** → Encapsulating password generation logic inside a lambda expression.

---

## Implementation Details
- **Character Sets Defined:**
  - Uppercase: `A-Z`
  - Lowercase: `a-z`
  - Digits: `0-9`
  - Special Characters: `@#$%!&*`
- **Combined into one pool** for random selection.
- **Password Length:** Fixed at 8 characters (can be parameterized if needed).
- **Supplier<String> passwordSupplier** → Generates and returns a new password every time `get()` is called.

---
## Sample Output
Generated Password: Ab3#eT9!


(Output will differ each time since it is randomly generated.)

Possible Improvements

Allow the user to customize password length.

Ensure at least one character from each category is included for stronger security.

Use StringBuilder instead of String concatenation for better performance.

Takeaways

Demonstrates Java 8 functional interfaces in practical use.

Encapsulates logic with Supplier<T> for cleaner and reusable code.

Provides a solid foundation for building more advanced password management utilities.

