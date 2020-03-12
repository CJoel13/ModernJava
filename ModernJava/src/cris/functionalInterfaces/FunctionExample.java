package cris.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
	
	public static Function<String, String> f2 = (s) -> {return s.toUpperCase().concat(" default");};
	
	public static void main(String[] args) {
		
		Function<String, String> f1 = (s) -> s.toUpperCase();
		
		
		System.out.println(f1.apply("hola"));
		System.out.println(f1.andThen(f2).apply("hola"));
		System.out.println(f1.compose(f2).apply("hola"));
		
	}

}
