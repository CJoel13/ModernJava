package cris.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateStudentExample {
	
	static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
	static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;
	static List<Student> studentList = StudentDataBase.getAllStudents();
	
	public static void main(String[] args) {
		
		printByGradeAndGpa();
		System.out.println("\n");
		printByGrade();
		
		Consumer<String> c1 = (s) -> System.out.println("cons: " + s);
		
		
		
	}
	
	public static void printByGradeAndGpa() {
		studentList.forEach((student) -> {
			if(p1.and(p2).test(student)) {
				System.out.println(student);
			}
		});
	}
	
	public static void printByGrade() {
		studentList.forEach((student) -> {
			if(p1.and(p1).test(student)) {
				System.out.println(student);
				}
		});
	}
	

}
