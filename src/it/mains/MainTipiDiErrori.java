package it.mains;

public class MainTipiDiErrori {

	public static void main(String[] args) {

		int numeroUno = 1;
		
		// Errore di sintassi:
//		int numero = 1;//IDE: Duplicate local variable numero

		// Errore di runtime:
		try {
			System.out.println(numeroUno / 0);//Errore: java.lang.ArithmeticException: / by zero at it.mains.MainTipiDiErrori.main(MainTipiDiErrori.java:14)			
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}

		// Errore logico:
		double numeroDue = 0.1;
		if ((sommaNumeri(numeroUno, numeroDue) == 1.1)) {
			System.out.println("\n(" + numeroUno  + " + " + numeroDue + ") = 1,1");
		} else {
			System.out.println("\n(" + numeroUno  + " + " + numeroDue + ") = 1");//Output: (1 + 0.1) = 1
		}

	}

	private static int sommaNumeri(int numeroUno, double numeroDue) {
//		return numeroUno + numeroDue;//Errore: Type mismatch: cannot convert from double to int
		return (int) (numeroUno + numeroDue);//IDE: Add cast to 'int'
	}

}
