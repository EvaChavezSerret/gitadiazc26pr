package arrays;

import java.util.Scanner;
import java.util.Arrays;
// Introduces 10 números y los imprime al reves.

public class Ejemplo_enteros {

	public static void main(String[] args) {
		int[] enteros;
		Scanner teclado;
		
		teclado = new Scanner(System.in);
		
		enteros = new int[10];
		
		for(int i=0;i<10;i++){
			System.out.println("Inserta un número:");
			enteros[i]=teclado.nextInt();
		}
		
		System.out.println(Arrays.toString(enteros));
		
		for(int i = 9; i >= 0; i--)
			
		System.out.print(" " + enteros [i]);
		
		teclado.close();

	}

}
