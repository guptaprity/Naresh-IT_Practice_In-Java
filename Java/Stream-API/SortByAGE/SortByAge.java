package com.prity.StreamAPI;
import java.util.*;
import java.util.stream.*;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override 
	public String toString() {
		return name + "-" +age;
	}
}

public class SortByAge {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Amit", 25),
				new Person("Tanu", 30),
				new Person("Rahul", 20)
				
				);
		
				List<Person> sortedList = people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
				sortedList.forEach(System.out::println);

	}

}
