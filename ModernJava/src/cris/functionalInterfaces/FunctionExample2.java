package cris.functionalInterfaces;

public class FunctionExample2 {

	public static String concatenar(String str) {
		return FunctionExample.f2.apply(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Llamar m�todo que regrese resultado de funci�n.
		 */
		
		String result = concatenar("helloworld");
		System.out.println("Resultado: " + result);

	}

}
