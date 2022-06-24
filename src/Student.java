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
	
	public void seachName(String name) {
		if(names.contains(name)) {
			System.out.println("Searching by Name: " + name + " does exist.");
		}else {
			System.out.println("Searching by Name: " + name + " does not exist.");
		}
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
		if(names.contains(studentName)) {
			int index = names.indexOf(studentName);
			names.remove(index);
			//names.remove(names.indexOf(studentName));
			System.out.println("Student " + studentName + " has been removed");
		}else {
			System.out.println("Student " + studentName + " Does not exists.");
		}
	}
}
