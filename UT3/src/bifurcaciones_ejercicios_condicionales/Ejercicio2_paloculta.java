package bifurcaciones_ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicio2_paloculta {
	// Crea un programa que tiene una palabra oculta. 
	// El programa pregunta la contraseña al jugador, si la adivina muestra un mensaje de éxito. Si no, muestra el error.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String paloculta;
		String palintro;
		paloculta = "ordenador";
		
		System.out.println("¿Cual es la herramienta más util? ");
		palintro = teclado.nextLine();
		palintro = palintro.toLowerCase();
		
		if (paloculta.equals(palintro)) {
			System.out.println("CORRECTO");
		} else {
			System.out.println("No has tenido suerte... estaba pensando en el " + paloculta);
		}
		teclado.close();
		
	}

}
