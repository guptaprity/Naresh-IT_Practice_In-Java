package com.abstractAssignmentTwo;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal d= new Dog();
		AnimalDemo.getAnimal(d);
		Animal l= new Lion();
		AnimalDemo.getAnimal(l);
	}
    public static void getAnimal(Animal a) {
    	if(a instanceof Lion l) {
    		l.roam();
    		l.roar();
    	}
    	if(a instanceof Dog d) {
    		d.roam();
    		d.bark();
    	}
    }
}
