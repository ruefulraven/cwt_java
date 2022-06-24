import java.util.ArrayList;
import java.util.Iterator;

public class Student {

	private ArrayList<String> names = new ArrayList<>();
	
	private String[] nameArr;
	
	public Student(String[] name) {
		this.nameArr = name;
	}
	
	public void setNames() {
		for(String studName : nameArr) {
			names.add(studName);
		}
		System.out.println("Names have been added.");
	}
	
	public void seachName(String Studname) {
		names.forEach(name -> {
			if(name.equals(Studname)) {
				System.out.println("Searching by Name: " + name + " does exist.");
			}
		});
	}
	
	public void seachName(int index){
		try {
			if(names.get(index) != null) {
				System.out.println("Searching by Index: " + names.get(index) + " does exist.");
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Student youre searching for via Index search does not exist.");
		}
		
	}	
	
	public void printNames() {
		Iterator<String> itr = names.iterator();
		itr.forEachRemaining(p -> System.out.println(p));
	}
	
	public void removeName(String studentName) {
		names.removeIf((name) -> name.equals(studentName));
		
	}
}
