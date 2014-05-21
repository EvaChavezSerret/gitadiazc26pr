package bifurcaciones_ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicio1_numoculto {
	// Crea un programa que tiene un numero oculto (del 1 al 10). 
	// El programa pregunta el número al jugador, si la adivina muestra un mensaje de éxito. Si no, muestra el error.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numoculto;
		int numintro;
		numoculto = (int) (Math.random() * 10 +1);
		// System.out.println(numoculto);
		
		System.out.println("Dime un número del 1 al 10, a ver si aciertas el que estoy pensando: ");
		numintro = teclado.nextInt();
		
		if (numoculto == numintro) {
			System.out.println("CORRECTO");
		} else {
			System.out.println("No has tenido suerte... estaba pensando en el " + numoculto);
		}
		teclado.close();
		
	}

}
