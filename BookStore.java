package edu.umsl.bookstore;

public class BookStore {
	
	private String name;
	private String address;
	private Book book;
	
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
@Override
	public String toString() {
		// TODO Auto-generated method stub
	
		return name+address;
		//return super.toString();
	}	

}
