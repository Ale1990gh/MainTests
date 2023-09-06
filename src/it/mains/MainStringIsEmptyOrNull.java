package it.mains;

public class MainStringIsEmptyOrNull {

	public static void main(String[] args) {
		String s = "stringa";
		verifica(s);		
		s = "";
		verifica(s);
		s = null;
		verifica(s);
	}

	private static void verifica(String s) {
		boolean check = false;
		try {
			if (s.isEmpty() || s.length() == 0) {
				check = true;
			}
		} catch (NullPointerException npe) {
			System.out.println("Eccezione: " + npe);
		} finally {
			System.out.println("Stringa = " + s + "\nè vuota?: " + check + "\n------------------");
		}
	}

}
