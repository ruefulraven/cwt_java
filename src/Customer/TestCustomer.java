package Customer;

import java.util.Scanner;

public class TestCustomer {
	
	
	public static void main(String[] args) throws InvalidInputException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Customer Number:");
		String custNo = scanner.nextLine();
		System.out.println("Enter Customer Name");
		String custName = scanner.nextLine();
		System.out.println("Enter Customer category:");
		String category = scanner.nextLine();
		
		
		Customer cust = new Customer(custNo, custName, category);
		System.out.println(cust);
		scanner.close();
		
	}

}
