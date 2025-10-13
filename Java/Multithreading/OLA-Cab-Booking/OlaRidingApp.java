package com.ola.booking;

class RideRequest extends Thread{
	
	@Override 
	public void run() {
		 try {
	            System.out.println("User requested a ride...");
	            Thread.sleep(2000);
	            System.out.println("Searching for nearby drivers...");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	}
	
}

class DriverAssignment extends Thread{
	@Override 
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("Driver found and assigned!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class FareCalculation extends Thread{
	@Override 
	public void run() {
		try {
		System.out.println("Calculating estimated fare...");
		Thread.sleep(1500);
		System.out.println("Estimated fare: 135.75 RS.\"");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	} 
}


class LiveTracking extends Thread{
	@Override 
	public void run() {
		try {
			for(int i=20; i<=100; i+=20) {
				System.out.println("	Updating ride location... "+i+"% completed\r\n"
						+ "");
				Thread.sleep(100);
			}
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

class PaymentProcessing extends Thread{
	@Override 
	public void run() {
         try {
        	 System.out.println("Processing payment...");
 			Thread.sleep(2000);
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class RatingSystem extends Thread{
	@Override 
	public void run() {
        try {
			System.out.println("Requesting user rating...");
			Thread.sleep(1000);
			System.out.println("User rated the ride: 5 star");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class OlaRidingApp {
	public static void main(String []args) {
		RideRequest rideRequest = new RideRequest();
		DriverAssignment driverAssignment = new DriverAssignment();
		FareCalculation fareCalculation = new FareCalculation();
		LiveTracking liveTracking = new LiveTracking();
		PaymentProcessing  paymentProcessing = new PaymentProcessing ();
		RatingSystem  ratingSystem = new RatingSystem();
		rideRequest.start();
		driverAssignment.start();
		 fareCalculation.start();
		 liveTracking.start();
		 paymentProcessing.start();
		 ratingSystem.start();
		
	}

}
