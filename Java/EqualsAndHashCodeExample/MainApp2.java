import java.util.Objects;
import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title1 = sc.next();
        String author1 = sc.next();
        Book book1 = new Book(title1, author1);

        String title2 = sc.next();
        String author2 = sc.next();
        Book book2 = new Book(title2, author2);

        if (book1.equals(book2)) {
            System.out.println("Books are equal");
        } else {
            System.out.println("Books are not equal");
        }


        sc.close();
    }
}



class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
