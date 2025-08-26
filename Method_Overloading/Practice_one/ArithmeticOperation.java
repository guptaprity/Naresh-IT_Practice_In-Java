package com.prity.CalcualtionMethod_Over_Loading;

class Calculator {
	public int add(int num1, int num2) {
		return num1+num2;
	}
     
	public double add(double num1, double num2) {
		return num1+num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1*num2;
	}
	
	
	public double multiply(double num1, double num2) {
		return num1*num2;
	}
}
public class ArithmeticOperation {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("Sum of two integer is :"+c.add(18, 18));
		System.out.println("Sum of two double is :"+c.add(3.8, 6.7));
		System.out.println("Multiplication of two integer is :"+c.multiply(5, 8));
		System.out.println("Multiplication of two double is :"+c.multiply(9.0, 3.2));

	}

}
