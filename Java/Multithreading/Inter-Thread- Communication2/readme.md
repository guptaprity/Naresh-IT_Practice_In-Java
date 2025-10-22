Develop a program by using ITC to implement the Car Parking System.Here in the parking area we have MAX_SPOTS. A car can only park in the parking area if the available spot is free otherwise car has to wait for another car to vacant the 
parking spot.

Coding Requirements :
----------------------
Create a BLC class called ParkingGarage

Fields/Attributes/Properties [private access modifier] :
--------------------------------------------------------

       availableSpots : int
       MAX_SPOTS final : int

 Take a parameter constructor which accept one parameter maxSpots to initialize both the non static field.   

Methods :
---------    
    1) Method Name 		: parkCar()
       Parameter   		: carName of type String
       Return Type 		: void
       Access modifier		: public
       Modifier			: synchronized
       In this method Car thread will verify whether parking spot is available or not, If not available then Car thread has to wait, If available car will be parked in the available spot and 1 spot will be decreased from the available spot. [see the Test cases for Output]

    
    2) Method Name 		: freeSpot()
       Parameter   		: carName of type String
       Return Type 		: void
       Access modifier		: public
       Modifier			: synchronized
       In this method Car thread will verify at-least one car is parked in the parking area or not, If not then the thread has to wait for making a spot free, On the other hand if cars are already parked in the parking 
       area then car will leave the spot ONE BY ONE and it will increase the 
       available spot in the parking area.[see the Test cases for Output]

    3) Create a getter method for the non static field availableSpots.

Take another BLC class called Car which implements from Runnable interface.

Fields/Attributes/Properties [private access modifier] :
--------------------------------------------------------
   garage  : ParkingGarage
   carName : String

Take a Parameterized constructor to initialize all the fields.

Override the run() method.In this run() method perform the following task
 a) Park the car in the Parking area. [See the Test cases]
 b) The car will be parked there for some time, The time is not fixed so you 
    need to take a Ranom time.
 c) The car leaves parking spot after staying parked for a while.
 d) Interrupt the thread in the catch block.

Create an ELC class CarParkingProject with main method.Implement the project in the main method.

Test cases for Output [Will change Dynamically]
------------------------------------------------
Case 1 :
--------
Welcome to D-Mart Parking
Total Available spots are :5
Maruti Brezza parked. Available spots: 4
Tata Naxon parked. Available spots: 3
Mahindra BE6 parked. Available spots: 2
Kia Seltos parked. Available spots: 1
Honda city parked. Available spots: 0
Toyota Fortuner is waiting for a spot.
Hundai i20 is waiting for a spot.
Honda city left. Available spots: 1
Toyota Fortuner parked. Available spots: 0
Hundai i20 is waiting for a spot.
Toyota Fortuner left. Available spots: 1
Hundai i20 parked. Available spots: 0
Tata Naxon left. Available spots: 1
Kia Seltos left. Available spots: 2
Maruti Brezza left. Available spots: 3
Mahindra BE6 left. Available spots: 4
Hundai i20 left. Available spots: 5
Parking garage simulation is complete.

Case 2 :
--------
Welcome to D-Mart Parking
Total Available spots are :5
Maruti Brezza parked. Available spots: 4
Kia Seltos parked. Available spots: 3
Tata Naxon parked. Available spots: 2
Hundai i20 parked. Available spots: 1
Mahindra BE6 parked. Available spots: 0
Honda city is waiting for a spot.
Toyota Fortuner is waiting for a spot.
Tata Naxon left. Available spots: 1
Honda city parked. Available spots: 0
Toyota Fortuner is waiting for a spot.
Mahindra BE6 left. Available spots: 1
Toyota Fortuner parked. Available spots: 0
Toyota Fortuner left. Available spots: 1
Hundai i20 left. Available spots: 2
Honda city left. Available spots: 3
Kia Seltos left. Available spots: 4
Maruti Brezza left. Available spots: 5
Parking garage simulation is complete.


## Key Concepts Demonstrated

Multithreading: Each car runs in its own thread.

Synchronization: Ensures only one thread modifies parking spots at a time.

Inter-thread Communication: wait() and notifyAll() allow threads to coordinate parking and leaving.

Thread Safety: Prevents race conditions in a shared resource (available spots).

## Future Improvements

Randomize parking duration for each car.

Add a GUI for a visual representation of the garage.

Include multiple garage levels or reserved spots.

## ** Output

Welcome to D-Mart Parking

Enter Car name: Car1

Enter Car name: Car2

...

Car1 parked. Available spots: 4
Car2 parked. Available spots: 3
Car3 is waiting for a spot...
Car1 left. Available spots: 4
Car3 parked. Available spots: 3
Parking garage simulation is complete.
