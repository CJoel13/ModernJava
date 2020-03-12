package cris.methodReference;

import java.util.function.Consumer;

import cris.functionalInterfaces.Student;
import cris.functionalInterfaces.StudentDataBase;

public class ConsumerMethodReferenceExample {
	
	/*
	 * ClassName::static_methodName
	 */
	static Consumer<Student> c1 = System.out::println;
	
	static Consumer<Student> c2 = Student::printActivities;
	/*
	 * ClassName::instance_methodName
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		/*
		 * Imprimir lista de Students
		 */
		StudentDataBase.getAllStudents().forEach(c1);
		
		/*
		 * Imprimir lista de actividades
		 */
		StudentDataBase.getAllStudents().forEach(c2);
	}

}
