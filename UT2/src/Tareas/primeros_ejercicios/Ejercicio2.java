package Tareas.primeros_ejercicios;

//Escribir un programa que pregunte al usuario dos números y luego muestre la suma, el producto y la media de los dos números.

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float numero1,numero2;
		float suma;
		float producto;
		float media;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame dos números, y calcularé con ellos: ");
		numero1=teclado.nextFloat();
		numero2=teclado.nextFloat();
		
		suma = numero1+numero2;
		producto = numero1*numero2;
		media = (numero1+numero2)/2;
		
		System.out.println("Número 1 " + numero1);
		System.out.println("Número 2 " + numero2);
		System.out.println("La suma es " + suma);
		System.out.println("El producto es "+ producto);
		System.out.println("La media es "+ media);
		
		teclado.close();
				
	}

}
