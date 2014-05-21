package bifurcaciones_iniciacion_if_else;

import java.util.Scanner;

public class Ejercicio2_numpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");		
		int numero=teclado.nextInt();
		
		if (numero % 2 == 0){
			System.out.printf("El número %d introducido es par",numero);
		}
		else {
			System.out.println("Solo se visualizan los números par.");
		}
		teclado.close();
	}
}
