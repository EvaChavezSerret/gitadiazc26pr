package bifurcaciones_iniciacion_if_else;

import java.util.Scanner;

public class Ejercicio4_numeropeque {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
			
			System.out.print("Introduzca el primer n�mero: ");		
			int numero1=teclado.nextInt();
			
			System.out.print("Introduzca el segundo n�mero: ");		
			int numero2=teclado.nextInt();
			
			System.out.print("Introduzca el tercer n�mero: ");		
			int numero3=teclado.nextInt();
			
			if (numero1<numero2 && numero1<numero3){
				System.out.printf("El %d es el menor",numero1);
			}
			else if(numero2<numero1 && numero2<numero3) {
				System.out.printf("El %d es el menor",numero2);
			}
			else if(numero3<numero1 && numero3<numero2) {
				System.out.printf("El %d es el menor",numero3);
			}
			else if(numero1<numero2 && numero1==numero3) {
				System.out.printf("El n�mero menor est� repetido dos veces, que es el " + numero1);
			}
			else if(numero2<numero3 && numero2==numero1) {
				System.out.printf("El n�mero menor est� repetido dos veces, que es el " + numero1);
			}
			else if(numero3<numero1 && numero3==numero2) {
				System.out.printf("El n�mero menor est� repetido dos veces, que es el " + numero2);
			}
			else if(numero1==numero2 && numero1==numero3) {
				System.out.printf("Todos los n�meros son iguales, que es el " + numero1);
			}
			else {
				System.out.printf("SI SALE ESTO, ESTA MAL EL ALGORITMO");
			}
			teclado.close();
		
	}

}
