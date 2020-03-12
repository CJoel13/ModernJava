package cris.lambdas;

import java.util.function.Consumer;

public class LambdaLocalVariable1 {
	
	static int k = 5;
	
	public static void main(String[] args) {
		
//		int j = 4; //No compila
		int i = 4;
		
		Consumer<Integer> c1 = (j) -> {
			j++;	//OK
//			i++;	//No compila
			k++;	//OK
			System.out.println("Value is: " + j + " Value of instance Variable is: " + k);
		};
		
		c1.accept(4);
		
	}

}
