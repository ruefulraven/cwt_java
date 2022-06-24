
public class ArrayListDemo {

	public static void main(String[] args) {
		String[] studentList = {"Axel", "Eli", "Alli", "QWERTY"};
		Student stud = new Student(studentList);
		
		stud.setNames();
		System.out.println();
		
		stud.seachName("Axel");
		System.out.println();
		
		stud.seachName(4);
		System.out.println();
		
		stud.printNames();
		System.out.println();
		
		stud.removeName("Axel");
		System.out.println();
		
		stud.printNames();
	}
	
	
}
