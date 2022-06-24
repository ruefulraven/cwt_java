
public class BookTest {

	public static void main(String[] args) {
		EngineeringBook engrBook = new EngineeringBook(1, "Book about building", "Sample Author1", 12.5f, "Buildings");
		EngineeringBook engrBook2 = new EngineeringBook(1, "Book about math", "Sample Author2", 5.5f, "Math");
		System.out.println(engrBook);
		System.out.println(engrBook2);
	}

}
