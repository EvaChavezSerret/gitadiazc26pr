package bucles_while_Dowhile;

import java.util.Scanner;

// Pedir n�meros hasta que se inserte un 0. Mostrar la cantidad de n�meros le�dos y el resultado de multiplicar todos ellos.

public class Ejercicio2_hasta0 {

	public static void main(String[] args) {
		

		Scanner teclado = new Scanner (System.in);
		
		int numero = 0;
		int contador = 0;
		int multiplicacion = 1;
		
		do{
			System.out.println ("Escribe el siguiente n�mero: ");
			numero = teclado.nextInt();
			if (numero != 0) multiplicacion = numero * multiplicacion;
			
			contador++;
		} while (numero != 0);
		
		System.out.println("Se han multiplicado " + (contador -1) + " n�meros");
		
		if (contador > 1);
		System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
		
		teclado.close();

	}

}
