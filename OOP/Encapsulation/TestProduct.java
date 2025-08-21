package com.august.basics;
import java.util.Scanner;
public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many products do you want to create?");
		
		int c = sc.nextInt();
		
		for(int i=1; i<=c; i++) {
			Product s = Product.createProductObject();
			System.out.println(s);
		}
           sc.close();

	}

}
