package com.prity.abstracts;
import java.util.Scanner;


abstract class Product{
	private String name;
	private double price;
	private String category;
	
	public Product(String name, double price, String category) {
		if(name == null) {
			System.out.println("Product name cannot be empty or null.");
			System.exit(0);
		}
		if(price < 0) {
			System.out.println("Price cannot be negative.");
			System.exit(0);
		}
		if(category == null) {
			System.out.println("Category cannot be empty or null.");
			System.exit(0);
		}
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public abstract void applyDiscount(double percentage);
	public abstract double calculateTax();

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price<0) {
			System.out.println("Price cannot be negative.");
			System.exit(0);
		}
		
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category + "]";
	}
}


 class DigitalProduct extends Product{
	private String licenseKey;

	public DigitalProduct(String name, double price, String category, String licenseKey) {
		super(name, price, category);
		  if (licenseKey == null) {
	            System.out.println("License Key cannot be empty or null.");
	            System.exit(0);
	        }
		this.licenseKey = licenseKey;
	}

	@Override
	public void applyDiscount(double percentage) {
		double discount = (getPrice() * percentage) /100;
		double newPrice = getPrice() - discount;
		setPrice(newPrice);
		System.out.println("Discount applied :" + discount);
		System.out.println("New Price :" + newPrice);	
	}
	
	@Override
	public double calculateTax() {
		return (getPrice() * 5) / 100;
	}

	@Override
	public String toString() {
		return "DigitalProduct [licenseKey=" + licenseKey + "]";
	}
}

class PhysicalProduct extends Product {
	private double shippingWeight;

	public PhysicalProduct(String name, double price, String category, double shippingWeight) {
		super(name, price, category);
		  if (shippingWeight <= 0) {
	            System.out.println("Shipping weight must be greater than zero.");
	            System.exit(0);
	        }
		this.shippingWeight = shippingWeight;
	}
	
	@Override
	public void applyDiscount(double percentage) {
		double discount = (getPrice() * percentage) /100;
		double newPrice = getPrice() - discount;
		setPrice(newPrice);
		System.out.println("Discount applied :" + discount);
		System.out.println("New Price :" + newPrice);	
	}
	
	@Override
	public double calculateTax() {
		return (getPrice() * 8) / 100;
	}

	  public double calculateShippingCost() {
	        return shippingWeight * 5;
	    }

	@Override
	public String toString() {
		return "PhysicalProduct [shippingWeight=" + shippingWeight + "kg]";
	}
	
	
}


public class ProductStore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Select Product Type:");
        System.out.println("1. Digital Product");
        System.out.println("2. Physical Product");
        
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
        case 1:
            System.out.print("Enter Digital Product Name :");
            String dName = sc.nextLine();

            System.out.print("Enter Product Price :");
            double dPrice = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Product Category :");
            String dCategory = sc.nextLine();

            System.out.print("Enter Product License Key :");
            String dKey = sc.nextLine();

            DigitalProduct dp = new DigitalProduct(dName, dPrice, dCategory, dKey);

            System.out.print("Enter the discount % on final bill: ");
            double dDiscount = sc.nextDouble();

            System.out.println(dp.toString());
            dp.applyDiscount(dDiscount);
            System.out.println("Tax RS : " + dp.calculateTax());
            break;

        case 2:
            System.out.print("Enter Physical Product Name :");
            String pName = sc.nextLine();

            System.out.print("Enter Product Price :");
            double pPrice = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Product Category :");
            String pCategory = sc.nextLine();

            System.out.print("Enter Product weight :");
            double weight = sc.nextDouble();

            PhysicalProduct pp = new PhysicalProduct(pName, pPrice, pCategory, weight);

            System.out.print("Enter the discount % on final bill: ");
            double pDiscount = sc.nextDouble();

            System.out.println(pp.toString());
            pp.applyDiscount(pDiscount);
            System.out.println("Tax RS : " + pp.calculateTax());
            System.out.println("Shipping Cost RS :" + pp.calculateShippingCost());
            break;

        default:
            System.out.println("Invalid Choice!");
    }
       
sc.close();
	}

}
