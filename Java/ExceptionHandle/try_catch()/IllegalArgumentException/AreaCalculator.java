package com.prity.ExceptionHandling;
import java.util.Scanner;

public class AreaCalculator {
	
	public static double calculateArea(double length, double width) {
		
		if(length <= 0 || width <= 0 ) {
			throw new  IllegalArgumentException("Error: Length and width must be > 0.");
		}
		
		return length*width;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {
			
			System.out.println("Enter length of rectangle: ");
			double length=sc.nextDouble();
			System.out.println("Enter width of rectangle:");
			double width=sc.nextDouble();
			
			double area=calculateArea(length, width);
			
			System.out.println("Area of rectangle with length " + length + " and width " + width + " is: " + area);
		} catch(IllegalArgumentException e) {
			System.out.println("Error: "+e.getMessage());
		}  catch(Exception e) {
            System.out.println("Invalid input! Please enter numeric values.");
		}
		finally {
			sc.close();
		}
	}

}
