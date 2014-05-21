package bucles_for;

import java.util.Scanner;

// Escribe un programa que pida tantos números como el usuario del programa indique al principio. 
// El programa mostrará al final la media y si se ha insertado un número par.

public class Ejercicio4_usuariopide {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int i,n;
		int cuantos;
		int media = 0;
		int suma = 0;
		boolean pares = false;
		
		System.out.println("¿Cuantos números quieres ingresar? ");
		
		cuantos = teclado.nextInt();
		
		for (i = 0; i < cuantos; i ++) {
			System.out.println("Número: ");
			n = teclado.nextInt();
			suma += n;
			media = suma/cuantos;
			if (n % 2 == 0){
			pares = true;
			}
		}
		
		System.out.println("La media es: " + media);
		System.out.println("¿Hay números pares? " + ((pares)?"SI":"NO"));
		
		teclado.close();

	}

}
