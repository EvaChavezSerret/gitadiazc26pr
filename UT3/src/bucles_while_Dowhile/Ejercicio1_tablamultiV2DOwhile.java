package bucles_while_Dowhile;

import java.util.Scanner;

// Imprimir la tablas de multiplicar que el usuario elija.
// Con acumulador

public class Ejercicio1_tablamultiV2DOwhile {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce el número del que quieras su tabla de multiplicar:");
		
		int numero = teclado.nextInt();
		int linea,multiplicacion;
		
		linea = 1;
		multiplicacion = numero;
		do  {
			System.out.println(numero + " x " + linea + " = " + (multiplicacion));
			linea++;
			multiplicacion+=numero; // multiplicacion = multiplicacion + numero;
		} while (linea<=10);
		teclado.close();

	}

}
