package com.prity.Assignment03;

class Print {
	
	public void print(int n, char c) {
		System.out.println("int="+ n +"char="+c);
	}
	
	public void print(char c, int n) {
		System.out.println("int="+ n +"char="+c);
	}

}

public class Printer{
	public static void main(String args[]) {
		Print p = new Print();
		p.print(66, 'A');
		p.print('D', 67);
	}


}
