package com.books.arrays;
public class Book {
	String bookName;
	String bookAuthorName;
	String bookGenre;

	//Book constructor
	Book(String name, String authorName, String genre){
		bookName = name;
		bookAuthorName = authorName;
		bookGenre = genre;
	}
	
	public static void main(String[] args) {
		Book bookArray[] = new Book[3]; //array of book objects
		//3 different book objects, all stored in an array
		bookArray[0] = new Book("Night", "Elie Wiesel", "Memoir");
		bookArray[1] = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction");
		bookArray[2] = new Book("Lord of the Flies", "William Golding", "Allegory");
		for(int i=0; i<3; i++) { //iterates through book array
			System.out.println(bookArray[i].bookName); //prints out all book names in book array
		}
	}
}
