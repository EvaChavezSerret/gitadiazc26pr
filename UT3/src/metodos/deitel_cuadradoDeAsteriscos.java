package metodos;

import java.util.Scanner;

public class deitel_cuadradoDeAsteriscos {
	// Página 272 del libro deitel en Castellano, ejercicio 18
	public static void main(String[] args) {
		
		int lado;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el lado cuadrado que quieres dibujar: ");
		
		lado = teclado.nextInt();
		
		cuadradoDeAsteriscos(lado);
		
		
		teclado.close();
	}

	public static void cuadradoDeAsteriscos(int lado){
		
		int x = lado;
		for(int j = 0; j<x;j++){
			for(int i = 0; i<x;i++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
