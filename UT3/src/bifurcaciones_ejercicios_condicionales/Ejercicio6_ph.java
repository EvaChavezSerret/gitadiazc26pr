package bifurcaciones_ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicio6_ph {
// Escribe un programa que pida el ph de una soluci�n y muestre el mensaje de si la soluci�n es �cida (ph < 7.0)
// o peligr�samente �cida: ph < 3.0).
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String phdado = "";
		float ph;
		
		System.out.println("Escribe el ph de una soluci�n: ");
		phdado = teclado.next();
		ph = Float.parseFloat(phdado);
		
		
		if (ph < 7.0f && ph > 3.0f) {
			System.out.println("La soluci�n con ph "+ ph + " es �cida.");
		} else if (ph <= 3.0f ) {
			System.out.println("La soluci�n con ph "+ ph + " es peligrosamente �cida.");
		}else{
			System.out.println("La soluci�n con ph "+ ph + " no tiene consideraci�n determinada.");
		}
		teclado.close();
	}

}
