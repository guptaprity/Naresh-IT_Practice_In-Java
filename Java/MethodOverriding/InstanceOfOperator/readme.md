# 💳 Payment Processing System 

This project demonstrates the concepts of **Method Overriding** and **Var-args** in Java using a simple **Payment Processing System**.  

---

## 🎯 Objective
- To implement **method overriding** in Java through a payment system.
- To demonstrate **runtime polymorphism** by processing different types of payments using a common interface (`processPayment()` method).
- To show the usage of **Var-args** (`Payment... payments`) for handling multiple payments in a single transaction.

---

## 📚 Use Case
A payment gateway that supports multiple payment modes:
- Credit Card
- Debit Card
- UPI  

Instead of writing separate methods for each payment type, **polymorphism** ensures that the correct method is executed at runtime.  
The **var-args method** allows passing multiple payment objects at once, simulating a scenario where a customer processes different payments in a single transaction.

---



---

## 🖼️ UML Class Diagram

```mermaid
classDiagram
    class Payment {
        +processPayment() void
    }
    class CreditCardPayment {
        +processPayment() void
    }
    class DebitCardPayment {
        +processPayment() void
    }
    class UPI {
        +processPayment() void
    }
    class PaymentProcessing {
        +paymentGateway(Payment... payments) void
        +main(String[] args) void
    }

    Payment <|-- CreditCardPayment
    Payment <|-- DebitCardPayment
    Payment <|-- UPI
    PaymentProcessing --> Payment
```

## Output 
<img width="611" height="216" alt="image" src="https://github.com/user-attachments/assets/09a6487a-cb96-415f-9e0b-1d10f99f7662" />

## 📖 Conclusion

This project successfully demonstrates:

The use of Method Overriding in real-world scenarios.

The power of Polymorphism in simplifying code and enhancing flexibility.

The convenience of Var-args for handling multiple inputs dynamically.

Such a structure can be extended to real-world payment gateways where different payment methods (Credit, Debit, UPI, Wallets, etc.) are processed seamlessly.

