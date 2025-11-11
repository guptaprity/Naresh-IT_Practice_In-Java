package com.prity_Collection;
import java.util.Scanner;
import java.util.Vector;


public class Library {
    public void displayAvailableBooks(Vector<Book> books) {
    	if(books.isEmpty()) {
    		System.out.println("No books available in the Library.");
    		return;
    	} System.out.println("Available Books in the library:");
    	
    	for(Book b : books) {
    		System.out.println(" "+b);
    	}
    }
    
    public void issueBook(Vector<Book> books, Scanner sc) {
    	System.out.println("\\nEnter keyword to search by title or author: ");
    	sc.nextLine();
    	String keyword = sc.nextLine();
        boolean found = false;
        
        for(Book b : books) {
        	if(b.title().equalsIgnoreCase(keyword) || b.author().equalsIgnoreCase(keyword)) {
        		 System.out.println("Found: " + b);
                 found = true;
        	}
        }
        
        if (!found) {
            System.out.println("No matching books found.");
        }
    	
        public void searchBook(Vector<Book> books, Scanner sc) {
            System.out.print("\nEnter keyword to search by title or author: ");
            sc.nextLine(); // consume newline
            String keyword = sc.nextLine();
            boolean found = false;

            for (Book b : books) {
                if (b.title().equalsIgnoreCase(keyword) || b.author().equalsIgnoreCase(keyword)) {
                    System.out.println("Found: " + b);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No matching books found.");
            }
        }
    }
