package com.PrityOverridingEquals;

import java.util.Objects;

class Product{
	private int productId;
	private String productName;
	
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(productId, productName);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Product) {
			
		
		Product other = (Product) obj;
		if(this.productId==other.productId&&this.productName.equals(other.productName)) {
			return true;
		}
		else {
			return false;
		}
		}
	else {
		System.out.println("two objects are not equal");
		return false;
	}
	}
}

public class ProductEquality {

	public static void main(String[] args) {
		Product p1 = new Product(101, "MINI");
		Product p2 = new Product(101, "MINI");
		
		System.out.println(p1.equals(p2));
		
		System.out.println(p1.hashCode());
		System.out.print(p2.hashCode());

	}

}
