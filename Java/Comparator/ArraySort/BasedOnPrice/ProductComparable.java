package com.predicate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public record Product(int id, String name, int price) {

}
public class ProductComparable {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter size");
	int size =Integer.parseInt(sc.nextLine());
     
	Product products[] = new Product[size];
	
	 for(int i =0; i<size; i++) {
		 System.out.println("Enter product id");
		 int id=Integer.parseInt(sc.nextLine());
		 
		 System.out.println("Enter product name");
		 String name=sc.nextLine();
		 
		 System.out.println("Enter product Price");
		 int price=Integer.parseInt(sc.nextLine()); 
		 
		 products[i] = new Product(id, name, price);
	 }
	 System.out.println("Original data");
	 for(Product product : products) {
		 System.out.println(product);
	 }
	 Comparator<Product> prodId = new Comparator<Product>()
	 {
		 public int compare(Product p1, Product p2) {
			 return Integer.compare(p1.id(), p2.id());
		 }
	 };
	 
	 
//	 Arrays.sort(products, (p1, p2)->Integer.compare(p1.price(), p2.price()));
//	 System.out.println("Sorting based on the price");
//	 for(Product product : products) {
//		 System.out.println(product);
//	 }
//	}
//	 
	 Arrays.sort(products, (p1, p2)->Integer.compare(p1.price(), p2.price()));
	 System.out.println("Sorting based on the price");
	 for(Product product : products) {
		 System.out.println(product);
	 }
	}

}
