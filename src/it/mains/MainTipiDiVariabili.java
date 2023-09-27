package it.mains;

public class MainTipiDiVariabili {
	
	static String variabileDiClasseStatic /*static field / campo statico*/ = "La variabile di classe static si trova nella classe, ma ha una unica locazione di memoria legata alla classe e non è associata a ogni singola istanza";
	final static String costante = "La costante è sia \"final\", che \"static\" e può essere inizializzata una sola volta.";
	static final String convenzione_per_le_costanti = "\n test: da \"static final\" a \"final static\"";
	
	public static void main(String[] args) {
		//TEST 1
		String variabileLocale = "La variabile locale si trova all'interno di un metodo.";
		System.out.println(variabileLocale);

		//TEST 2
		NestedClass nc = new NestedClass();
		System.out.println(nc.getVariabileDiIstanza());
		
		//TEST 3
		System.out.println(variabileDiClasseStatic);
		variabileDiClasseStatic = "e può cambiare valore.";
		System.out.println(variabileDiClasseStatic);

		//TEST 4
		System.out.println(costante);
		/*
		costante = "test";//Errore: The final field MainTipiDiVariabili.costante cannot be assigned
		System.out.println(variabileDiClasseStatic);
		 */
		System.out.println(convenzione_per_le_costanti);
	}

	static class NestedClass {

		String variabileDiIstanza /* "field" / "campo" */ = "La variabile di istanza si trova all'interno di una classe.";

		String getVariabileDiIstanza() {
			return variabileDiIstanza;
		}

	}

}
