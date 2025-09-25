package com.prity.ExceptionHandling;
import java.util.Scanner;

public class DivisionExample {
	public static int performDivision(int dividend  ,  int divisor ) {
		if(divisor<0) {
			throw new ArithmeticException("Division by zero: dividend="+ dividend + ", divisor=" +divisor);
		}
		return dividend / divisor;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter dividend : ");
		int dividend = sc.nextInt();
		
		System.out.print("Enter divisor : ");
		int divisor=sc.nextInt();
		
		try {
			int result = performDivision(dividend, divisor);
			System.out.println("Result of division : " + result);
			
		} catch(ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
		}
		sc.close();

	}

}
