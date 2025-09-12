package com.prity.abstracts;

public class Triangle extends Shape{
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return (base*height)/2;
	}

	@Override
	public void printDetails() {
		System.out.println("Type = Triangle ");
		System.out.println("Base "+base);
		System.out.println("height "+height);
		System.out.println("Area "+getArea());
	}

}
