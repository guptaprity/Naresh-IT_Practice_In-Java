package com.prity_Collection;
import java.util.Scanner;
import java.util.Vector;

public class LibraryManagement {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        Vector<Book> books = new Vector<>();

	        books.add(new Book(101, "Core Java", "Mr James"));
	        books.add(new Book(102, "Adv Java", "Mr Robert"));
	        books.add(new Book(103, "Head First Java", "Miss Kathy Sierra"));
	        books.add(new Book(104, "Programming in C", "Mr Denis"));

	        Library lib = new Library();

	        while (true) {
	            System.out.println("\nSelect from the Menu :");
	            System.out.println("\t 1) Display Books Available in the Library :");
	            System.out.println("\t 2) Search a Book in the Library :");
	            System.out.println("\t 3) Issue a Book from the Library :");
	            System.out.println("\t 4) Exit from the application :");
	            System.out.print("Please Enter your Choice : ");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    lib.displayAvailableBooks(books);
	                    break;

	                case 2:
	                    lib.searchBook(books, sc);
	                    break;

	                case 3:
	                    lib.issueBook(books, sc);
	                    break;

	                case 4:
	                    System.out.println("Thank you for Visiting..");
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid Choice. Please try again.");
	            }
	        }
	    }
	}
