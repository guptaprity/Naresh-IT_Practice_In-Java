Car Has An Engine – Java Composition

This project demonstrates the concept of Composition (HAS-A relationship) in Object-Oriented Programming (OOP) using Java.
A Car HAS-A Engine, meaning the Car class contains an Engine object.

📌 Objective

Implement composition by creating a Car class that contains an Engine class object.

Add validation checks to ensure only valid numeric values (engine capacity and year) are allowed.

Display complete car and engine details.

🏗️ Project Structure
src/
└── com/prity/HAS_A_RELATION/
    ├── Engine.java   # Engine class
    ├── Car.java      # Car class (composition with Engine)
    └── TestCar.java  # Test class (main method)

🔹 Engine Class

Attributes:

private String model – Engine model

private int engineCapacity – Engine capacity (must be positive)

Constructor:

public Engine(String model, int engineCapacity)


If engineCapacity <= 0, prints Error Invalid Input and stops object creation.

Methods:

getModel()

getEngineCapacity()

toString() → "Engine Model: [model], Engine Capacity: [capacity]cc"

🔹 Car Class

Attributes:

private String make – Car make (brand)

private String model – Car model

private int year – Manufacturing year (must be positive)

private Engine engine – Engine object

Constructor:

public Car(String make, String model, int year, Engine engine)


If year <= 0, prints Error Invalid Input and stops object creation.

Methods:

toString() →
"Car Make: [make], Model: [model], Year: [year], Engine Model: [engine model], Engine Capacity: [engine capacity]cc"

🔹 TestCar Class

Contains the main() method to test different scenarios:

Valid car + engine

Invalid engine capacity

Invalid car year

✅ Test Cases
✔️ Valid Test Case 1
Engine engine = new Engine("V6 Hybrid", 3000);
Car car = new Car("Toyota", "Camry", 2023, engine);
System.out.println(car);


Output:

Car Make: Toyota, Model: Camry, Year: 2023, Engine Model: V6 Hybrid, Engine Capacity: 3000cc

✔️ Valid Test Case 2
Engine engine = new Engine("Turbo X", 2000);
Car car = new Car("Honda", "Civic", 2021, engine);
System.out.println(car);


Output:

Car Make: Honda, Model: Civic, Year: 2021, Engine Model: Turbo X, Engine Capacity: 2000cc

❌ Invalid Test Case 1 (Engine Capacity = 0)
Engine engine = new Engine("V8", 0);
Car car = new Car("Ford", "Mustang", 2022, engine);


Output:

Error Invalid Input

❌ Invalid Test Case 2 (Year < 0)
Engine engine = new Engine("V8 Supercharged", 5000);
Car car = new Car("Chevrolet", "Corvette", -2019, engine);


Output:

Error Invalid Input

📖 Concepts Learned

Composition (HAS-A relationship)

Data validation in constructors

Encapsulation with private variables & getters

Overriding toString() for readable object output

## Sample Output

<img width="1172" height="372" alt="image" src="https://github.com/user-attachments/assets/3552ba88-3c12-48a6-b72a-eb776cae4744" />

