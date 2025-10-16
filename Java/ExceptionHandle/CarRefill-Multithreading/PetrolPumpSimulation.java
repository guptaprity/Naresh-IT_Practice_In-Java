package com.prity.thread;

class PetrolPump {
	public synchronized void refillCar(String carName) {
		System.out.println("<"+carName+"> started filling");
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			System.out.println("Refilling interrupted for " + carName);
		}
        System.out.println("<" + carName + "> completed refilling!");
		
	}
}

class Car implements Runnable{
	private String name;
	private PetrolPump petrolPump;
	
	public Car(String name, PetrolPump petrolPump) {
		this.name=name;
	 this.petrolPump=petrolPump;
	}
	
	public void run() {
		petrolPump.refillCar(name);
	}
	
}


public class PetrolPumpSimulation {

	public static void main(String[] args) {
		 PetrolPump pump = new PetrolPump();
		 
		 Car[] cars = {
				 new Car("Ford", pump),
				 new Car("Naxon", pump),
		         new Car("Maruti", pump)
		 };
		 
		 Thread[] threads = new Thread[cars.length];
		  for(int i=0; i<cars.length; i++) {
			  threads[i] = new Thread(cars[i]);
		  }
		  
		  for(Thread t : threads) {
			  t.start();
			  
		  }
     for(Thread t: threads) {
    	 t.start();
     }
     
     for (Thread t : threads) {
         try {
             t.join();
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted: " + e.getMessage());
         }
     }

     System.out.println("All cars have completed refilling.");
	}

}
