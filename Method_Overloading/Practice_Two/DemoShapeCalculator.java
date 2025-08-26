package com.prity.ShapeCalculator;

public class DemoShapeCalculator {

	public static void main(String[] args) {
		ShapeCalculator sc = new ShapeCalculator();
		
		System.out.println("Area of the Square :" +sc.calculateArea(9));
		System.out.println("Area of the Rectangle :"+sc.calculateArea(12, 10) );
		System.out.println("Area of the Circle is "+sc.calculateArea(3.2));
		

	}

}
