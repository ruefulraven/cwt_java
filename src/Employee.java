import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Employee{

	private String[] rollNo;
	private String[] names;
	
	private HashMap<String, String> empNames = new HashMap<>();
	
	public Employee(String[] rollno, String[] names) {
		this.rollNo = rollno;
		this.names = names;
	}
	
	public void setNames() {
		if(rollNo.length != names.length) {
			throw new ArrayIndexOutOfBoundsException("The list of roll number and list of names are not same");
		}
		
		for(int i = 0; i < rollNo.length; i++) {
			empNames.put(rollNo[i], names[i]);
		}
		System.out.println("Names has been added via HashMap");
	}
	

	public void printNames() {
		empNames.forEach((key, value) -> {
			System.out.println("Roll number: " + key + ", Student Name: " + value);
		} );
	}
	
	public void getName(String key) {
		if(!empNames.get(key).equals(null)) {
			System.out.println("Student Exists, student name is: "+ empNames.get(key));
		}else {
			System.out.println("Student does not Exists via Key");
		}
	}
	
	public void printNamesKeySet() {
		Set<String> studKeySets = empNames.keySet();
		Iterator<String> itrStudKey = studKeySets.iterator();
		itrStudKey.forEachRemaining(p -> System.out.println("Student: " + empNames.get(p)));
	}
	
	public void printSize() {
		System.out.println("The size of hashmap is: " + empNames.size());
	}
	
	public void remove(String key) {
		if(empNames.containsKey(key)) {
			empNames.remove(key);
			System.out.println("Student with key of " + key + " has been removed");
		}
	}

}
