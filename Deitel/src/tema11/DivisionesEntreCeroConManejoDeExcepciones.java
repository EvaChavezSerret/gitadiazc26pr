package tema11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionesEntreCeroConManejoDeExcepciones {
	// demuestra como se lanza una excepción cuando ocurre una división entre cero
	
	public static int cociente(int numerador, int denominador)
		throws ArithmeticException
	{
		return numerador/denominador; //posible división entre cero
	}// fin del metodo cociente
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean continuarCiclo = true;//determina si se necesitan más datos de entrada
		
		do{
			try//lee los números y calcula el cociente
			{
				System.out.print("Introduzca un numerador entero: ");
				int numerador = teclado.nextInt();
				System.out.print("Introduzca un denominador entero: ");
				int denominador = teclado.nextInt();
				
				int resultado = cociente(numerador,denominador);
				System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
				continuarCiclo = false; //entrada exitosa, cermina el ciclo
			}//fin del bucle try
			catch (InputMismatchException inputMismatchException)
			{
				System.err.printf("\nExcepcion: %S\n", inputMismatchException);
				teclado.nextLine(); //descarta entrada para que el usuario intente otra vez
				System.out.println("Debe introducir números enteros. Intente de nuevo.\n");
			}//fin del bloque catch
		
		catch (ArithmeticException arithmeticException)
		{
			System.err.printf("\nExcepcion: %S\n", arithmeticException);
			System.out.println("Cero es un denominador invalido. Intente de nuevo.\n");
		}//fin del cath
		}while(continuarCiclo); //fin del do... while
		teclado.close();
	}//fin del main

}//fin de la clase
