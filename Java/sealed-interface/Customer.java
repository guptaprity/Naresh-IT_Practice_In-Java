import java.util.Scanner;
public class Customer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double totalAmount = sc.nextDouble();
        ShoppingCart cart = new ShoppingCart(totalAmount);
        int input = sc.nextInt();
        String name = sc.next();
        Payment pay = null;
        switch(input)
        {
            case 1 ->
            {
                pay = new CreditCardPayment(name);
                cart.checkOut(pay);
                cart.cancelOrder(pay);
            }
            case 2 ->
            {
                pay = new DebitCardPayment(name);
                cart.checkOut(pay);
                cart.cancelOrder(pay);
            }
            case 3 ->
            {
                pay = new UPIPayment(name);
                cart.checkOut(pay);
                cart.cancelOrder(pay);
            }
        }
    }
}
sealed interface Payment
{
    void makePayment(double amount);
    void makeRefund(double amount);
}
final class CreditCardPayment implements Payment
{
    private String cardHolderName;
    public CreditCardPayment(String cardHolderName)
    {
        this.cardHolderName = cardHolderName;
    }
    public void makePayment(double amount)
    {
        if(amount>0)
        {
            System.out.println("Starting checkout for amount RS :"+amount);
            System.out.println("Paid RS :"+amount+ " using Credit Card Holder : "+this.cardHolderName);
        }
        else{
            System.out.println("Invalid Input");
            System.exit(0);
        }
    }
    public void makeRefund(double amount)
    {
        System.out.println("Order Canceled. Initiating Refund...");
        System.out.println("Cancelling order for amount RS :"+amount);
        System.out.println("Refunded RS :"+amount+ " to Credit Card Holder : "+cardHolderName);
    }
}
final class DebitCardPayment implements Payment
{
    private String bankName;
    public DebitCardPayment(String bankName)
    {
        this.bankName = bankName;
    }
    public void makePayment(double amount)
    {
        if(amount>0)
        {
            System.out.println("Starting checkout for amount RS :"+amount);
            System.out.println("Paid RS :"+amount+ " using Debit Card Bank: "+this.bankName);
        }
        else{
            System.err.println("Invalid Input");
            System.exit(0);
        }
    }
    public void makeRefund(double amount)
    {
        System.out.println("Order Canceled. Initiating Refund...");
        System.out.println("Cancelling order for amount RS :"+amount);
        System.out.println("Refunded RS :"+amount+ " to Debit Card Bank: "+this.bankName);
    }
}
final class UPIPayment implements Payment
{
    private String upiId;
    public UPIPayment(String upiId)
    {
        this.upiId = upiId;
    }
    public void makePayment(double amount)
    {
        if(amount>0)
        {
            System.out.println("Starting checkout for amount RS :"+amount);
            System.out.println("Paid RS :"+amount+ " using UPI ID : "+this.upiId);
        }
        else{
            System.err.println("Invalid Input");
            System.exit(0);
        }
    }
    public void makeRefund(double amount)
    {
        System.out.println("Order Canceled. Initiating Refund...");
        System.out.println("Cancelling order for amount RS :"+amount);
        System.out.println("Refunded RS :"+amount+ " to UPI ID : "+this.upiId);
    }
}
class ShoppingCart
{
    private double totalAmount;
    public ShoppingCart(double totalAmount)
    {
        this.totalAmount = totalAmount;
    }
    public void checkOut(Payment payment)
    {
        payment.makePayment(totalAmount);
    }
    public void cancelOrder(Payment payment)
    {
        payment.makeRefund(totalAmount);
    }
}
