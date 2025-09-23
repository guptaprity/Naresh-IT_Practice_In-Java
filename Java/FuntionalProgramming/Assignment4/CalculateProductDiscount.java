import java.util.Scanner;
import java.util.function.Function;

record Product(Integer id, String name, Double Price) {}
	
	public class CalculateProductDiscount{
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Product Id :");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Product Name :");
		    String name=sc.nextLine();
		    System.out.print("Enter Product Price :");
		    double Price=sc.nextDouble();
		    
		    Product product = new Product(id, name, Price);
		    
		    Function<Product, Double> discountFunction = p-> {
		    	double discount;
		    	if(p.Price() >=5000) {
		    		discount = p.Price() * 0.10;
		    	} else {
		    		discount = p.Price() * 0.05;
		    	}
		    	return p.Price() - discount;	
		    };
		    double finalPrice = discountFunction.apply(product);
		    
		    
		    System.out.println("Final price of the product is :"+finalPrice);
		    
		}
	}


