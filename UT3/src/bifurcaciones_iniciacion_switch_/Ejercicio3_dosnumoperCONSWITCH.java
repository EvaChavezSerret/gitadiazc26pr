package bifurcaciones_iniciacion_switch_;

import java.util.Scanner;

// Escribe un programa que pida dos n�meros enteros. El usuario despu�s indicar� una operaci�n: *, +, -, /. 
// El programa visulizar� el resultado de esa operaci�n, o error si no se corresponde con ninguna.

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
			System.out.println("El resultado de la multiplicaci�n es: " +(n1*n2));
			break;
		case "/":
			System.out.println("El resultado de la divisi�n es: " +(n1/n2));
			break;
		default:
			System.out.println("Error, operaci�n no disponible");
		}
		teclado.close();
	}

}
