package bifurcaciones_ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicio6_ph {
// Escribe un programa que pida el ph de una solución y muestre el mensaje de si la solución es ácida (ph < 7.0)
// o peligrósamente ácida: ph < 3.0).
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String phdado = "";
		float ph;
		
		System.out.println("Escribe el ph de una solución: ");
		phdado = teclado.next();
		ph = Float.parseFloat(phdado);
		
		
		if (ph < 7.0f && ph > 3.0f) {
			System.out.println("La solución con ph "+ ph + " es ácida.");
		} else if (ph <= 3.0f ) {
			System.out.println("La solución con ph "+ ph + " es peligrosamente ácida.");
		}else{
			System.out.println("La solución con ph "+ ph + " no tiene consideración determinada.");
		}
		teclado.close();
	}

}
