package oop.concept;

import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        Book b = new Book("Java", "James Gosling", 8000);
        System.out.println(b);

       sc.close();
    }
}

