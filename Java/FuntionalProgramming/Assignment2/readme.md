# FunctionApplier

## Overview
This project demonstrates the use of Java's **`Function<T, R>`** functional interface to apply different transformations on an integer value.  
The program encapsulates the functional approach by implementing a reusable method `applyFunction` that applies any given function to an integer input.

---

## Implementation Details

### Class: `FunctionApplier`
- Responsible for applying mathematical operations on integers using functional programming concepts.

### Method: `applyFunction`
```java
public static int applyFunction(int value, Function<Integer, Integer> fun)


Parameters:

value → input integer

fun → a function that takes an integer and returns an integer

Returns: Transformed integer after applying the function

```
Test Cases
Input: 10
Original value: 10
After adding 5: 15
After multiplying by 2: 20
After subtracting 3: 7

Input: -15
Original value: -15
After adding 5: -10
After multiplying by 2: -30
After subtracting 3: -18

Input: 100
Original value: 100
After adding 5: 105
After multiplying by 2: 200
After subtracting 3: 97

## Key Takeaways

Demonstrates functional programming in Java using Function<T, R>.

Decouples logic by passing functions as parameters.

Encourages clean, reusable, and testable code.
