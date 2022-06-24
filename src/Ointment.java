
public class Ointment extends Medicine{

	public Ointment(int price, String expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayLabel() {
		System.out.println("For External use only");
		
	}
	
	

}
