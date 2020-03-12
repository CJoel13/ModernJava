package cris.constructorReference;

import java.util.function.Function;
import java.util.function.Supplier;

import cris.functionalInterfaces.Student;

public class ConstructorReferenceExample {
	
	/*
	 * Supplier - Constructor con 0 argumentos
	 */
	static Supplier<Student> supplierStudent = Student::new;
	
	/*
	 * Function - Constructor con 1 argumento
	 */
	static Function<String, Student> f1 = Student::new;
	
	public static void main(String[] args) {
		System.out.println(supplierStudent.get());
		System.out.println(f1.apply("Joe"));
	}

}
