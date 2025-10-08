package com.prity.CustomException;

public class CarTest {

    public static void stop(String action) throws CarStoppedException {
        if (action.equalsIgnoreCase("stop")) {
            throw new CarStoppedException("Car stopped for some reason.");
        } else {
            System.out.println("Car not stalled.");
        }
    }

    public static void puncture(String action) throws CarPunctureException {
        if (action.equalsIgnoreCase("puncture")) {
            throw new CarPunctureException("Car is punctured.");
        } else {
            System.out.println("Car not punctured.");
        }
    }

    public static void carHeat(int temperature) throws CarHeatException {
        if (temperature > 50) {
            throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
        } else {
            System.out.println("Car temperature normal.");
        }
    }
}
