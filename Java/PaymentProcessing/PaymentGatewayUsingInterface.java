
 import java.util.Scanner;
 
 public class PaymentGatewayUsingInterface{
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
       PaymentGateway getway = new PaymentGateway();
          Payment p=null;
      int c=sc.nextInt();
      switch(c){
        
        case 1: 
        p=getway.initiatePayment(new CreditCardPayment());
        break;

        case 2:
         p=getway.initiatePayment(new UPIPayment());
         break;
        default :
        System.out.println("Wrong Choice");
        System.exit(0);
      }
      p.applyDiscount();
      p.processPayment();

    }
 }
 
 
 
 
 
 interface Payment{
    public abstract void processPayment();
    public abstract void applyDiscount();
}
class UPIPayment implements Payment{
    @Override
    public  void applyDiscount(){
        System.out.println("Applying 100 cashback for UPI users.");
    }
    @Override
    public  void processPayment(){
        System.out.println("Processing UPI payment");
    }
}
class CreditCardPayment implements Payment{
    @Override
    public  void applyDiscount(){
        System.out.println("Applying 10% discount for credit card users.");
    }
    @Override
    public  void processPayment(){
        System.out.println("Processing credit card payment");
    }
}

class PaymentGateway {
    public Payment initiatePayment(Payment payment){

        if(payment instanceof CreditCardPayment){
            System.out.println("Initiating Credit Card payment.");
        }
        else if(payment instanceof UPIPayment){
            System.out.println("Initiating UPI payment.");
        }
        
        return payment;

    };
}

