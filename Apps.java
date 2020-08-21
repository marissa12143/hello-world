package edu.umsl.listassignment;

import java.util.ArrayList;
import java.util.List;

public class Apps {

	public static void main(String[] args) {
		List<Shoes> list = new ArrayList<Shoes>(); // creates ArrayList of shoes
		Apps apps = new Apps();// instantiate App class to be able to call createShoe method
		// Shoes shoe = new Shoes(); //Shoes object
		list.add(apps.createShoe("Nike", 7, "AQ3366")); // adds a shoe to the list
		list.add(apps.createShoe("ASICS", 8, "586945"));
		list.add(apps.createShoe("Adidas", 6, "H75458"));
		list.add(apps.createShoe("Saucony", 7, "PI6995"));
		list.add(apps.createShoe("Brooks", 9, "AK6875"));

		apps.printShoes(list); // print out shoe list
	}

	// Creates a new shoe(s) object
	public Shoes createShoe(String name, int size, String model) {
		return new Shoes(name, size, model);
	}

	// iterates through list and prints out shoes
	public void printShoes(List<Shoes> list) {
		for (Shoes s : list) {
			System.out.println("Name: " + s.getName());
			System.out.println("Size: " + s.getSize());
			System.out.println("Model: " + s.getModel());
			System.out.println("=========================================");
		}
	}
}