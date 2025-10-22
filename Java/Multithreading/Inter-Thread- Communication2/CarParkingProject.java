package com.prity.ITC;

import java.util.Scanner;

class ParkingGarage {
    private int availableSpots;
    private final int MAX_SPOTS;

    public ParkingGarage(int maxSpot) {
        this.availableSpots = maxSpot;
        this.MAX_SPOTS = maxSpot;
    }

    // Method to park the car
    public synchronized void parkCar(String carName) {
        while (availableSpots == 0) {
            System.out.println(carName + " is waiting for a spot...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }

        availableSpots--;
        System.out.println(carName + " parked. Available spots: " + availableSpots);
        notifyAll();
    }

    // Method to free the spot when car leaves
    public synchronized void freeSpot(String carName) {
        while (availableSpots == MAX_SPOTS) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }

        availableSpots++;
        System.out.println(carName + " left. Available spots: " + availableSpots);
        notifyAll();
    }
}

class Car implements Runnable {
    private final ParkingGarage garage;
    private final String carName;

    public Car(ParkingGarage garage, String carName) {
        this.garage = garage;
        this.carName = carName;
    }

    @Override
    public void run() {
        garage.parkCar(carName);

        try {
            Thread.sleep(3000); // simulate time car is parked
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

        garage.freeSpot(carName);
    }
}

public class CarParkingProject {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        ParkingGarage garage = new ParkingGarage(5); // 5 spots in garage

        System.out.println("Welcome to D-Mart Parking");

        Thread[] threads = new Thread[7]; // 7 cars to simulate

        // Input car names and create threads
        for (int i = 0; i < threads.length; i++) {
            System.out.print("Enter Car name: ");
            String carName = sc.nextLine();
            threads[i] = new Thread(new Car(garage, carName));
        }

        // Start all car threads
        for (Thread t : threads) {
            t.start();
        }

        // Wait for all cars to finish
        for (Thread t : threads) {
            t.join();
        }

        System.out.println("Parking garage simulation is complete.");
        sc.close();
    }
}
