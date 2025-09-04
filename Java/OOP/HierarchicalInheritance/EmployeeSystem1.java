
package com.prity.HierarchicalInheritancee;

import java.util.Scanner;

public class EmployeeSystem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter permanant employee id: ");
		int pId = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter permanent employee Name : ");
		String pName = sc.nextLine();

		System.out.print("Enter permanent employee Salary : ");
		double pSal = sc.nextDouble();

		PermanentEmployee p = new PermanentEmployee(pId, pName, pSal);
		System.out.print(p.toString());
		p.netSalary();

		System.out.println("----------------------------------------------------------------------");

		System.out.print("Enter contract employee Id :");
		int cId = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter contract employee Name :");
		String cName = sc.nextLine();

		System.out.print("Enter contract employee Salary :");
		double cSalary = sc.nextDouble();

		System.out.print("Enter contract duration in year :");
		int duration = sc.nextInt();

		ContractorEmployee c = new ContractorEmployee(cId, cName, cSalary, duration);
		System.out.println(c.toString());

		sc.close();
	}

}
