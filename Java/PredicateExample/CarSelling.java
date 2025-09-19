package com.prity.predicates;

import java.util.Scanner;
import java.util.function.Predicate;

record Car(String brand, double price, int mileage) {}

class CarSelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the brand name of the Car :");
        String brand = sc.nextLine();

        System.out.print("Enter the price of the Car :");
        double price = sc.nextDouble();

        System.out.print("Enter the mileage of the Car :");
        int mileage = sc.nextInt();

        Car car = new Car(brand, price, mileage);

        Predicate<Car> isEligibleForSale = c -> c.price() <= 500000 && c.mileage() >= 20;

        if (isEligibleForSale.test(car)) {
            System.out.println(car.brand() + " is eligible for sale");
        } else {
            System.out.println(car.brand() + " is not eligible for sale");
        }

        sc.close();
    }
}
