public class CarUser {
    public static void main(String[] args) {

        // Test 1: Car Stopped
        try {
            CarTest.stop("stop");
        } catch (CarStoppedException e) {
            System.out.println(e.getMessage());
        }

        // Test 2: Car Not Started
        try {
            CarTest.stop("go");
        } catch (CarStoppedException e) {
            System.out.println(e.getMessage());
        }

        // Test 3: Car Puncture
        try {
            CarTest.puncture("puncture");
        } catch (CarPunctureException e) {
            System.out.println(e.getMessage());
        }

        // Test 4: Car Not Punctured
        try {
            CarTest.puncture("move");
        } catch (CarPunctureException e) {
            System.out.println(e.getMessage());
        }

        // Test 5: Car Overheated
        try {
            CarTest.carHeat(60);
        } catch (CarHeatException e) {
            System.out.println(e.getMessage());
        }

        // Test 6: Normal Temperature
        try {
            CarTest.carHeat(40);
        } catch (CarHeatException e) {
            System.out.println(e.getMessage());
        }
    }
}
