package com.prity.FeeManagement;
import java.util.Scanner;


public class StudentFeesCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select a particular type of Student :");
		System.out.println(" 1) Hosteller Student :");
		System.out.println("  2) DayScholer Student :");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: 
			System.out.println("You have selected Hosteller!!!");
			
			System.out.println("Enter Student ID");
			int sid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Student Name");
			String sname=sc.nextLine();
			//sc.nextLine();
			System.out.println("Enter Exam fee");
			double Efee=sc.nextDouble();
			System.out.println("Enter Hostel Fee:");
			double hostelFee = sc.nextDouble();
			System.out.println("Enter Amount paid:");
			double amount = sc.nextDouble();
			
			Hosteller h = new Hosteller(sid, sname, Efee, hostelFee);
			double balance=h.payFee(amount);
			

            if (balance > 0) System.out.println("Refundable Amount is: " + balance);
            else if (balance < 0) System.out.println("Payable Amount is: " + (-balance));
            else System.out.println("Fees Paid Exactly!");

			
	        System.out.println(h);
	        break;
	        
	        
	        
		case 2: 
			 System.out.println("You have selected Day Scholler!!!");
             System.out.print("Enter Student Id :");
             int dId = sc.nextInt();
             sc.nextLine(); // consume newline
             System.out.print("Enter Student Name :");
             String dName = sc.nextLine();
             System.out.print("Enter Exam Fees :");
             double dExamFee = sc.nextDouble();
             System.out.print("Enter Transport Fee :");
             double transportFee = sc.nextDouble();

             DayScholar dayScholar = new DayScholar(dId, dName, dExamFee, transportFee);
             System.out.print("Enter your total Fees :");
             double dAmount = sc.nextDouble();
			


             double balanceD = dayScholar.payFee(dAmount);
             if (balanceD > 0) {
                 System.out.println("Refundabale Amount is :" + balanceD);
             } else if (balanceD < 0) {
                 System.out.println("Payable Amount is :" + (-balanceD));
             } else {
                 System.out.println("Fees paid exactly!");
             }
             System.out.println(dayScholar);
             break;

         default:
             System.out.println("Invalid choice!");
	        
			
		}
		sc.close();
	}

}
