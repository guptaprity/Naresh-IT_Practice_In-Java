package com.prity.aggregation;


public class College {
	private String collegeName;
	private String location;
	public College(String collegeName, String location) {
		super();
		this.collegeName = collegeName;
		this.location = location;
	}
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", location=" + location + "]";
	}
	
	

}
