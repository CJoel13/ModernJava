package cris.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main (String[] args) {
		
		Consumer<String> consumer = (s) -> System.out.println("Consumer: " + s.toUpperCase());
		consumer.accept("cristian Java");
		
//		printName();
//		printStudents();
//		printNameAndActivities();
		printNameAndActivitiesUsingCondition();
	}
	
	public static void printName() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((student) -> System.out.println("Nombre: " + student.getName()));		
	}
	
	public static void printStudents() {
		Consumer<Student> c1 = (student) -> System.out.println(student.toString()); 
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c1);
	}
	
	public static void printNameAndActivities() {
		Consumer<Student> c1 = (student) -> System.out.println("Name: " + student.getName());
		Consumer<Student> c2 = (student) -> System.out.println("Activities: " + student.getActivities());
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c1.andThen(c2));	
	}
	
	public static void printNameAndActivitiesUsingCondition() {
		Consumer<Student> c1 = (student) -> System.out.println("Name: " + student.getName());
		Consumer<Student> c2 = (student) -> System.out.println("Activities: " + student.getActivities());
		
		List<Student> studentList = StudentDataBase.getAllStudents();
//		studentList.forEach(c1.andThen(c2));
		
		studentList.forEach((student) -> {
			if(student.getGradeLevel()>=3 && student.getGpa()>=3.9) {
				c1.andThen(c2).accept(student);
			}
		});
		
		
	}
	
	
	

}
