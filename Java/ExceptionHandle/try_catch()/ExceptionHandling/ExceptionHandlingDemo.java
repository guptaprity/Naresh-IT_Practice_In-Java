package com.prity.ExceptionHandling;
import java.util.Scanner;
public class ExceptionHandlingDemo {

	public static void handleExceptions(String input) {
		try {
            System.out.println("Length of the input string: " + input.length());

            int number = Integer.parseInt(input);
            
            System.out.println("Converted to integer: " + number);

            input.toUpperCase();

			
		} catch(NumberFormatException e) {
			System.out.println("NumberFormatException: Input is not a valid integer.");	
		} catch (NullPointerException e) {
			 System.out.println("NullPointerException: Input is null.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        // Handle the case when user enters "null" (as text) to simulate null input
        if (userInput.equalsIgnoreCase("null")) {
            userInput = null;
        }

        handleExceptions(userInput);

        sc.close();

	}

}
