package com.prity.ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter your first number: ");
			int a = sc.nextInt();
			
			System.out.println("Enter your Second number: ");
			int b = sc.nextInt();
			System.out.println("You entered a = " + a + " and b = " + b);
		}
		catch(InputMismatchException e){
			System.out.println("getMessage():=> "+e.getMessage());
			System.out.println("toString():=> " + e.toString());
			 System.out.println("println():=> InputMismatchException occurred. Please enter only integer numbers.");
			 System.out.println("printStackTrace():=> ");
	            e.printStackTrace();
			} finally {
				sc.close();
			}
		

	}
