package com.prity.HAS_A_RELATION;

public class Engine {
	private String model;
	private int engineCapacity;
	public Engine(String model, int engineCapacity) {
		if(engineCapacity <=0) {
			System.out.println("Error Invalid Input");
			return;
		}
		this.model = model;
		this.engineCapacity = engineCapacity;
	}
	public String getModel() {
		return model;
	}
	
	public int getEngineCapacity() {
		return engineCapacity;
	}
	@Override
	public String toString() {
		return "Engine [model=" + model + ", engineCapacity=" + engineCapacity + "]";
	}



}
