package com.prity.HierarchicalInheritancee;

public class Employee {
	protected int employeeId;
	protected String employeeName;
	protected double employeeSalary;

	// Superclass Employee

	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}

}

//Subclass PermanantEmployee
class PermanentEmployee extends Employee {
	protected double providentfund;

	public PermanentEmployee(int employeeId, String employeeName, double employeeSalary) {
		super(employeeId, employeeName, employeeSalary);
		this.providentfund = 0.12 * employeeSalary;

	}

	public void netSalary() {
		double netSalary = employeeSalary + providentfund;
		System.out.println("Net Salary is:" + netSalary);
	}

	@Override
	public String toString() {
		return "PermanentEmployee [providentfund=" + providentfund + ", employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", employeeSalary=" + employeeSalary + "]";
	}
}

//Subclass ContractorEmployee 
class ContractorEmployee extends Employee {
	protected int contractDuration;

	public ContractorEmployee(int employeeId, String employeeName, double employeeSalary, int contractDuration) {
		super(employeeId, employeeName, employeeSalary);
		this.contractDuration = contractDuration;
	}

	@Override
	public String toString() {
		return "ContractorEmployee [contractDuration=" + contractDuration + ", employeeId=" + employeeId
				+ ", employeeName=" + employeeName + ", employeeSalary=" + employeeSalary + "]";
	}

}
