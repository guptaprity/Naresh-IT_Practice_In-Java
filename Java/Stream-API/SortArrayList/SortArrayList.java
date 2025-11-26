package com.prity.StreamAPI;

import java.util.ArrayList;

import java.util.List;

record Employee(Integer id, String name, Double salary) {}

public class SortArrayList {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101, "Scott", 60000.0));
		emp.add(new Employee(102, "Smoth", 75000.0));
		emp.add(new Employee(103, "Raj", 51000.0));
		emp.add(new Employee(104, "Amit", 40000.0));
		emp.add(new Employee(105, "John", 30000.0));
		emp.add(new Employee(106, "Ravi", 20000.0));
		
       System.out.println("Employees earning above RS 50,000 (Names in uppercase):");
       
       emp.stream()
       .filter(employee -> employee.salary() > 50000)
       .map(employee -> employee.name().toUpperCase())
       .forEach(System.out::println);

	}

}
