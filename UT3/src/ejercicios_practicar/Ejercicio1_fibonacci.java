package ejercicios_practicar;

import java.util.Scanner;

// Crea una colecci�n con los primeros X n�meros de la serie de Fibonacci, donde X es un n�mero que pedir�s al usuario. 
// Despu�s pregunta n�meros y di si est� en esa serie o no. El programa terminar� cuando el usuario introduzca un 0.
public class Ejercicio1_fibonacci {

	public static void main(String[] args) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		int numero, i, introducido;

		int[] cantidad = null;

		System.out
				.print("Introduce un numero mayor que 1 para generar la sucesi�n de Fibonacci o 0 para salir del programa: ");
		numero = teclado.nextInt();

		cantidad = new int[numero];

		System.out.println("Los " + numero
				+ " primeros t�rminos de la sucesi�n de Fibonacci son:");

		cantidad[0] = 1;
		cantidad[1] = 1;

		System.out.println("Serie pedida: ");
		System.out.print(cantidad[0] + " " + cantidad[1]);
		
		for (i = 2; i < numero; i++) {
			cantidad [i] = cantidad[i-1]+cantidad[i-2];
			System.out.print(" " + cantidad[i]);
		}
		System.out.println();
		do {

			System.out
					.println("Introduce un n�mero y te digo si est� en la sucesi�n:");
			introducido = teclado.nextInt();
			
			if (introducido != 0){
				boolean encontrado = false;
				i = 0;
				while(!encontrado && i<numero){
					if(cantidad[i] == introducido){
						encontrado = true;
						System.out.println("El n�mero " + introducido + " si est� en la serie generada.");
					}
					i++;
				}
				if(!encontrado){
					System.out.println("El n�mero " + introducido + " no est� en la serie generada.");
				}
			}

		} while (introducido != 0);
		System.out.println("�Hasta pronto!");

		teclado.close();
	}

}
