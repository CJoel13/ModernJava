package cris.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateStudent2 {
	public static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;
	public static void main(String[] args) {
		
		Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
		
		
		BiPredicate<Student, Student> p3 = (s1, s2) -> s1.getGradeLevel()>=3 && s2.getGpa() >= 3.9;
		BiPredicate<Integer, Double> p4 = (grade, gpa) -> grade>=3 && gpa>= 3.9;
		
		Consumer<Student> c1 = (s) -> System.out.print(s.getName() + " -- ");
		Consumer<Student> c2 = (s) -> System.out.println(s.getGpa());
		
		BiConsumer<String, List<String>> b1 = (name,activities) -> System.out.println("Name: " + name + " -- Activities: " + activities); 
		
		/*
		 * Imprimir info de estudiantes que cumplan con condiciones
		 */
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach((student) -> {
			if(p1.and(p2).test(student)) {
//				c1.andThen(c2).accept(student);
				b1.accept(student.getName(), student.getActivities());
				
			}
		});
		
		System.out.println("-----");
		
		studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
		
		
		/*
		 * Envío a BiPredicate con objeto student 
		 
		studentList.forEach((student) -> {
			if(p3.test(student, student)) {
				b1.accept(student.getName(), student.getActivities());
			}
		});
		*/
		
		/*
		 * Envío a BiPredicate con parametros
		 */
		studentList.forEach((student) -> {
			if(p4.test(student.getGradeLevel(), student.getGpa())){
				b1.accept(student.getName(), student.getActivities());
			}
		});
		
		
		
	}

}
