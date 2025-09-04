package com.prity.HAS_A_RELATION_Zomato;

public class Customer {
	private String name; 
	private String email;
	private String address;
	private long mobileNo;
	private Order order;
	public Customer(String name, String email, String address, long mobileNo, Order order) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobileNo = mobileNo;
		this.order = order;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", address=" + address + ", mobileNo=" + mobileNo
				+ ", order=" + order.toString() + "]";
	}
	
	
	
}
