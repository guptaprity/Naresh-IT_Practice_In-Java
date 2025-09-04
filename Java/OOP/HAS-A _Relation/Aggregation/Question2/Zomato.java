package com.prity.HAS_A_RELATION_Zomato;

public class Zomato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Order o1 = new Order("123456", "Laptop", 1200.50);
	        Customer c1 = new Customer("James", "james@example.com", "New York", 9876543210L, o1);
	        System.out.println(c1);
	        
	        Order o2 = new Order("789012", "Phone", -500.00);
            System.out.println(o2);
	        
	        Order o3 = new Order("345678", "Tablet", 0.00); 
	        System.out.println(o3);
	}

}
