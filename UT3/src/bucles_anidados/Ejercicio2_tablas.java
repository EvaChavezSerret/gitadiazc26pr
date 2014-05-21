package bucles_anidados;

import java.util.Scanner;
// Modifica el ejercicio de la tabla de multiplicar de forma que el usuario vaya introduciendo números 
// y se vayan imprimiendo las tablas correspondientes. El programa termina cuando se introduce un número no esté entre 1 y 10.

public class Ejercicio2_tablas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce el número del que quieras su tabla de multiplicar:");
		
		int numero = teclado.nextInt();
		int linea;
		
		do{
		linea = 1;
			do {
				System.out.println(numero + " x " + linea + " = " + (numero * linea));
				linea++;
			} while (linea<=10);
		
		System.out.println("Introduce otro número del que quieras su tabla de multiplicar:");
		
		numero = teclado.nextInt();
		
		}while (numero > 0 && numero <=10);
		
		System.out.println("El programa no calcula con número mayores de 10");
		
			teclado.close();

	}

}
