package com.prity.sealed_demo;

abstract class Cake {
    private String shape;
    private String flavor;
    private int quantity;
    public static double price = 400;   

    public Cake(String shape, String flavor, int quantity) {
        this.shape = shape;
        this.flavor = flavor;
        this.quantity = quantity;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        double totalPrice = quantity * price;
        return "A " + shape + " " + flavor + " Cake Of " + quantity +
               " KG is Ready @ Rs." + totalPrice;
    }
}

class OrderedCake extends Cake {
    private String message;

    public OrderedCake() {
        super("Round", "Vanila", 1);
        this.message = null;
    }

    public OrderedCake(String shape, String flavor, int quantity) {
        super(shape, flavor, quantity);
        this.message = null;
    }

    public OrderedCake(String shape, String flavor, int quantity, String message) {
        super(shape, flavor, quantity);
        this.message = message;
    }


    @Override
    public String toString() {
        double totalPrice = getQuantity() * price;
        if (message != null) {
            return "A " + getShape() + " " + getFlavor() + " Cake Of " +
                   getQuantity() + "KG is Ready with " + message +
                   " message @ Rs." + totalPrice;
        } else {
            return super.toString();
        }
    }
}

public class CakeOrder {
    public static void main(String[] args) {
        
        OrderedCake c1 = new OrderedCake();  
        System.out.println(c1);

        OrderedCake c2 = new OrderedCake("Round", "Chocolate", 4);
        System.out.println(c2);

        OrderedCake c3 = new OrderedCake("Square", "Pineapple", 3, "Happy Birthday");
        System.out.println(c3);
    }
}
