package com.prity.abstracts;

public class Rectangle extends Shape {
	private double length;
	private double breadth;
	
	

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		return length*breadth;
	}

	@Override
	public void printDetails() {
		System.out.println("Type = Rectangle");
		System.out.println("Length "+length);
		System.out.println("Breadth"+breadth);
		System.out.println("Area"+getArea());
	}

}
