package com.august.basics;
import java.util.Scanner;
public class Product {
   private int id;
   private String name;
   private double price;
   private int quantity;
private Product(int id, String name, double price, int quantity) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}
   public static Product createProductObject() {
	   Scanner sc = new Scanner(System.in);
	   int id = sc.nextInt();
	   String name = sc.nextLine();
	   name=sc.nextLine();
	   double price = sc.nextDouble();
	   int quantity = sc.nextInt();
	   
	   return new Product(id, name, price, quantity);
   }
   
   public double calculateTotalAmount() {
	   double total = price * quantity;
	   double discount;
	   if(total > 1000) {
		   discount = 0.10;
       } else if (total > 500) {
           discount = 0.05;
       } else {
           discount = 0.0;
	   }
	   return total -(total*discount);
   }
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + calculateTotalAmount()+ ", quantity=" + quantity + "]";
}
   
   
}
