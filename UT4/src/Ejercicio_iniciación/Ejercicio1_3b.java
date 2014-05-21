package Ejercicio_iniciaci�n;
import java.util.InputMismatchException;
import java.util.Scanner;

/* 1: Crea un programa que pida dos n�meros enteros y muestre el resultado de su divisi�n. 
 * Captura la excepci�n InputMismatchException y ArimeticException y muestra un mensaje para 
 * el caso de que no se introduzca un n�mero o se intente dividir entre cero respectivamente.
 * 3: Modifica el ejercicio 1 para que si el usuario introduce algo que no es un n�mero, 
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
                        System.out.println("Introduzca un n�mero entero:");
                        dividendo = teclado.nextDouble();
                        divisor = teclado.nextDouble();
                        hayerror = false;
                        System.out.println("Resultado: " + dividendo/divisor);
                } catch (InputMismatchException e) {
                        System.err.println("ERROR: El n�mero introducido no es un n�mero entero. El error es: "
                                                        + e.getMessage());
                        teclado.nextLine();
                        hayerror = true;
                }
        } while (hayerror == true);
        
        teclado.close();
	}

}
