package com.prity.functional;
import java.util.Scanner;
import java.util.function.Function;

 record Product(Integer id, String name, Double price) {
	
}

public class CalculateProductDiscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product id :");
		Integer id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter product Name:");
		String name = sc.nextLine();
		
		System.out.println("Enter Product Price:");
		Double price = sc.nextDouble();
		
		Product product = new Product(id, name, price);
		
		Function<Product, Double> discountFunction = p -> {
			if(p.price() >= 5000) {
				return p.price() - (p.price() * 0.10);
			} else {
				  return p.price() - (p.price() * 0.05);
			}
		};
		
		 Double finalPrice = discountFunction.apply(product);

	    
	        System.out.println("Final price of the product is :" + finalPrice);

	        sc.close();
		
		

	}

}
