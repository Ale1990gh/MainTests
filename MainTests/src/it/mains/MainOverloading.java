package it.mains;

public class MainOverloading {

	public static void main(String[] args) {
		metodo();
		
		int num = 5;
		metodo(num);
		
		char c = 'a';
		System.out.println("prova3: " + metodo(c));

		/*
		 * Overloading:
		 * 	posso ad esempio chiamare un metodo nello stesso
		 * 	modo, ma la firma deve essere diversa !
		 */

	}
	
	private static void metodo() {
		System.out.println("prova1: " + (1 + 1));
	}
	
	private static void metodo(int numero) {
		System.out.println("prova2: " + (numero + 1));
	}
	
	private static char metodo(char lettera) {
	 	return lettera;
	}

}
