package com.prity.predicates;
import java.util.Scanner;
import java.util.function.Predicate;

class CalculationLogic {
    public static boolean testPredicate(int num, Predicate<Integer> predicate) {
        return predicate.test(num);	
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isGreater = n -> n > 10;
        Predicate<Integer> isPrime = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        System.out.println(number + " is even: " + testPredicate(number, isEven));
        System.out.println(number + " is greater than 10: " + testPredicate(number, isGreater));
        System.out.println(number + " is prime: " + testPredicate(number, isPrime));

        sc.close();
    }
}

