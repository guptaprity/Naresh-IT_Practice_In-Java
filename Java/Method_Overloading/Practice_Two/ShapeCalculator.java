package com.prity.ShapeCalculator;

public class ShapeCalculator {
	
      public int calculateArea(int side) {
    	  return side*side;
      }
	 
      public int calculateArea(int length, int width) {
    	  return length*width;
      }
      
      public double calculateArea(double radius) {
    	  return Math.PI* radius*radius;
      }
	
}
