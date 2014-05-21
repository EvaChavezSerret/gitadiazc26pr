package bucles_for;

import java.util.Scanner;

//Imprimir la tablas de multiplicar que el usuario elija.
//Con acumulador

public class Ejemplo_tabla_multi {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce el número del que quieras su tabla de multiplicar:");
		
		int numero = teclado.nextInt();
		int linea;
		
		for (linea = 1; linea <= 10; linea ++) {
			System.out.println(numero + " x " + linea + " = " + (numero*linea));
		}
		teclado.close();

	}

}
