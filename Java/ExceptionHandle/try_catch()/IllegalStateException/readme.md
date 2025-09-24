# IllegalStateException Demo  

This project demonstrates **exception handling in Java** using `IllegalStateException`.  
It shows how to **manually throw an exception** and handle it inside a method.  

---


---

## 📌 Program Flow  
1. The program defines a static method **`throwIllegalException()`**.  
   - Inside it, an `IllegalStateException` is **thrown manually** with the message `"MyException"`.  
   - The exception is caught in the `catch` block and printed using `System.out.println()`.  

2. In the `main()` method:  
   - A message `"Calling throwIllegalException from main method:"` is printed.  
   - The `throwIllegalException()` method is called.  

---

🧪 Test Case
✅ Test Case 1

Input:

(No input required)


Output:

Calling throwIllegalException from main method:
Caught: java.lang.IllegalStateException: MyException

🎯 Learning Outcome

How to throw exceptions manually using throw.

How to catch and handle IllegalStateException.

Understanding the use of custom exception messages.
