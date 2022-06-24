
public class TestHashMap {

	public static void main(String[] args) {
		String[] rollNo = {"1", "2"};
		String[] Names = {"Axel", "Bajan"};
		Employee emp = new Employee(rollNo, Names);
		
		emp.setNames();
		System.out.println();
		
		emp.printNames();
		System.out.println();
		
		emp.getName("1");
		System.out.println();
		
		emp.printNamesKeySet();
		System.out.println();
		
		emp.printSize();
		System.out.println();
		
		emp.remove("1");
		System.out.println();
		
		emp.printNames();
	}

}
