package Preparacion2EV;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dos {
	
	/*
	 * Escribir un m�todo llamado precioFinal que dado un precio y una cantidad devuelva el 
	 * precio final resultado de aplicar el descuento del 2% si la centidad es mayor que 6 y 4%
	 * si es mayor que 12. Si al m�todo se le pasan como par�metros n�meros no validos, devolver� la excepci�n
	 * IllegalArgumentException.
	 * Escribe tambi�n el c�digo que pruebe que funciona correctamente y tambi�n que devulve la excepci�n si los
	 * valores pasados no son correctos.
	 */
	
	private static void precioFinal(double precio, int cantidad) {
		double precioFinal = 0, dto = 1;
		if(cantidad>6){
			dto = 0.98;
		}else if(cantidad>12){
			dto = 0.96;
		}else if(cantidad <= 0 || precio <= 0){
			throw new IllegalArgumentException();
		}
		precioFinal = precio * dto * cantidad;
		System.out.println("El precio final es: "+precioFinal);
		System.out.println("El precio unitario final es: "+precioFinal/cantidad);
	}

	public static void main(String[] args) {

		//Para probar directamente
		precioFinal(21.20,13);
		
		//Introducir por teclado
		Scanner teclado = new Scanner(System.in);
		double precio = 0;
		int cantidad = 0;
		String producto = null;
		
		try {
			System.out.println("Nombre del producto: ");
			producto = teclado.next();
			System.out.println("Introduce el precio: ");
			precio = teclado.nextDouble();
			System.out.println("Introduce la cantidad: ");
			cantidad = teclado.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("No has metido n�meros en el precio y la cantidad.");
			System.exit(0);
		} 
		
		try {
			System.out.println("De " + producto);
			precioFinal(precio, cantidad);
		} catch (IllegalArgumentException e) {
			System.out.println("Se han metido precios o cantidades no v�lidas.");
		} finally {
			System.out.println("Vuelve pronto!");
		}

	}

	

}
