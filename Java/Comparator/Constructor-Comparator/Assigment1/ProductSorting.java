package com.prity.Comparator4Nov;
import java.util.*;

record Product(int pid, String pname) {
	public Product {
		if(pid <=0) {
			throw new IllegalArgumentException("Product ID must be positive");
		}
	}
	
	@Override
	public String toString() {
		return pid+" "+ pname;
		
	}
}

public class ProductSorting {

	public static void main(String[] args) {
		//Sort by id ascending
		TreeSet<Product> pidAsc = new TreeSet<>(Comparator.comparingInt(Product::pid));
		
		//2) Sort by pid descending
        TreeSet<Product> pidDesc = new TreeSet<>(Comparator.comparingInt(Product::pid).reversed());
        
        //Sort by name
        TreeSet<Product> nameAsc = new TreeSet<>(Comparator.comparing(Product::pname));
        TreeSet<Product> nameDsc = new TreeSet<>(Comparator.comparing(Product::pname).reversed());

        
        Product p1 = new Product(3, "Mouse");
        Product p2 = new Product(1, "Keyboard");
        Product p3 = new Product(5, "Laptop");
        Product p4 = new Product(2, "Charger");
        
        pidAsc.add(p1); pidAsc.add(p2); pidAsc.add(p3); pidAsc.add(p4);
        pidDesc.addAll(pidAsc);
        nameAsc.addAll(pidAsc);
        nameDsc.addAll(pidAsc);
        
        System.out.println("PID Ascending: " + pidAsc);
        System.out.println("PID Descending: " + pidDesc);
        System.out.println("Name Ascending: " + nameAsc);
        System.out.println("Name Descending: " + nameDsc);
	}

}
