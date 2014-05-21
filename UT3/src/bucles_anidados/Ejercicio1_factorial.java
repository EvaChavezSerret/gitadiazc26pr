package bucles_anidados;

import java.util.Scanner;

// Escribe un programa que pida un número con el fin de calcular el factorial de dicho número. 
// Hay que validar que el número insertado sea positivo (incluido el 0). 
// Si no es así, se volverá a pedir dicho número. Posteriormente, el programa le preguntará 
// al usuario si quiere insertar otro número, con un mensaje como este: "¿Quiere insetar otro número [s/n]?". 
// Debes validar también esta respuesta.
public class Ejercicio1_factorial {

	public static void main(String[] args) {
		int numero = -1;
		String respuesta;
		Scanner teclado;
		double factorial;
		
		teclado = new Scanner(System.in);
		System.out.println("Cálculo de factoriales");
		
		do{
		
			do{
			// pedir numero
				System.out.println("Dame un número positivo: ");
				numero = teclado.nextInt();
			} while (numero <0);
			
			// calcular factorial de número
			
			factorial = 1;
			
			if(numero != 1){
				for(int i = 1; i<= numero; i++)
					factorial = factorial * i;
			}
			
			System.out.println("El factorial de " + numero + " es " + factorial);
			
			do{
				System.out.println("¿Quiere insetar otro número [s/n]");
				respuesta=teclado.next();
			}while (!respuesta.equals("s") && !respuesta.equals("n"));
			
		} while (respuesta.equals("s"));
		
		teclado.close();
	}

}
