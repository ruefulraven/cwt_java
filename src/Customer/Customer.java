package Customer;

import java.util.Locale.Category;

public class Customer {
	private String custNo;
	private String custName;
	private String category;
	
	public Customer(String custNo, String custName, String category) throws InvalidInputException {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.category = category;
		/*
		if(!checkCustNo() || !checkCustName() || !checkCategory()) {
			throw new InvalidInputException("Customer No must have a C in first character.");
		}
		*/
		if(!checkCustNo()) {
			throw new InvalidInputException("Customer Number must have a C or c in first character.");
		}
		
		if(!checkCustName()) {
			throw new InvalidInputException("Customer name must be more than 4 characters");
		}
		
		if(!checkCategory()) {
			throw new InvalidInputException("Category entered does not exist");
		}
		
	}

	private boolean checkCustNo() {
		char[] custArr = custNo.toCharArray();
		char cust = custArr[0];
		if(cust != 'C' && cust != 'c'){
			return false;
		}else {
			return true;
		}
		
	}
	
	private boolean checkCustName() {
		if(custName.length() < 4) {
			return false;
		}else {
			return true;
		}
		
	}
	
	private boolean checkCategory() {
		boolean categoryStatus = false;
		String[] categoryList = {"PLATINUM", "GOLD", "SILVER"};
		for(Category cat : Category.values()) {
			if(cat.toString().equals(category)) {
				categoryStatus = true;
			}
		}
		/*
		for(int i = 0; i <= categoryList.length - 1; i++) {
			if(categoryList[i].equals(category)) {
				categoryStatus = true;
			}
		}
		*/
		return categoryStatus;
	}
	
	public String getCustNo() {
		return custNo;
	}
	
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	
	public String getCustName() {
		return custName;
	}
	
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName + ", category=" + category + "]";
	}

	public enum Category{
		PLATINUM, GOLD, SILVER;
	}	
}
