package com.prity.CustomException;

public class CarUser {
    public static void main(String[] args) {

        try {
            CarTest.stop("stop");
        } catch (CarStoppedException e) {
            System.out.println(e.getMessage());
        }

        try {
            CarTest.stop("go");
        } catch (CarStoppedException e) 
            System.out.println(e.getMessage());
        }

        try {
            CarTest.puncture("puncture");
        } catch (CarPunctureException e) {
            System.out.println(e.getMessage());
        }

        try {
            CarTest.puncture("move");
        } catch (CarPunctureException e) {
            System.out.println(e.getMessage());
        }

        try {
            CarTest.carHeat(60);
        } catch (CarHeatException e) {
            System.out.println(e.getMessage());
        }

        try {
            CarTest.carHeat(40);
        } catch (CarHeatException e) {
            System.out.println(e.getMessage());
        }
    }
}
