package bifurcaciones_ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicio5_bisiesto {
	// Un a�o es bisiesto si es divisible entre 4, excepto el �ltimo de cada siglo (aquel divisible por 100), 
	// salvo que este �ltimo sea divisible por 400 http://es.wikipedia.org/wiki/A�o_bisiesto. 
	// Haz un programa que pida un a�o y muestre un mensaje de si es o no bisiesto.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a�o;
		
		System.out.println("Introduce un a�o, para saber si es bisiesto: ");
		a�o = teclado.nextInt();
		
		if (a�o % 4 == 0) {
			if(a�o % 100 !=0){
				System.out.println("El a�o " + a�o + " si es bisiesto.");
			}else{
				if(a�o % 400 == 0){
					System.out.println("El a�o " + a�o + " si es bisiesto.");
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


