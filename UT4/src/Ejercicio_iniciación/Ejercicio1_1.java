package Ejercicio_iniciación;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Crea un programa que pida dos números enteros y muestre el resultado de su división. 
 * Captura la excepción InputMismatchException y ArimeticException y muestra un mensaje 
 * para el caso de que no se introduzca un número o se intente dividir entre cero respectivamente.
 */


public class Ejercicio1_1 {

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
		
		System.out.println("Adiós");
		
		teclado.close();
	}

}
