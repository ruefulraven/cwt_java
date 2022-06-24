package com.StudentWithComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortDemo {

	
	public static void main(String[] args) {
		Student stud1 = new Student(1, "Axel");
		Student stud2 = new Student(2, "Bajan");
		Student stud3 = new Student(3, "Erick");
		Student stud4 = new Student(4, "Eya");
		Student stud5 = new Student(5, "Alli");
		Student stud6 = new Student(3, "Bajan");
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(stud1);
		studentList.add(stud2);
		studentList.add(stud3);
		studentList.add(stud4);
		studentList.add(stud5);
		studentList.add(stud6);
		
		studentList.forEach(p -> System.out.println(p));
		
		Collections.sort(studentList);
		System.out.println();
		
		studentList.forEach(p -> System.out.println(p));
		
	}
	
}
