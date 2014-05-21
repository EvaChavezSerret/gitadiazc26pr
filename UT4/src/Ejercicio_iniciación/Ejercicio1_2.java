package Ejercicio_iniciación;
import java.util.InputMismatchException;
import java.util.Scanner;

/* 1: Crea un programa que pida dos números enteros y muestre el resultado de su división. 
 * Captura la excepción InputMismatchException y ArimeticException y muestra un mensaje para 
 * el caso de que no se introduzca un número o se intente dividir entre cero respectivamente.
 * 2: Añade un bloque finally al ejercicio 1 y haz que se muestre un mensaje final 
 * independientemente de lo que ocurra en el programa.
 */

public class Ejercicio1_2 {

	public static void main(String[] args) {
		int dividendo=0,divisor=0;
		Scanner teclado=new Scanner(System.in);
		
		try {
			
			System.out.print("Introduce el dividendo: ");
			dividendo=teclado.nextInt();
			System.out.print("Introduce el divisor: ");
			divisor=teclado.nextInt();
			System.out.println("Resultado: " + (dividendo/divisor));
			
		}
		catch (ArithmeticException e) {
			System.out.println("Error, división por cero.");
		}
		catch (InputMismatchException  e) {
			System.out.println("Error, no es un número.");
		}
		finally {
			System.out.println("Adiós");
		}

	}

}
