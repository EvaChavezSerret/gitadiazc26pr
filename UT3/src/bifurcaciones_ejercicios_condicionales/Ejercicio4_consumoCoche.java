package bifurcaciones_ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicio4_consumoCoche {
	// El ordenador de nuestro coche calcula los kilómetros que nos quedan antes de repostar. 
	// Crea un programa que pida: tamaño del depósito (en litros), porcentaje del depósito que está lleno y litros
	// de consumo por 100kms. El programa mostrará los kilómetros que quedan de autonomía.
	// Si quedan menos de 30 kilómetros mostrará un aviso de que hay que repostar porque estamos usando la reserva

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double tamaño;
		double porcentaje;
		double consumo;
		double autonomia;
		double mequedan;
		
		System.out.println("¿Cuanta capacidad en litros tiene el depósito de tu coche? ");
		tamaño = teclado.nextDouble();
		
		System.out.println("¿Qué porcentaje de depósito tienes lleno? ");
		porcentaje = teclado.nextDouble();
		
		System.out.println("¿Cuanto consume a los 100km tu coche? ");
		consumo = teclado.nextDouble();
		
		mequedan = (tamaño * porcentaje) / 100;
		
		autonomia = (100 * mequedan) / consumo;
				
		if (autonomia < 30) {
			System.out.println("Ve a repostar, el coche está en la reserva.");
		} else {
			System.out.println("Te quedan " + autonomia + " km de autonomia");
		}
		teclado.close();
	
	}

}
