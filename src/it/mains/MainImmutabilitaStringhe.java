package it.mains;

public class MainImmutabilitaStringhe {

	public static void main(String[] args) {

		String s1 = "stringa1";
		s1.concat("stringa2");
		System.out.println(s1 + "\n-----------------");//output: stringa1

		String s2 = "stringa2";
		String s3 = s1.concat(s2);
		System.out.println(s3 + "\n-----------------");//output: stringa1stringa2

		String s4 = s1.concat((String) "stringa2");
		System.out.println(s4 + "\n-----------------");//output: stringa1stringa2

		String s5 = "";
		for (int i = 0; i < s1.length(); i++) {
			s5 += s1.substring(i,i+1);
		}
		for (int i = 0; i < s2.length(); i++) {
			s5 += s2.substring(i,i+1);
		}
		System.out.println(s5 + "\n-----------------");//output: stringa1stringa2

	}

}
