package bifurcaciones_iniciacion_if_else;

import java.util.Scanner;

public class Ejercicio1_Fahrenheit {

	public static void main(String[] args) {
		// Diagrama en C:\Users\Arturo\Desktop\DAW\Sincronizable\Programación\Diagramas DIA\UT3\if_else
		
		//Leer temperatura Fahrenheit
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime la temperatura (ºF): ");		
		double temperatura=teclado.nextDouble();
		
		//Pasar a grados Centígrados
		temperatura = (temperatura-32)/1.8;
		
		//Si temperatura < que 0
		if (temperatura<=0){
			System.out.println("Temperatura: " + temperatura + "ºC");
			System.out.println("AVISO: temperatura de congelación.");
		}
		else {
			System.out.println("No hay riesgo de congelación.");
		}
		teclado.close();
	}

}
