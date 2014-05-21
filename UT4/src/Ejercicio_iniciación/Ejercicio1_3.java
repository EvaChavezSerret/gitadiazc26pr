package Ejercicio_iniciaci�n;
import java.util.InputMismatchException;
import java.util.Scanner;

/* 1: Crea un programa que pida dos n�meros enteros y muestre el resultado de su divisi�n. 
 * Captura la excepci�n InputMismatchException y ArimeticException y muestra un mensaje para 
 * el caso de que no se introduzca un n�mero o se intente dividir entre cero respectivamente.
 * 3: Modifica el ejercicio 1 para que si el usuario introduce algo que no es un n�mero, 
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
				teclado.nextLine(); //limpiar buffer para no volver a generar excepci�n
				System.out.println("Error al leer n�meros enteros");
			}
			catch (ArithmeticException e) {
				es_cero=true;
				System.out.println("Error, divisi�n por cero");
			}
			
		}while(!leido || es_cero);

		teclado.close();
		

	}

}
