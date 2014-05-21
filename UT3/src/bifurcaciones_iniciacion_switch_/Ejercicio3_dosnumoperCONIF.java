package bifurcaciones_iniciacion_switch_;

import java.util.Scanner;

// Escribe un programa que pida dos números enteros. El usuario después indicará una operación: *, +, -, /. 
// El programa visulizará el resultado de esa operación, o error si no se corresponde con ninguna.

public class Ejercicio3_dosnumoperCONIF {

	public static void main(String[] args) {
		int n1, n2;
		String respuesta;
		
		Scanner teclado = new Scanner(System.in);
		
		/*System.out.println("Dame el primer número");
		n1 = teclado.nextInt();
		
		System.out.println("Dame el segundo número");
		n2 = teclado.nextInt();
		
		System.out.println("¿Qúe quieres hacer? \n+-Sumar \n--Restar \n*-Multiplicación \n/-División");
		respuesta = teclado.next();
		*/
		
		System.out.println("Dame la operacion en forma [numero operador numero]:");
		
		n1 = teclado.nextInt();
		respuesta = teclado.next();
		n2 = teclado.nextInt();
		
		if(respuesta.equals("+")){
			System.out.println("El resultado de la suma es: " +(n1+n2));
		}else if (respuesta.equals("-")){
			System.out.println("El resultado de la resta es: " +(n1-n2));
		}else if (respuesta.equals("*")){
			System.out.println("El resultado de la multiplicación es: " +(n1*n2));
		}else if (respuesta.equals("/")){
			System.out.println("El resultado de la división es: " +(n1/n2));
		}else{
			System.out.println("Error, operación no disponible");
		}
		teclado.close();
	}

}
