package com.prity.ExecutionFlow;

class Parent {
    static String pf = print("Parent Static Variable");

    static {
        System.out.println("Parent Static block");
    }

    {
        System.out.println("Parent Instance initializer");
    }

    Parent() {
        System.out.println("Parent Constructor");
    }

    static String print(String msg) {
        System.out.println(msg);
        return msg;
    }
}

class Child extends Parent {
    static String cS = print("Child Static Variable");

    static {
        System.out.println("Child Static block");
    }

    {
        System.out.println("Child Instance initializer");
    }

    Child() {
        System.out.println("Child Constructor");
    }
}

public class ExecutionFlow {
    public static void main(String[] args) {
        System.out.println("Main Method Starts");
        Child c = new Child();
        System.out.println("Main method Ends");
    }
}
