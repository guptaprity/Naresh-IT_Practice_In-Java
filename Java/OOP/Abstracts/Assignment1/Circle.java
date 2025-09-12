package com.prity.abstracts;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return 3.14*radius*radius;
	}

	@Override
	public void printDetails() {
		System.out.println("Type = Circle ");
		System.out.println("Radius "+radius);
		System.out.println("Area "+getArea());
	}
}
