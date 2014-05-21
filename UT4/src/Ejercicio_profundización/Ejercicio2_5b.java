package Ejercicio_profundizaci�n;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 Escribe un programa que pida diez n�meros con decimales. Si insertan letras, 
 se pedir� de nuevo dicho n�mero. El programa debe visualizar el n�mero m�s alto 
 de todos los insertados. Si se produce alguna excepci�n se mostrar� el mensaje 
 correspondiente. Adem�s, al final del programa se visualizar� un mensaje que indica 
 cu�ntas veces se ha producido dicho error.
 */
public class Ejercicio2_5b {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numeros = 0;
		double numeroIntroducido,maximo;
		boolean continuar=true;

		maximo = -Double.MAX_VALUE;


		while (continuar) {
			System.out.println("Inserte otro n�mero: ");

			try {
				numeroIntroducido= teclado.nextDouble();
				if (numeroIntroducido > maximo) 
					maximo = numeroIntroducido;
				numeros++;
			} catch (InputMismatchException ime) {
				String cadena = teclado.nextLine();
				if (cadena.equals("*")) continuar=false;
			}
		}

		if (numeros > 0)
			System.out.println("El valor m�s alto introducido es el n�mero: " + maximo + ".");
		else
			System.out.println("No ha dado tiempo a calcular un m�ximo");

		teclado.close();
	}

}