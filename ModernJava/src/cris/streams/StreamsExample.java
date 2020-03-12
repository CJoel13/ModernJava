package cris.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import cris.functionalInterfaces.PredicateStudent2;
import cris.functionalInterfaces.Student;
import cris.functionalInterfaces.StudentDataBase;

public class StreamsExample {	
	/*
	 * Obtener Map a partir de List
	 * Name - List of Activities
	 */
	
	/*
	 * Function implementation 1
	 */
//	static Function<Student, String> f1 = (student) -> student.getName();
//	static Function<Student, List<String>> f2 = (student) -> student.getActivities();
	
	/*
	 * Function implementation 2
	 */
//	static Function<Student, String> f1 = Student::getName;
//	static Function<Student, List<String>> f2 = Student::getActivities;
	
	/*
	 * Predicate
	 */
	static Predicate<Student> predicateStudentGPA = (student) -> student.getGpa() >= 3.9;
	static Predicate<Student> predicateStudentGrade = (student) -> student.getGradeLevel() >= 3;
	
	public static void main(String[] args) {
		Map<String, List<String>> studentMap =  StudentDataBase.getAllStudents().stream()
				.filter(predicateStudentGrade)
				.filter(predicateStudentGPA)
				.collect(Collectors.toMap(Student::getName,Student::getActivities));
		
		System.out.println(studentMap);
	}

}
