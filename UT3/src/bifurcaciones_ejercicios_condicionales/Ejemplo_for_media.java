package bifurcaciones_ejercicios_condicionales;

import java.util.Scanner;

public class Ejemplo_for_media {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce tres números y te hago la media: ");
		
		int suma = 0;
		
		for (int i = 0; i <= 2; i++){
			suma += teclado.nextInt();
		}
		System.out.println("Media: " + suma/3);
		teclado.close();
	}

}
