package cris.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	
	static Predicate<Integer> p = (a) -> a%2==0;
//	System.out.println(p.test(4));  
	static Predicate<Integer> p1 = (a) -> a%3==0;
	
	public static void main(String[] args) {
		predicateAnd();
		predicateOr();
		predicateNeg();
	}
	
	public static void predicateAnd() {
		System.out.println(p.and(p1).test(9));
	}
	
	public static void predicateOr() {
		System.out.println(p.or(p1).test(9));
	}
	
	public static void predicateNeg() {
		System.out.println(p.negate().test(9));
	}

}
