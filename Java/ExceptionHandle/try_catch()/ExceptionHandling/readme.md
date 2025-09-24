# Exception Handling Demo  

This project demonstrates how to handle **`NumberFormatException`** and **`NullPointerException`** in Java.  
The program reads a string from the user, tries to process it, and gracefully handles exceptions if they occur.  

---

## 📂 Package  
`com.prity.ExceptionHandling`

---

## 📌 Program Flow  
1. The program defines a static method **`handleExceptions(String input)`**:  
   - Prints the **length of the input string**.  
   - Attempts to convert the input string to an **integer** using `Integer.parseInt()`.  
   - Calls a method (`toUpperCase()`) on the string, which may cause a **`NullPointerException`** if the input is `null`.  

2. **Exceptions handled:**  
   - `NumberFormatException` → if the input string is not a valid integer.  
   - `NullPointerException` → if the input is `null`.  

3. The **`main()`** method:  
   - Uses `Scanner` to read user input.  
   - Special handling: if the user types `"null"`, the program simulates a `null` value.  
   - Passes input to `handleExceptions()`.  

---

🧪 Test Cases
✅ Test Case 1

Input:

123


Output:

Length of the input string: 3
Converted to integer: 123

✅ Test Case 2

Input:

abc


Output:

Length of the input string: 3
NumberFormatException: Input is not a valid integer.

✅ Test Case 3

Input:

null


Output:

NullPointerException: Input is null.

## 🎯 Learning Outcome

Handling multiple exceptions in a single program.

Difference between NumberFormatException (invalid number conversion) and NullPointerException (null object reference).

How to make programs more robust and user-friendly with exception handling.
