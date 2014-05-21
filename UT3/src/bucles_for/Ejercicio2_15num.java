package bucles_for;

import java.util.Scanner;

// Visualizar los 15 primeros números naturales del 15 al 1. Primero utilizar una estructura while, luego una for.
public class Ejercicio2_15num {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Números del 1 al 15: ");
		
		//int numero = 1;
		int i;
		i = 0;
		/*
		
		while (i < 15) {
			System.out.print(numero + "   ");
			i++;
			numero++;
		}
		*/
		for (i = 15; i > 0; i --) {
			System.out.print(i + "   ");
			}
		
		teclado.close();
		
	}

}
