public class ValidateInput {
    public static void main(String[] args) {
        String mobile = "9876543210";
        String email = "example@gmail.com";

        boolean validMobile = mobile.matches("[6-9][0-9]{9}");

        boolean validEmail = email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

        System.out.println("Valid Mobile: " + validMobile);
        System.out.println("Valid Email: " + validEmail);
    }
}
