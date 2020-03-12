package cris.streams;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import cris.functionalInterfaces.Student;
import cris.functionalInterfaces.StudentDataBase;

public class MapExample {
	
	static Function<Student, String> f1 = (student) -> {
		return student.getName();
	};
	
	public static void main(String[] args) {
		Set<String> nameSet = StudentDataBase.getAllStudents().stream()
//			.map(Student::getName)
			.map(f1)
			.collect(Collectors.toSet());
		
		System.out.println(nameSet);
	}

}
