
public class EngineeringBook extends Book{

	private String category;
	
	public EngineeringBook(int bookNo, String title, String author, float price) {
		super(bookNo, title, author, price);
		// TODO Auto-generated constructor stub
	}
	
	public EngineeringBook(int bookNo, String title, String author, float price, String category) {
		super(bookNo, title, author, price);
		this.category = category;
		// TODO Auto-generated constructor stub
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "EngineeringBook [bookNo=" + getBookNo() + ", title=" + getTitle() + ", author=" + getAuthor() + ", price=" + getPrice() + ", category=" + getCategory() + "]";
	}

	
}
