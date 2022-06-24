import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookDetails {

	public static void main(String[] args) throws IllegalArgumentException{
		List<Book> booksList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1; i <= 3; i++) {
			
			System.out.println("Enter the Book No:");
			int bookNo = scanner.nextInt();
			
			System.out.println("Enter the Book title: ");
			String bookTitle = scanner.next();
			
			System.out.println("Enter the Book author:");
			String bookAuthor = scanner.next();
			
			System.out.println("Enter price");
			float price = scanner.nextFloat();
			
			Book book = new Book(bookNo, bookTitle, bookAuthor, price);
			//System.out.println(book);
			
			booksList.add(book);
		}
		
		System.out.println("Look for book by book number");
		
		int bookNumChecker = scanner.nextInt();
		boolean findBook = false;
		
		for(Book book: booksList) {
			if(book.getBookNo() == bookNumChecker) {
				findBook = true;
				System.out.println(book);
			}
		}
		
		bookExists(findBook);
		scanner.close();
	}
	
	public static void bookExists(boolean findBook) throws IllegalArgumentException {
		if(!findBook) {
			throw new IllegalArgumentException("Book number does not exist");
		}
		
	}

}
