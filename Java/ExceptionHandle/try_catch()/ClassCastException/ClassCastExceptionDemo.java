package com.prity.ExceptionHandling;

public class ClassCastExceptionDemo {
n
    public static void handleClassCastException() {
        
        // You can switch between test cases here:
        // Object[] objects = {"Hello", "World", "Java"};    // TEST CASE 1
        // Object[] objects = {"Hello", 123, "Java"};        // TEST CASE 2
        Object[] objects = {"Hello", true, "Java"};          // TEST CASE 3

        // Iterating through the heterogeneous array
        for (Object obj : objects) {
            try {
                String str = (String) obj;
                System.out.println("Casting successful: " + str);
            } catch (ClassCastException e) {
                System.out.println("ClassCastException: Cannot cast " 
                                   + obj.getClass().getName() + " to String.");
                e.printStackTrace();
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        handleClassCastException();
    }
}
