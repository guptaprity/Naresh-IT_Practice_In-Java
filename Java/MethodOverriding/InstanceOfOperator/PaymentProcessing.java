package com.prity.methodOverridingScenario;

class Payment {
	
	public void processPayment(){
		System.out.println("Processing payment");
	}
}

class CreditCardPayment extends Payment{
	 @Override
	public void processPayment(){
		System.out.println("Processing credit card payment");
	}
	
}

class DebitCardPayment extends Payment{
    @Override
	public void processPayment(){
		System.out.println("Processing debit card payment");
	}
	
}

class UPI extends Payment{
    @Override
	public void processPayment(){
		System.out.println("Processing UPI payment");
	}
	
}

public class PaymentProcessing {

    // Var-args method
    public static void paymentGateway(Payment... payments) {
        for (Payment payment : payments) {
            payment.processPayment(); 
        }
    }

    public static void main(String[] args) {
        Payment credit = new CreditCardPayment();
        Payment debit = new DebitCardPayment();
        Payment upi = new UPI();

        paymentGateway(credit, debit, upi);
    }
}
