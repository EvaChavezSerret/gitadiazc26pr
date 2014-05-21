package Tareas.primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio3_Programa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float radio;
		double perimetro;
		double area;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe el radio del círculo: ");
		radio=teclado.nextFloat();
			
		perimetro = 2*Math.PI*radio;
		area = Math.PI*Math.pow(radio,2);
		
		System.out.println("El radio es " + radio);
		System.out.println("El perímetro es " + perimetro);
		System.out.println("El área es "+ area);
		
		teclado.close();
		
	}

}
