
public class Book {

	private int bookNo;
	private String title;
	private String author;
	private float price;
	private static int bookCount = 1;
	
	/*
	public Book() {
		bookCount++;
		System.out.println(bookCount);
	}
	*/
	
	public Book(int bookNo, String title, String author, float price) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
		
		//return number of book objects created
		System.out.println("bookCount: "+ countBook());
		//methods for checking title and price
		checkTitle();
		checkPrice();
	}
	
	public static int getBookCount() {
		return bookCount;
	}
	
	private int countBook() {
		return bookCount++;
	}
	
	private void checkTitle() throws IllegalArgumentException {
		if(title.length() < 4) {
			throw new IllegalArgumentException("The title length must be above 4 characters");
		}
	}
	
	private void checkPrice() throws IllegalArgumentException {
		if(price < 1 || price > 5000) {
			throw new IllegalArgumentException("The price must be a positive number and not more than 5000");
		}
	}
	
	public int getBookNo() {
		return bookNo;
	}
	
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
}
