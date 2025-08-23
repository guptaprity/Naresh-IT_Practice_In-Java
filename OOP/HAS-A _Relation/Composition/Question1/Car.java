package com.prity.composition;

public class Car {

	private String name;
	private int model;
	private final Engine engine;
	
	public Car(String name, int model) {
		this.name=name;
		this.model=model;
		this.engine = new Engine("Battery", 1200);
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", engine=" + engine + "]";
	}
	
	
}
