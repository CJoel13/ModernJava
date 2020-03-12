package cris.functionalInterfaces;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ComparatorExample {
	
	static List<Student> studentList = StudentDataBase.getAllStudents();
	
	public static void main(String[] args) {
//		sortByName();
//		sortByNameSimplificado();
		sortByGPASimplificado();
		
	}
	
	public static void sortByName() {
		/*
		 * Implementación de Comparator ordenando por nombre //Sobreescribiendo método compare
		 * Para que método de "List" - sort, pueda tener Comparator		 
		 */		
		Comparator<Student> c1 = (s1,s2) -> s1.getName().compareTo(s2.getName());		
		studentList.sort(c1);
		/*
		 * Implementación de Consumer imprimiendo "toString()"
		 * Para que métido forEach tenga Consumer. 
		 */		
		Consumer<Student> con1 = (s1) -> System.out.println(s1.toString());		
		studentList.forEach(con1);
		
		/*
		 * Util utilizar declaración separada de Consumer<T> cuando se requieren distintas implementaciones.
		 */
	}
	
	public static void sortByNameSimplificado() {
		/*
		 * Ordentar lista de Students (studentList) por nombre
		 * Imprimir toString de cada elemento
		 */
		studentList.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
		studentList.forEach((s) -> System.out.println(s.toString()));
		
	}
	
	public static void sortByGPASimplificado() {
		/*
		 * Ordentar lista de Students (studentList) por nombre
		 * Imprimir toString de cada elemento
		 */
		studentList.sort((s1, s2) -> Double.compare(s1.getGpa(), s2.getGpa()));
		Consumer<Student> c1 = (c) -> System.out.print("Name: " + c.getName());
		Consumer<Student> c2 = (c) -> System.out.println(" GPA: " + c.getGpa());
//		studentList.forEach((s) -> System.out.println(s.getName()));
		studentList.forEach(c1.andThen(c2));
		
	}
	  
	
	

}
