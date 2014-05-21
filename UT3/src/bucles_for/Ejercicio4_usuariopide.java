package bucles_for;

import java.util.Scanner;

// Escribe un programa que pida tantos n�meros como el usuario del programa indique al principio. 
// El programa mostrar� al final la media y si se ha insertado un n�mero par.

public class Ejercicio4_usuariopide {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int i,n;
		int cuantos;
		int media = 0;
		int suma = 0;
		boolean pares = false;
		
		System.out.println("�Cuantos n�meros quieres ingresar? ");
		
		cuantos = teclado.nextInt();
		
		for (i = 0; i < cuantos; i ++) {
			System.out.println("N�mero: ");
			n = teclado.nextInt();
			suma += n;
			media = suma/cuantos;
			if (n % 2 == 0){
			pares = true;
			}
		}
		
		System.out.println("La media es: " + media);
		System.out.println("�Hay n�meros pares? " + ((pares)?"SI":"NO"));
		
		teclado.close();

	}

}
