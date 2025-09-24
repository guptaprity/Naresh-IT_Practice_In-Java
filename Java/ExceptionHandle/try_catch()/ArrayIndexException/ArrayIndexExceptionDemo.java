package com.testing;
import java.util.Scanner;

public class ArrayIndexExceptionDemo {
    public static void main(String[] args) {
        int a[] = new int[2];
        a[0] = 10;
        a[1] = 20;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter an index");
            int i = sc.nextInt();
            System.out.println(a[i]); // Attempt to access array element
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("getMessage():=> " + e.getMessage());
            System.out.println("toString():=> " + e.toString());
            System.out.println("println():=> You tried to access an invalid array index. Please check the index range.");
            System.out.println("printStackTrace():=> ");
            e.printStackTrace(System.out);
        }

        sc.close();
    }
}
