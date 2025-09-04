package com.prity.HAS_A_RELATION;

public class TestCar {

	public static void main(String[] args) {
		Engine e1 = new Engine("V6 Hybrid", 3000);
		Car c1=new Car("Toyota", "Camry", 2023, e1);
		
		System.out.println(c1);
		
		Engine e2 = new Engine("Turbo X", 2000);
        Car c2 = new Car("Honda", "Civic", 2021, e2);
        System.out.println(c2);
        
        Engine e3 = new Engine("V8", 0);
        System.out.println(e3);
        
        Engine e4 = new Engine("V8 Supercharged", 5000);
        Car c4 = new Car("Chevrolet", "Corvette", -2019, e4);
        
        System.out.println(c4);
         

	}

}
