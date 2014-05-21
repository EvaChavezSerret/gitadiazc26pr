package cadenas;

import java.util.StringTokenizer;

public class ContarPalabras {

	public static void main(String[] args) {

		String frase = "El perro de San Roque, ese fué.";

		StringTokenizer contar = new StringTokenizer(frase);

		System.out.println(contar.countTokens());

	}

}