package book;

import java.util.Random;

public class Book {
	private int id;
	private String bookTitle;
	private String author;
	private boolean available;
	
	public Book() {

		Random generator = new Random();
		this.id = generator.nextInt();
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setBookTitle(String newTitle) {
		if (newTitle != null)
			this.bookTitle = newTitle;
	}
	
	public String getBookTitle() {
		return this.bookTitle;
	}
	
	public void setAuthor(String newAuthor) {
		if (newAuthor != null)
			this.author = newAuthor;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void setAvailable(boolean newStatus) {
		this.available = newStatus;
	}
	
	public boolean isAvailable() {
		return this.available;
	}
}

