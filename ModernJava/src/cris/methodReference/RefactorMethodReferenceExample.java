package cris.methodReference;

import java.util.function.Predicate;

import cris.functionalInterfaces.Student;
import cris.functionalInterfaces.StudentDataBase;

public class RefactorMethodReferenceExample {

	public static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

	/*
	 * Refactor
	 */
//	public static Predicate<Student> p3 = Student::isGPAGreaterThan(3.9);
	static Predicate<Student> p3 = RefactorMethodReferenceExample::isGPAGreaterThan;

	public static Boolean isGPAGreaterThan(Student s) {
		return s.getGpa() > 3.9;
	}
	
	public static void main(String[] args) {
		System.out.println(p2.test(StudentDataBase.studentSupplier.get()));
		System.out.println(p3.test(StudentDataBase.studentSupplier.get()));
	}

}
