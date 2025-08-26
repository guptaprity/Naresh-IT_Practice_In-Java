package com.prity.Assignment03;

class DataTypePrinter{
	public void printData(byte value) {
		System.out.println("byte value "+value);
	}
	
	public void printData(short value) {
		System.out.println("short value "+value);
	}
	
	public void printData(int value) {
		System.out.println("int value "+value);
	}
	
	public void printData(long value) {
		System.out.println("long value "+value);
	}
	
	public void printData(float value) {
		System.out.println("float value "+value);
	}
	 public void printData(double value) {
	        System.out.println("double value: " + value);
	    }

	
	public void printData(char value) {
		System.out.println("Char value "+value);
	}
	
	public void printData(boolean value) {
		System.out.println("Boolean value "+value);
	}
	
	public void printData(String value) {
		System.out.println("String value "+value);
	}
}


public class OverloadDemo {

	public static void main(String[] args) {
		DataTypePrinter n = new DataTypePrinter();
		
		n.printData((byte) 10);
		n.printData((short) 200);
		n.printData(500);
		n.printData(10000L);
		n.printData(45.6f);
		n.printData(12345.6789);
		n.printData('A');
		n.printData(true);
		n.printData("Prity Gupta");

	}

}
