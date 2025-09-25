##  ClassNotFoundExpDemo
#### Overview

ClassNotFoundExpDemo is a Java application that demonstrates the use of Java Reflection and exception handling. The program allows the user to dynamically load a class at runtime by providing its fully qualified name. If the class is not found, it gracefully handles the ClassNotFoundException and displays an appropriate error message with the stack trace.

# Features

Dynamically loads a Java class using Class.forName().

Handles ClassNotFoundException with proper error messages.

Interactive user input via console using Scanner.

# Prerequisites

Java Development Kit (JDK) 8 or higher.

Any IDE (Eclipse, IntelliJ IDEA, NetBeans) or command-line environment for running Java programs.


## Program Structure
Class: ClassNotFoundExpDemo

Constructor:

Parameter: String className

Attempts to load the class using Class.forName(className).

Catches ClassNotFoundException and prints an error message with stack trace.

Main Method:

Reads user input for the class name.

Creates an instance of ClassNotFoundExpDemo.

Closes the Scanner.

## Output

TEST CASE 1 :
-------------
Input:
Enter the class name to load: java.lang.String

Output:
Class loaded successfully: java.lang.String


TEST CASE 2 :
--------------
Input:
Enter the class name to load: com.nareshit.Faculty

Output:
Error: Class 'com.nareshit.Faculty' not found.
java.lang.ClassNotFoundException: com.nareshit.Faculty
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:525)
	at java.base/java.lang.Class.forName0(Native Method)
	at java.base/java.lang.Class.forName(Class.java:375)
	at com.testing.ClassNotFoundExpDemo.<init>(ClassNotFoundExpDemo.java:10)
	at com.testing.ClassNotFoundExpDemo.main(ClassNotFoundExpDemo.java:27)
