package bifurcaciones_iniciacion_switch_;

import java.util.Scanner;

// Escribe un programa que pida dos números enteros. El usuario después indicará una operación: *, +, -, /. 
// El programa visulizará el resultado de esa operación, o error si no se corresponde con ninguna.

public class Ejercicio3_dosnumoperCONSWITCH {

	public static void main(String[] args) {
		int n1, n2;
		String respuesta;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame la operacion en forma [numero operador numero]:");
		
		n1 = teclado.nextInt();
		respuesta = teclado.next();
		n2 = teclado.nextInt();
		
		switch (respuesta){
		case "+":
			System.out.println("El resultado de la suma es: " +(n1+n2));
			break;
		case "-":
			System.out.println("El resultado de la resta es: " +(n1-n2));
			break;
		case "*":
			System.out.println("El resultado de la multiplicación es: " +(n1*n2));
			break;
		case "/":
			System.out.println("El resultado de la división es: " +(n1/n2));
			break;
		default:
			System.out.println("Error, operación no disponible");
		}
		teclado.close();
	}

}
