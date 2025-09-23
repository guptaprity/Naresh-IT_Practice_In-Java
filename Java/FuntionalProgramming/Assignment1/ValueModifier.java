import java.util.function.Consumer;
import java.util.Scanner;
public class ValueModifier{
    public static void modifyValue(int value, Consumer<Integer> consumer){
    consumer.accept(value);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Original value: "+n);
    
            Consumer<Integer> doubleValue = val -> System.out.println("After doubling the value: " + (val * 2));
        Consumer<Integer> incrementBy = val -> System.out.println("After incrementing the value by 3: " + (val + 3));

        Consumer<Integer> squareValue = val -> System.out.println("After squaring the value: " + (val * val));

        modifyValue(n, doubleValue);
        modifyValue(n, incrementBy);
        modifyValue(n, squareValue);

}

}
