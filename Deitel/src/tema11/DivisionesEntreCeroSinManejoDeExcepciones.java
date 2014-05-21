package tema11;

import java.util.Scanner;

public class DivisionesEntreCeroSinManejoDeExcepciones {
	// demuestra el lanzamiento de una excepción cuando ocurre una división entre cero
	
	public static int cociente(int numerador, int denominador){
		return numerador/denominador; //posible división entre cero
	}// fin del metodo cociente
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca un numerador entero: ");
		int numerador = teclado.nextInt();
		System.out.print("Introduzca un denominador entero: ");
		int denominador = teclado.nextInt();
		
		int resultado = cociente(numerador,denominador);
		System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
	
		teclado.close();
	}//fin del main

}//fin de la clase
