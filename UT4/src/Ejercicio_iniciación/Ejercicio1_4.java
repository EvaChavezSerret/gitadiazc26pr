package Ejercicio_iniciaci�n;
import java.util.InputMismatchException;
import java.util.Scanner;

/* 1: Crea un programa que pida dos n�meros enteros y muestre el resultado de su divisi�n. 
 * Captura la excepci�n InputMismatchException y ArimeticException y muestra un mensaje para 
 * el caso de que no se introduzca un n�mero o se intente dividir entre cero respectivamente.
 * 3: Modifica el ejercicio 1 para que si el usuario introduce algo que no es un n�mero, 
 * vuelva a repetirse el pedir el dividendo y divisor.
 * 4: Modifica el ejercicio 3 para que si el usuario tiene m�s de 5 errores muestre el mensaje 
 * "Demasiados fallos. Vuelve a intentarlo otro d�a".
 */


public class Ejercicio1_4 {

	public static void main(String[] args) {
        double dividendo = 0;
        double divisor = 0;
        Scanner teclado = new Scanner(System.in);
        boolean hayerror;
        int contadorErrores;

        hayerror = false;
        contadorErrores= 0;
        do {
                try {
                        System.out.println("Introduzca un n�mero entero:");
                        dividendo = teclado.nextDouble();
                        divisor = teclado.nextDouble();
                        hayerror = false;
                        System.out.println("Resultado: " + dividendo/divisor);
                } catch (InputMismatchException | ArithmeticException e) {
                        System.out.println("ERROR: El n�mero introducido no es un n�mero entero o es igual a 0. El error es: "
                                         + e.getMessage());
                        teclado.nextLine();
                        contadorErrores++;
                        if (contadorErrores==6)
                            System.out.println("Demasiados fallos. Vuelve a intentarlo otro d�a.");
                        hayerror = true;
                }
        } while (hayerror && contadorErrores<=5);
        

        teclado.close();
	}

}
