Develop a scenario based program by using ITC to complete offline 
Order Delivery System in a Restaurant.

The scenario is :
A Restaurant waiter will place the food to order to chef and waiting for 
food preparation.
A Restaurant chef will prepare the food and notify the waiter after 
preparation.

Coding Requirements:
--------------------
Create a BLC class called Restaurant.

Fields/Attributes/Properties [private access modifier]
------------------------------------------------------
name:String
order:String 
boolean isOrderReady = false; //[Initial Order Status]
    
Take a paraneterized constructor to initialize the Restaurant name.

Methods :
---------    
    1) Method Name 		: placeOrder()
       Parameter   		: order of type STring
       Return Type 		: void
       Access modifier		: public
       Modifier			: synchronized
       In this method initialize the order through parameter variable. After
       placing the order, Waiter will Wait until chef notifies that food is ready. Once waiter will get notification from chef, Waiter can serve 
       the food.

   2) Method Name 		: prepareOrder()
       Parameter   		: No Parameter
       Return Type 		: void
       Access modifier		: public
       Modifier			: synchronized
       In this method chef will prepare the food.It will take some time 
       based on food. After food preparation, It will notify to the waiter
       so waiter can server the food.

    3) Create a getter method getRestaurantName() to get the name of the 
       Restaurant.

Take another BLC class called Waiter which extends from Thread

Fields/Attributes/Properties [private access modifier]
------------------------------------------------------
  restaurant Restaurant
  orderName  String

Take a parameterized constructor to initialize the restaurant property.

Methods :
---------    
    1) Method Name 		: acceptOrder()
       Parameter   		: orderName of type STring
       Return Type 		: void
       Access modifier		: public
       In this method take the order from the customer and initialize non static variable.

   2) Override the run method, inside this run method place the customer oder
      in the Restaurant for preparation.

Take another BLC class called Chef which extends from Thread

Fields/Attributes/Properties [private access modifier]
------------------------------------------------------
  restaurant Restaurant

  Take a parameterized constructor to initialize the restaurant property.

Methods :
---------    
   1) Override the run method, inside this run method prepare the customer oder
      in the Restaurant for serving.


Create one ELC class RestaurantSystem to get the following order of Output :

Output Format :
----------------
Welcome to KFC Restaurant!!!
Waiter: Placed order for fried chicken
Chef: Preparing fried chicken
Chef: fried chicken is ready!
Waiter: Serving the fried chicken


## ⚙️ Features
- Demonstrates **multi-threading and synchronization** in Java.  
- Uses **Inter-Thread Communication (ITC)** (`wait()` and `notify()`).  
- Simulates **real-world restaurant operations**.  
- Clean and modular OOP-based design.

---

## 🧠 Core Concepts Used
| Concept | Description |
|----------|--------------|
| `Thread` | Both Waiter and Chef extend Thread for concurrent execution. |
| `synchronized` | Ensures only one thread accesses shared data at a time. |
| `wait()` | Waiter waits until Chef finishes preparing the food. |
| `notify()` | Chef notifies the Waiter after food is ready. |
| `sleep()` | Simulates cooking/preparation time. |

<img width="702" height="871" alt="image" src="https://github.com/user-attachments/assets/5c2bb4c6-db0a-47f6-bd26-e34385e4ba92" />
