package cadenas;

import java.util.Scanner;

public class SubcadenasPos {

	public static void main(String[] args) {
		// Escribe un programa que pida una cadena. Posteriormente, el programa
		// dejará que el usuario inserte cinco subcadenas con el fin de informar si
		// la primera tiene las subcadenas indicadas. Se debe indicar en que
		// posición se encontró y la última.

		Scanner teclado = new Scanner(System.in);
		System.out.println("escribe una cadena: ");
		String cadena = teclado.nextLine();
		String[] subcadenas = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("inserte subcadena: ");
			subcadenas[i] = teclado.nextLine();
			if (cadena.contains(subcadenas[i])) {
				System.out.println("Se encontró primero en la posicion "
						+ cadena.indexOf(subcadenas[i])
						+ " y la ultima vez en la posicion "
						+ cadena.lastIndexOf(subcadenas[i]));
			} else
			{
				System.out.println("No es una subcadena de " + cadena);
			}
		}
	}

}