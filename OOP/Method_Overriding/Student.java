package com.prity.FeeManagement;

public class Student {
	protected int studentId;
	protected String name;
	protected double fee;
	
	public Student(int studentId, String name, double fee) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.fee = fee;
	}

	public double payFee(double amount) {
				return 0;
	}
}

//DaySchollar Class

class DayScholar extends Student {
	protected double transportFee;

	public DayScholar(int studentId, String name, double fee, double transportFee) {
		super(studentId, name, fee);
		this.transportFee = transportFee;
	}
	 @Override
	public double payFee(double amount) {
		double totalFee = fee+transportFee;
		return amount - totalFee;
		
	}

	@Override
	public String toString() {
		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", fee="
				+ fee + "]";
	}
}

	
	
	//Hosteller Class 
	
	class Hosteller extends Student {
		protected double hostelFee;

		public Hosteller(int studentId, String name, double fee, double hostelFee) {
			super(studentId, name, fee);
			this.hostelFee = hostelFee;
		}
		
		 @Override
		    public double payFee(double amount) {
		        double totalFee = fee + hostelFee;
		        return amount - totalFee;
		    }

		    @Override
		    public String toString() {
		        return "Hosteller [studentId=" + studentId + ", name=" + name +
		                ", examFee=" + fee + ", hostelFee=" + hostelFee + "]";
		    }}
	
