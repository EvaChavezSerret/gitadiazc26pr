package Simulacro29NOV13;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int cantidad = 0;
		double numero = 0;
		int positivos = 0;
		int negativos = 0;
		double media = 0;
		double acumula = 0;
		
		System.out.println("Introduce la cantidad de números que quieres meter: ");
		cantidad = teclado.nextInt();
		
		for(int i=1; i < (cantidad+1); i++){
			if(i==1){
				System.out.println("Escribo los " + cantidad + " numeros");
			}
						numero = teclado.nextInt();
			if (numero > 0){
				positivos = positivos + 1;
			}else if(numero < 0){
				negativos = negativos + 1;
			}
			acumula = acumula + numero;
			media = acumula/i;
		}
		
		System.out.println("El número de positivos es: " + positivos + " los negativos son: " + negativos +" y la media es: " + media);
		teclado.close();
	}

}
