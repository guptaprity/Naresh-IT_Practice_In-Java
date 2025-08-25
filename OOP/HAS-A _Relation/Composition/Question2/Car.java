package com.prity.HAS_A_RELATION;

public class Car {
	private String make;
	private String model;
	private int year;
	private Engine engine;
	public Car(String make, String model, int year, Engine engine) {
		if(year <=0) {
			System.out.println("Error Invalid Input");
			return;
		}
		this.make = make;
		this.model = model;
		this.year = year;
		this.engine = engine;
	}
	@Override
	public String toString() {
		 if (engine == null) return "Error Invalid Input";
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", engine=" + engine + "]";
	}

	

}
