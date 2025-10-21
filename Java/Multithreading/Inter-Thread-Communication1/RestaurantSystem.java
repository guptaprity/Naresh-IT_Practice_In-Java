package com.prity.ITC;

class Restaurant{
	private String name;
	private String order;
	private boolean isOrderReady = false;
	public Restaurant(String name) {
		super();
		this.name = name;
	}
	
	public synchronized void placeOrder(String order) {
	 System.out.println("Waiter: Placed order for " + order);
	 
	 try {
		 while(!isOrderReady) {
			 wait();
		 }
	 } catch(InterruptedException e) {
		 e.printStackTrace();
	 }
	 
	 System.out.println("Waiter: Serving the "+order);
	 isOrderReady = false;
}
	
	  public synchronized void prepareOrder() {
	        try {
	            System.out.println("Chef: Preparing " + order);
	            Thread.sleep(2000); 
	            isOrderReady = true;
	            System.out.println("Chef: " + order + " is ready!");

	            notify();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	  public String getRestaurantName() {
	        return name;
	    }
	}

class Waiter extends Thread {
    private Restaurant restaurant;
    private String orderName;

    public Waiter(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void acceptOrder(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public void run() {
        restaurant.placeOrder(orderName);
    }
}
class Chef extends Thread{
	private Restaurant restaurant;
	public Chef(Restaurant restaurant) {
		this.restaurant=restaurant;
	}
	@Override
	public void run() {
        restaurant.prepareOrder();
	}
	
}

public class RestaurantSystem {

	public static void main(String[] args) {
		 Restaurant r = new Restaurant("KFC");

	        System.out.println("Welcome to " + r.getRestaurantName() + " Restaurant!!!");

	        Waiter waiter = new Waiter(r);
	        Chef chef = new Chef(r);

	        waiter.acceptOrder("fried chicken");

	        waiter.start();
	        chef.start();

	}

}
