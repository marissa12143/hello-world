package edu.umsl.learningcollecitons;

public class Car {
	private String name;
	private String make;
	private int numberOfDoors;
	
	public Car(String name, String make, int numberOfDoors) { //can do this instead of getters and setters
		this.name = name;
		this.make = make;
		this.numberOfDoors = numberOfDoors;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
}