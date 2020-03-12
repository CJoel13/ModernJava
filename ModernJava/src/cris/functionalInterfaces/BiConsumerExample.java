package cris.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void main (String[] args) {
		
		BiConsumer<String, String> biconsumer = (a,b) -> System.out.println("a: " + a + " --- b: " + b);
		biconsumer.accept("Cris", "Lulu");
		
		printNameAndActivities();
	}
	
	public static void printNameAndActivities() {
		BiConsumer<String, List<String>> biconsumer2 = (a,b) -> System.out.println("Name: " + a + " -- Activities: " + b);
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach(student -> biconsumer2.accept(student.getName(), student.getActivities()));
		
	}

}
