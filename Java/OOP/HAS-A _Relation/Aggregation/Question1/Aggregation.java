package com.prity.aggregation;

public class Aggregation {

	public static void main(String[] args) {
		
		
		College nit = new College("NIT", "Hyderabad");
		
		Student s1 = new Student(101, "Scott", nit);
		System.out.println(s1);
		
		Student s2 = new Student(102, "Smith", nit);
		System.out.println(s2);

	}

}
