//This is the ElC Class BLC class Name is Vehicle.java
package com.prity.Vehicle_Inheritance;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter Car details (Make Model Year Doors): ");
        System.out.print("Car Company Name ");
        String carMake = sc.next();
        System.out.print("Car model Name ");
        String carModel = sc.next();
        System.out.print("Year");
        int carYear = sc.nextInt();
        System.out.print("Doors");
        int carDoors = sc.nextInt();

        Car car = new Car(carMake, carModel, carYear, carDoors);
        System.out.println("\nCar Details:");
        car.displayDetails();

        
        System.out.println("\nEnter Bike details (Make Model Year Type): ");
        System.out.print("Bike company name ");
        String bikeMake = sc.next(); 
        System.out.print("Bike model name ");
        String bikeModel = sc.next();
        System.out.print("Bike year ");
        int bikeYear = sc.nextInt();
        System.out.print("bike type (String) ");
        String bikeType = sc.next();

        Bike bike = new Bike(bikeMake, bikeModel, bikeYear, bikeType);
        System.out.println("\nBike Details:");
        bike.displayDetails();

        sc.close();
    }
}
