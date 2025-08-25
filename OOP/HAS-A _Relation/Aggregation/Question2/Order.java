package com.prity.HAS_A_RELATION_Zomato;

public class Order {
	private String orderId;
	private String itemName;
	private double price;
	public Order(String orderId, String itemName, double price) {
		if (price <= 0) {
            System.out.println("Error: Invalid Input");
            return; 
        }
		this.orderId = orderId;
		this.itemName = itemName;
		this.price = price;
	}
	public String getOrderId() {
		return orderId;
	}

	public String getItemName() {
		return itemName;
	}
	
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemName=" + itemName + ", price=" + price + "]";
	}
	
	
	
	
	
	
	

}
