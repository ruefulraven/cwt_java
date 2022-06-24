
public abstract class Medicine {

	private int price;
	private String expiryDate;
	
	public abstract void displayLabel();

	public void getDetails() {
		System.out.println("Price: " + price);
		System.out.println("Expiration Date: " + expiryDate);
	}
	
	public Medicine() {
		
	}
	
	public Medicine(int price, String expiryDate) {
		this.price = price;
		this.expiryDate = expiryDate;
	}

	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
}
