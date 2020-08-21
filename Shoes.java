package edu.umsl.listassignment;

public class Shoes {

	String name; // name of shoe
	int size; // size of shoe
	String model; // shoe model number

	public Shoes(String name, int size, String model) { // initiate variables here so no need to use getters and setters
		this.name = name;
		this.size = size;
		this.model = model;
	}
	
	// getters and setters:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
