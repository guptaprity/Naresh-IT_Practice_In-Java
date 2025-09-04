
//This is the BLC class ElC class Name is Test.java

package com.prity.Vehicle_Inheritance;

public class Vehicle {
	
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        super();
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        if (year <= 0) {
            return; 
        }
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    protected int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

//  Bike is also a separate top-level class
class Bike extends Vehicle {
    protected String type;

    public Bike(String make, String model, int year, String type) {
        super(make, model, year);
        this.type = type;
    }

    @Override
    public void displayDetails() {
        if (year <= 0) {
            return;
        }
        super.displayDetails();
        System.out.println("Type: " + type);
    }
}

