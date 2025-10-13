# 🚖 Multithreading Based OLA Cab Booking Process
## 🎯 Objective
This program demonstrates **Multithreading in Java** through a real-world simulation of an **OLA cab booking process**.  
Each stage of the ride — from requesting a cab to rating the driver — is implemented as a separate **Thread** class.

---
## 🧩 Classes Overview

### 1️⃣ `RideRequest`
**Purpose:** Simulates the user’s ride request and driver search.

**Thread Behavior:**
- Prints `"User requested a ride..."`
- Waits for **2 seconds**
- Prints `"Searching for nearby drivers..."`

---

### 2️⃣ `DriverAssignment`
**Purpose:** Handles driver assignment after a search.

**Thread Behavior:**
- Waits for **3 seconds**
- Prints `"Driver found and assigned!"`

---

### 3️⃣ `FareCalculation`
**Purpose:** Calculates the estimated ride fare.

**Thread Behavior:**
- Prints `"Calculating estimated fare..."`
- Waits for **1.5 seconds**
- Prints `"Estimated fare: 135.75 RS."`

---

### 4️⃣ `LiveTracking`
**Purpose:** Simulates live tracking of the cab ride.

**Thread Behavior:**
- Prints ride progress in **20% increments**:
Updating ride location... 20% completed
Updating ride location... 40% completed
Updating ride location... 60% completed
Updating ride location... 80% completed
Updating ride location... 100% completed

markdown
Copy code
- Finally prints `"Ride completed!"`

---

### 5️⃣ `PaymentProcessing`
**Purpose:** Handles payment after ride completion.

**Thread Behavior:**
- Prints `"Processing payment..."`
- Waits for **2 seconds**
- Prints `"Payment successful!"`

---

### 6️⃣ `RatingSystem`
**Purpose:** Collects user feedback.

**Thread Behavior:**
- Prints `"Requesting user rating..."`
- Waits for **1 second**
- Prints `"User rated the ride: 5 star"`

---

## 🧠 Execution Logic (in `OlaRidingApp` main class)

### Step-by-step Flow:
1. Create objects for all six classes (`RideRequest`, `DriverAssignment`, `FareCalculation`, `LiveTracking`, `PaymentProcessing`, `RatingSystem`).
2. Start **RideRequest** and **FareCalculation** threads together.
3. Use `join()` on the **RideRequest** thread — ensuring the next steps wait until ride request completes.
4. Then, start the following threads **sequentially** using `start()` and `join()`:
 - `DriverAssignment`
 - `LiveTracking`
 - `PaymentProcessing`
 - `RatingSystem`

---

## 🧾 Expected Output

```text
User requested a ride...
Calculating estimated fare...
Estimated fare: 135.75 RS.
Searching for nearby drivers...
Driver found and assigned!
Updating ride location... 20% completed
Updating ride location... 40% completed
Updating ride location... 60% completed
Updating ride location... 80% completed
Updating ride location... 100% completed
Ride completed!
Processing payment...
Payment successful!
Requesting user rating...
User rated the ride: 5 star
```
# SRREENSHOT 

<img width="1396" height="930" alt="image" src="https://github.com/user-attachments/assets/28644213-4f01-4675-946f-c62e7f4a3fe2" />

## ⚙️ Key Concepts Demonstrated
Multithreading using Thread class

start() and run() method overriding

Thread synchronization using join()

Simulated real-world workflow using concurrency

## 🏁 Summary
This scenario-based Java program provides a realistic simulation of an OLA cab booking system using multithreading.
Each stage runs as an independent thread, ensuring parallel execution, controlled synchronization, and realistic timing behavior — perfectly showcasing how threads can coordinate complex tasks efficiently.
