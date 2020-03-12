package cris.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample2 {
	public static void main(String[] args) {
		
		Predicate<Integer> p1_Menor = (i) -> i<10;
		Predicate<Integer> p1_Mayor = (i) -> i>5;
		
		System.out.println(p1_Mayor.and(p1_Menor).test(7));
		
	}

}
