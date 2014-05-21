package Tareas.primeros_ejercicios;

import java.util.Scanner;

//Escribir un programa que pregunte al usuario su nombre, y luego lo salude.

public class Ejercicio1 {

	public static void main(String[] args) {
		
System.out.print("Hola, ¿Como te llamas?");
		
		Scanner teclado=new Scanner(System.in);
		String nombre;
		
		nombre=teclado.nextLine();
		
		System.out.print("Buenas "+nombre);
		//Si escribo ahora el nombre en la consola, ya me lo devuelve
		
		teclado.close();
		//no es necesario pero quita el aviso

	}

}
