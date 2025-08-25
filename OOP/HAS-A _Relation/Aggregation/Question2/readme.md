## Customer and Orders Management – Java Aggregation

This project demonstrates the concept of Aggregation (HAS-A relationship) in Object-Oriented Programming (OOP) using Java.
A Customer HAS-A Order, meaning the Customer class holds an Order object, but both can exist independently.

## 📌 Objective

Implement aggregation between Customer and Order.

Add validation checks for numeric values (like price).

Display customer and order details.

## 🔹 Order Class

Attributes:

private String orderId – Order ID

private String itemName – Product name

private double price – Product price (must be positive)

Constructor:

public Order(String orderId, String itemName, double price)


If price <= 0, prints Error: Invalid Input and stops object creation.

Methods:

getOrderId()

getItemName()

getPrice()

toString() → "Order [orderId=..., itemName=..., price=...]"

🔹 Customer Class

Attributes:

private String name – Customer name

private String email – Customer email

private String address – Customer address

private long mobileNo – Customer mobile number

private Order order – Associated Order object

Constructor:

public Customer(String name, String email, String address, long mobileNo, Order order)


Methods:

toString() →
"Customer [name=..., email=..., address=..., mobileNo=..., order=Order [...]]"

## 🔹 Zomato Class

Contains the main() method.

Creates Order objects.

Creates Customer objects (with orders).

Displays details of customers and their orders.

✅ Test Cases
✔️ Valid Test Case – Proper Input
Order order = new Order("123456", "Laptop", 1200.50);
Customer customer = new Customer("James", "james@example.com", "New York", 9876543210L, order);
System.out.println(customer);


## Output:

Customer [name=James, email=james@example.com, address=New York, mobileNo=9876543210, order=Order [orderId=123456, itemName=Laptop, price=1200.5]]

❌ Invalid Test Case – Negative Price
Order order = new Order("789012", "Phone", -500.00);
Customer customer = new Customer("Emma", "emma@example.com", "London", 9876543211L, order);


## Output:

Error: Invalid Input

❌ Invalid Test Case – Zero Price
Order order = new Order("345678", "Tablet", 0.00);
Customer customer = new Customer("Michael", "michael@example.com", "California", 9876543212L, order);


## Output:

Error: Invalid Input

## 📖 Concepts Learned

Aggregation (HAS-A relationship)

Data validation in constructors

Encapsulation with private variables & getters

Overriding toString() for readable object output

## Sample Output 
<img width="1553" height="491" alt="image" src="https://github.com/user-attachments/assets/0c71e62e-c565-43b9-84fa-4ad8bcb38b99" />
