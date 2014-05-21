package Tareas.primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio3_Programa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float x1,x2,y1,y2;
		float base;
		float altura;
		float area;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe las coordenadas x1, x2, y1, y2 de un rectángulo alineado con los ejes x e y, en ese orden: ");
		x1=teclado.nextFloat();
		x2=teclado.nextFloat();
		y1=teclado.nextFloat();
		y2=teclado.nextFloat();
			
		base = x2-x1;
		altura = y2-y1;
		area = base*altura;
				
		System.out.println("La base es: " + base);
		System.out.println("La altura es "+ altura);
		System.out.println("El área es "+ area);
		
		teclado.close();
		
	}

}
