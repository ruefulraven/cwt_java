
public class Syrup extends Medicine{

	public Syrup(int price, String expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayLabel() {
		System.out.println("For 2yrs old and above use only");
		
	}

}
