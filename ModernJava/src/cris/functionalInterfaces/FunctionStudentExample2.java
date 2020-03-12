package cris.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<List<Student>, Map<String, Double>> getMap  = (list) -> {
			Map<String, Double> map = new HashMap<String, Double>();
			list.forEach((student) -> {
				if(PredicateStudent2.p2.test(student)) {
					map.put(student.getName(), student.getGpa());
				}
			});
			return map;
		};
		
		System.out.println(getMap.apply(StudentDataBase.getAllStudents()));

	}

}
