package Ejercicio_iniciación;
import java.util.InputMismatchException;
import java.util.Scanner;

/* 1: Crea un programa que pida dos números enteros y muestre el resultado de su división. 
 * Captura la excepción InputMismatchException y ArimeticException y muestra un mensaje para 
 * el caso de que no se introduzca un número o se intente dividir entre cero respectivamente.
 * 3: Modifica el ejercicio 1 para que si el usuario introduce algo que no es un número, 
 * vuelva a repetirse el pedir el dividendo y divisor.
 */


public class Ejercicio1_3 {

	public static void main(String[] args) {
		int dividendo=0,divisor=0;
		boolean leido,es_cero;
		Scanner teclado=new Scanner(System.in);
		
		leido=false;
		es_cero=false;
		do{
			try{
				System.out.print("Introduce el dividendo: ");
				dividendo=teclado.nextInt();
				System.out.print("Introduce el divisor: ");
				divisor=teclado.nextInt();
				leido=true;
				System.out.println("Resultado: " + (dividendo/divisor));
				es_cero=false;
			}
			catch (InputMismatchException e){
				leido=false;
				teclado.nextLine(); //limpiar buffer para no volver a generar excepción
				System.out.println("Error al leer números enteros");
			}
			catch (ArithmeticException e) {
				es_cero=true;
				System.out.println("Error, división por cero");
			}
			
		}while(!leido || es_cero);

		teclado.close();
		

	}

}
