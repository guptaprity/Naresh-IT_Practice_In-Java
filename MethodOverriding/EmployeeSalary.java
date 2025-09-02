package com.prity.methodOverridingScenario;
import java.util.Scanner;
public class EmployeeSalary {
	public static void main(String[] args) {
		System.out.println("***Salary Calculation Menu***");
		System.out.println("1) FullTime Employees");
		System.out.println(" 2) PartTime Employees ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Employee type");
		int n = sc.nextInt();
	
		switch(n) {
		case 1 : {	
			System.out.print("Enter Fulltime Employee Id : ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Fulltime Employee Name : ");
			String name=sc.nextLine();
			
			System.out.print("Enter the Salary : ");
			double Salary=sc.nextDouble();
			Employee e = new FullTimeEmployee(id, name, Salary);
			
			System.out.println(name + " Salary is :" + e.calculateSalary());	
			break;
		}
		
		case 2 : {
			System.out.print("Enter PartTime Employee Id :");
			int Pid=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter PartTime Employee Name ");
			String Pname=sc.nextLine();
			
			System.out.print("Enter your hourly rate: ");
			double hrate=sc.nextDouble();
			
			System.out.print("Enter your total works hour in the month :");
			int thour=sc.nextInt();
			
			Employee p = new PartTimeEmployee(Pid, Pname, hrate, thour);
			System.out.println(Pname + " Salary is :" + p.calculateSalary());	
			break;
		}
		}
		
	sc.close();
		
	}
	
}
class Employee {
	protected int id;
	protected String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public double calculateSalary() {
		return 0.0;
	}
}
	class FullTimeEmployee extends Employee {
		protected double salary;

		public FullTimeEmployee(int id, String name, double salary) {
			super(id, name);
			this.salary = salary;
			if(salary<0) {
				System.out.println("Salary can't be negative!!!");
			}
		}
		
		public double calculateSalary() {
			return this.salary ;
		}
	}
	
		class PartTimeEmployee extends Employee {
			protected double hourlyRate;
			protected int hoursWorked;
			public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
				super(id, name);
				this.hourlyRate = hourlyRate;
				if(hourlyRate<0) {
					System.out.println("Employee hourly rate can't be zero OR Negative");
				}
				this.hoursWorked = hoursWorked;
				if(hoursWorked<0) {
					System.out.println("Employee hours of work can't be Negative");
				}
			} 
			
			public  double calculateSalary() {
				
				return hourlyRate*hoursWorked;
				
			}
		}
		
		
		
		
		
	


