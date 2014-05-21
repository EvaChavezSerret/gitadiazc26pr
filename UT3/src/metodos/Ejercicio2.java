package metodos;

import java.util.Scanner;

// Escriba un programa que lea temperaturas expresadas en grados Fahrenheit y las convierta a grados Celsius mostr�ndola. 
// El programa finalizar� cuando lea un valor de temperatura igual a 999. La conversi�n de grados Farenheit (F) a 
// Celsius (C) la realizar� un m�todo llamado farenheitCelsius donde incluir�s el c�digo que hace la conversi�n (C = 5/9(F - 32)).
public class Ejercicio2 {

	public static void main(String[] args) {
		double farenheit;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca grados F: ");
			farenheit = teclado.nextDouble();
			if (farenheit==999){
				break;
			}
			System.out.println("En grados C�= " + farenheitCelsius(farenheit));
		}while(true);
		
		
		teclado.close();
	}
	
	public static double farenheitCelsius (double faren){
		double celsius;
		celsius = ((faren - 32) * 5) / 9;
		return celsius;
	}
	

}
