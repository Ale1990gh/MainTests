package it.mains;

public class MainBoxingUnBoxingAutoBoxing {

	static boolean b = true;

	public static void main(String[] args) {

		testBoxing();
		testUnBoxing();
		testAutoBoxing();

		ultimoTest();
		
	}

	private static void testBoxing() {

		//Esempio di boxing:
		Boolean bWrapped = new Boolean(true);

		test(bWrapped, "-----------------\ntestBoxing()\n\nEsempio di boxing:\nBoolean bWrapped = new Boolean(true);\n");

	}

	private static void testUnBoxing() {

		//Esempio di Unboxing:
		Boolean bWrapped = b;

		test(bWrapped, "-----------------\ntestUnboxing()\n\nEsempio di Unboxing:\nBoolean bWrapped = b;\n");

	}

	private static void testAutoBoxing() {

		//Esempio di Autoboxing:
		Boolean bWrapped = true;

		test(bWrapped, "-----------------\ntestAutoboxing()\n\nEsempio di Autoboxing:\nBoolean bWrapped = true;");

	}

	private static void test(Boolean bWrapped, String testInCorso) {

		System.out.println("\n" + testInCorso);

		if (b == bWrapped) {
			System.out.println("test valore \"b\" e \"bWrapped\": stesso valore");
		}
		if (bWrapped instanceof Boolean) {
//			Object o = "stringa";
//			Class c = b.getClass();//Cannot invoke getClass() on the primitive type boolean
			Class c = bWrapped.getClass();//no con le classi primitive! Solo Object o classi Wrapper.
			System.out.println("bWrapped è una istanza di " + c.getName());
		}
//		if (b instanceof boolean) {//Errore: Syntax error, insert "Dimensions" to complete ArrayType
//			System.out.println("b: " + b);}

	}

	private static void ultimoTest() {
		NestedClass nc = new NestedClass();
		System.out.println("\n-----------------\nultimoTest()\n"
								+ "nc.typeof(1): " + nc.typeof(1));
//		System.out.println("nc.typeof(1): " + nc.typeof(false));//Errore: The method typeof(Integer) in the type MainBoxingUnBoxingAutoBoxing.NestedClass is not applicable for the arguments (boolean)
//		System.out.println("nc.typeof(1): " + nc.typeof("test"));//Errore: The method typeof(Integer) in the type MainBoxingUnBoxingAutoBoxing.NestedClass is not applicable for the arguments (String)		
	}

	static class NestedClass {
		static Class typeof(Integer inc) {
			return inc.getClass();
		}
	}

}
