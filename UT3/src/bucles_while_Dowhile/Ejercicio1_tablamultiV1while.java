package bucles_while_Dowhile;

import java.util.Scanner;

// Imprimir la tablas de multiplicar que el usuario elija.
// Tengo el diagrama del ejercicio en la carpeta de diagramas

public class Ejercicio1_tablamultiV1while {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce el número del que quieras su tabla de multiplicar:");
		
		int numero = teclado.nextInt();
		int linea;
		
		linea = 1;
		while (linea<=10) {
			System.out.println(numero + " x " + linea + " = " + (numero * linea));
			linea++;
		}
		teclado.close();

	}

}
