package com.prity.aggregation;

public class Student {
	private int studentId;
	private String studentName;
	private College college;  //HAS-A Relation
	
	public Student(int studentId, String studentName, College college) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.college=college;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "college=" + college + "]";
	}

	

}
