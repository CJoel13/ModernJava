package cris.functionalInterfaces;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/*
 * Clase para practicar uso de interfaz funcional Function
 * 
 * Objetivo: Enviar una lista de estudiantes y obtener como resultado
 * un HashMap de estudiante - GPE
 */

public class FunctionStudentExample {
	
	public static List<Student> studentList = StudentDataBase.getAllStudents();

	public static Map<String, Double> map = new HashMap<String,Double>();
	
	public static Comparator<Student> sortByName = (s1, s2) -> s1.getName().compareTo(s2.getName());
	
	public static BiConsumer<String, Double> b1 = (name, gpa) -> {
		System.out.println("Name: " + name + " --- GPA: " + gpa);
	};

	public static Function<List<Student>, Map<String, Double>> getMap = (list) -> {		
		list.forEach((student) -> {
			map.put(student.getName(), student.getGpa());
		});
		return map;		
	};
	
	public static Function<List<Student>, List<Student>> sortList = (list) -> {
		list.sort(sortByName);
		return list;
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMap(studentList);
	}
	
	public static void printMap (List<Student> studentList){
		Map<String, Double> hm = getMap.compose(sortList).apply(studentList);
		hm.forEach(b1);
	}
	
//	public static Function<List<Student>, List<Student>> sortList = (list) -> {
//		list.sort((o1, o2) -> {
//			
//		});
//	}
	
	
}
