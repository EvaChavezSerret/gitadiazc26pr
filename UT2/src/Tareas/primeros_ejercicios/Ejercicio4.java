package Tareas.primeros_ejercicios;

//Crea un programa que pida un peso en Kilogramos y realice la conversión a onzas, sabiendo que 1 Kilogramo (Kg) = 35.2739619 Onzas (oz)

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float kg;
		double oz;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe un peso en kg: ");
		kg=teclado.nextFloat();
			
		oz = 35.2739619*kg;
		
		System.out.print(kg + " kg son " + oz + " oz.");
		
		teclado.close();

	}

}
