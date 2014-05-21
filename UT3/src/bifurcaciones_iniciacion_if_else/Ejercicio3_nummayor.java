package bifurcaciones_iniciacion_if_else;

import java.util.Scanner;

public class Ejercicio3_nummayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el primer número: ");		
		int numero1=teclado.nextInt();
		
		System.out.print("Introduzca el segundo número: ");		
		int numero2=teclado.nextInt();
		
		if (numero1>numero2){
			System.out.printf("El %d es el mayor",numero1);
		}
		else if(numero1<numero2) {
			System.out.printf("El %d es el mayor",numero2);
		}
		else {
			System.out.printf("Son inguales");
		}
		teclado.close();
	}

}
