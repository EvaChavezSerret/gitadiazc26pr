package bifurcaciones_iniciacion_switch_;

import java.util.Scanner;

// Escribe un programa que pida dos n�meros enteros. El usuario despu�s indicar� una operaci�n: *, +, -, /. 
// El programa visulizar� el resultado de esa operaci�n, o error si no se corresponde con ninguna.

public class Ejercicio3_dosnumoperCONIF {

	public static void main(String[] args) {
		int n1, n2;
		String respuesta;
		
		Scanner teclado = new Scanner(System.in);
		
		/*System.out.println("Dame el primer n�mero");
		n1 = teclado.nextInt();
		
		System.out.println("Dame el segundo n�mero");
		n2 = teclado.nextInt();
		
		System.out.println("�Q�e quieres hacer? \n+-Sumar \n--Restar \n*-Multiplicaci�n \n/-Divisi�n");
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
			System.out.println("El resultado de la multiplicaci�n es: " +(n1*n2));
		}else if (respuesta.equals("/")){
			System.out.println("El resultado de la divisi�n es: " +(n1/n2));
		}else{
			System.out.println("Error, operaci�n no disponible");
		}
		teclado.close();
	}

}
