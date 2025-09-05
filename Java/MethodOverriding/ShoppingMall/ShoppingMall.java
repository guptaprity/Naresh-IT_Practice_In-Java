package com.prity.methodOverridingScenario;
import java.util.Scanner;


class Customer{
	protected String name;

	public Customer(String name) {
		super();
		if(name==null) {
			System.out.println("Customer name cannot be empty.");
			System.exit(0);
		}
		this.name = name;
	}
	
	public void calculateBill(double... prices) {
		double total = 0.0;
		
		for (double price : prices) {
		if(price<0) {
			System.out.println("Welcome to Hyderabad Mall :");
            System.out.println("Item price cannot be negative.");
            System.exit(0);
		}
		total += price;
		
		}
		System.out.println("Welcome to Hyderabad Mall :");
        System.out.println("Customer: " + name);
        System.out.println("Total cost RS : " + total);
        System.out.println("Discount: No discount for general customers.");
	}
}

class GeneralCustomer extends Customer{

	public GeneralCustomer(String name) {
		super(name);
	}
	
	public void calculateBill(double... prices) {
		super.calculateBill(prices);
	}
	
}


class PrimeCustomer extends Customer {
    protected double discountRate = 10.0;

    public PrimeCustomer(String name) {
        super(name);
    }

    @Override
    public void calculateBill(double... prices) {
        double total = 0.0;
        for (double price : prices) {
            if (price < 0) {
                System.out.println("Welcome to Hyderabad Mall :");
                System.out.println("Item price cannot be negative.");
                System.exit(0);
            }
            total += price;
        }
        double discount = (total * discountRate) / 100;
        double finalAmount = total - discount;

        System.out.println("Welcome to Hyderabad Mall :");
        System.out.println("Customer: " + name);
        System.out.println("Total cost RS : " + total);
        System.out.println("Discount RS : " + discount);
        System.out.println("Final amount RS : " + finalAmount);
    }
}

class VIPCustomer extends Customer {
    protected double discountRate = 15.0;

    public VIPCustomer(String name) {
        super(name);
    }

    @Override
    public void calculateBill(double... prices) {
        double total = 0.0;
        for (double price : prices) {
            if (price < 0) {
                System.out.println("Welcome to Hyderabad Mall :");
                System.out.println("Item price cannot be negative.");
                System.exit(0);
            }
            total += price;
        }
        double discount = (total * discountRate) / 100;
        double finalAmount = total - discount;

        System.out.println("Welcome to Hyderabad Mall :");
        System.out.println("Customer: " + name);
        System.out.println("Total cost RS : " + total);
        System.out.println("Discount RS : " + discount);
        System.out.println("Final amount RS : " + finalAmount);
    }
}

public class ShoppingMall {
    public static void generateBill(Customer cust, double... prices) {
        cust.calculateBill(prices);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select the Customer Type to get additional Discount :");
        System.out.println(" 1) General Customer ");
        System.out.println(" 2) Prime Customer ");
        System.out.println(" 3) VIP Customer ");

        System.out.println("Please enter Customer type :");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Please Enter your Name :");
        String name = sc.nextLine();

        Customer customer = null;

        switch (choice) {
            case 1:
                customer = new GeneralCustomer(name);
                break;
            case 2:
                customer = new PrimeCustomer(name);
                break;
            case 3:
                customer = new VIPCustomer(name);
                break;
            default:
                System.out.println("Invalid Customer Type.");
                System.exit(0);
        }

        System.out.println("Enter number of Items :");
        int n = sc.nextInt();
        double[] prices = new double[n];

        System.out.println("Please Enter the Item Name and Price :");
        for (int i = 0; i < n; i++) {
            sc.nextLine(); 
            System.out.println((i + 1) + ")Item Name :");
            String itemName = sc.nextLine();
            System.out.println("  Item Price :");
            prices[i] = sc.nextDouble();
         
        }

        generateBill(customer, prices);
        sc.close();
    }
}
