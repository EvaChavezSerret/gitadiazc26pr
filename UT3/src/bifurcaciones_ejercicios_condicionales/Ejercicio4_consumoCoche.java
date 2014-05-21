package bifurcaciones_ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicio4_consumoCoche {
	// El ordenador de nuestro coche calcula los kil�metros que nos quedan antes de repostar. 
	// Crea un programa que pida: tama�o del dep�sito (en litros), porcentaje del dep�sito que est� lleno y litros
	// de consumo por 100kms. El programa mostrar� los kil�metros que quedan de autonom�a.
	// Si quedan menos de 30 kil�metros mostrar� un aviso de que hay que repostar porque estamos usando la reserva

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double tama�o;
		double porcentaje;
		double consumo;
		double autonomia;
		double mequedan;
		
		System.out.println("�Cuanta capacidad en litros tiene el dep�sito de tu coche? ");
		tama�o = teclado.nextDouble();
		
		System.out.println("�Qu� porcentaje de dep�sito tienes lleno? ");
		porcentaje = teclado.nextDouble();
		
		System.out.println("�Cuanto consume a los 100km tu coche? ");
		consumo = teclado.nextDouble();
		
		mequedan = (tama�o * porcentaje) / 100;
		
		autonomia = (100 * mequedan) / consumo;
				
		if (autonomia < 30) {
			System.out.println("Ve a repostar, el coche est� en la reserva.");
		} else {
			System.out.println("Te quedan " + autonomia + " km de autonomia");
		}
		teclado.close();
	
	}

}
