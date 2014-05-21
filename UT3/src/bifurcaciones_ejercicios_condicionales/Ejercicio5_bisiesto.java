package bifurcaciones_ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicio5_bisiesto {
	// Un año es bisiesto si es divisible entre 4, excepto el último de cada siglo (aquel divisible por 100), 
	// salvo que este último sea divisible por 400 http://es.wikipedia.org/wiki/Año_bisiesto. 
	// Haz un programa que pida un año y muestre un mensaje de si es o no bisiesto.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int año;
		
		System.out.println("Introduce un año, para saber si es bisiesto: ");
		año = teclado.nextInt();
		
		if (año % 4 == 0) {
			if(año % 100 !=0){
				System.out.println("El año " + año + " si es bisiesto.");
			}else{
				if(año % 400 == 0){
					System.out.println("El año " + año + " si es bisiesto.");
				}else{
					System.out.println("no es bisiesto.");
				}
			}
		}else{
			System.out.println("no es bisiesto.");
			teclado.close();
		}
	}

	}


