package ejerciciosArrays;

import java.util.Scanner;

public class CaracterV2 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida al usuario la introducción de un
		 * caracter hasta que este pulse el caracter @. El programa debe mostrar
		 * las veces que se ha escrito cada caracter. Recordad que los
		 * caracteres tienen asociado un número (código) que comienza por cero.
		 */

		Scanner teclado = new Scanner(System.in);
		String texto = "";
		int charAlto = 0;
		int posicionAt = 0;
		int[] chars;

		while ((posicionAt = texto.indexOf("@")) == -1) {
			texto += teclado.nextLine();
		}

		for (int i = 0; i < texto.length(); i++)
			if (charAlto < texto.charAt(i))
				charAlto = texto.charAt(i);

		chars = new int[charAlto + 1];
		for (int i = 0; i < posicionAt; i++)
			chars[texto.charAt(i)]++;

		System.out.println("Número de caracteres:");
		for (int i = 0; i < chars.length; i++)
			if (chars[i] > 0)
				System.out.printf(" %s [%4d] => %4d\n", (char) i, i, chars[i]);

		teclado.close();

	}


}