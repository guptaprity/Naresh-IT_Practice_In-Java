package com.prity.Comparator4Nov;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public record Customer(int id, String name, double bill) {

}



public class CustomerComparator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size");
		int size =Integer.parseInt(sc.nextLine());
		Customer []cust= new Customer[size];
		
		for(int i =0; i<size; i++) {
			System.out.println("Enter Customer id");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Customer name");
			String name= sc.nextLine();
			
			System.out.println("Enter Customer bill");
			Double bill = Double.parseDouble(sc.nextLine());
			
			cust[i] = new Customer(id, name, bill);
			
		}
		
		System.out.println("Original data");
		for(Customer cust1 : cust) {
			System.out.println(cust1);
		}
		
		
		Comparator<Customer> custId = new Comparator<Customer>() {
			public int compare(Customer c1, Customer c2) {
				return Integer.compare(c1.id(), c2.id());
			}
		};
		
		
		Arrays.sort(cust, custId); 
		System.out.println("Sorting based on the Id");
		for(Customer cust1 : cust) {
			System.out.println(cust1);
		}
		
		//Sorting based on the name by using labda
    Comparator<Customer> custName = (c1, c2) -> c1.name().compareTo(c2.name());
    Arrays.sort(cust, custName);
    System.out.println("Based on the name");
    for(Customer cust1: cust) {
    	System.out.println(cust1);
    }
		
		
    
    //SOrting Based on the Price
    
    Arrays.sort(cust, (c1, c2)->Double.compare(c1.bill(), c2.bill()));
    System.out.println("Sorting based on the bill");
    
    for(Customer cust1: cust) {
    	System.out.println(cust1);
    }
		
		
		

	}

}
