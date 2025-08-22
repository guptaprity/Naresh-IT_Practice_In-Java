package oop.concept;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        if (price < 0) {
            System.out.println("Error : Book Price cannot be negative.");
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
    }
}
