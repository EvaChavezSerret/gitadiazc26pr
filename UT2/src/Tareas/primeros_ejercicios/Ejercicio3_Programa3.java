package Tareas.primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio3_Programa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float radio;
		double volumen;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe el radio de la esfera: ");
		radio=teclado.nextFloat();
			
		//para que coja los decimales, tiene que tener el .0f
		volumen = (4.0f/3.0f)*Math.PI*Math.pow(radio,3);
		
		System.out.println("El radio es " + radio);
		//Así redondea, y de manera cutre se elige a cuantos decimales
		System.out.println("El volumen es "+ Math.round(volumen*100)/100.00);
		
		teclado.close();

	}

}
