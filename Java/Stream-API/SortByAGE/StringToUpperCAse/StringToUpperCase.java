package com.prity.StreamAPI;
import java.util.*;
import java.util.stream.*;


public class StringToUpperCase {

	public static void main(String[] args) {

        List<String> names = Arrays.asList("mini", "java", "developer");

        List<String> upperList = names.stream()
                .map(String::toUpperCase)      
                .collect(Collectors.toList()); 

        upperList.forEach(System.out::println);

	}

}
