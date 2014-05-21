package Ejercicio_iniciación;
import java.util.InputMismatchException;
import java.util.Scanner;

/* 1: Crea un programa que pida dos números enteros y muestre el resultado de su división. 
 * Captura la excepción InputMismatchException y ArimeticException y muestra un mensaje para 
 * el caso de que no se introduzca un número o se intente dividir entre cero respectivamente.
 * 3: Modifica el ejercicio 1 para que si el usuario introduce algo que no es un número, 
 * vuelva a repetirse el pedir el dividendo y divisor.
 * VERSION 2
 */


public class Ejercicio1_3b {

	public static void main(String[] args) {
        double dividendo = 0;
        double divisor = 0;
        Scanner teclado = new Scanner(System.in);
        boolean hayerror;

        hayerror = false;

        do {
                try {
                        System.out.println("Introduzca un número entero:");
                        dividendo = teclado.nextDouble();
                        divisor = teclado.nextDouble();
                        hayerror = false;
                        System.out.println("Resultado: " + dividendo/divisor);
                } catch (InputMismatchException e) {
                        System.err.println("ERROR: El número introducido no es un número entero. El error es: "
                                                        + e.getMessage());
                        teclado.nextLine();
                        hayerror = true;
                }
        } while (hayerror == true);
        
        teclado.close();
	}

}
