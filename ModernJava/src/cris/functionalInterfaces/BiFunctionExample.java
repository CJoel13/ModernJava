package cris.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/*
 * BiFunction
 * 
 * Pasar lista de Student y Predicado
 * Recibir Map
 */

public class BiFunctionExample {
	
	public static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> bifunction = (list,predicate) -> {
		Map<String,Double> map = new HashMap<>();
		
		list.forEach((student) -> {
			if(predicate.test(student)) {
				map.put(student.getName(), student.getGpa());
			}			
		});
		return map;
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(bifunction.apply(StudentDataBase.getAllStudents(), PredicateStudent2.p2));

	}

}
