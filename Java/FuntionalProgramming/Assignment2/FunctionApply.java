import java.util.function.Function;
import java.util.Scanner;

public class FunctionApply{
    public static void applyFunction(int value,  Function<Integer, Integer> fun) {
        fun.apply(value);
    }

public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Original value: "+n);
    Function<Integer, Integer> add = val ->val+5;
     System.out.println("After adding 5: " +add.apply(n));

    Function<Integer, Integer> multiply = val ->val*2; 
    System.out.println("After multiplying by 2: "+multiply.apply(n));    

     Function<Integer, Integer> subtract = val ->
     val-3;
      System.out.println("After subtracting 3: "+subtract.apply(n));         

applyFunction(n, add);
applyFunction(n, multiply);
applyFunction(n, subtract);

}
}
