package Examen5DIC13;
import java.util.Scanner;

import objetos.graphics.Color;
import objetos.graphics.Rectangle;



public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);

		int tamaño = 0;
		
		System.out.println("Dame el lado del cuadrado ([100,200]): ");
		do{
			tamaño = teclado.nextInt();
			if(tamaño<100 || tamaño>200){
				System.out.println("Introduce un valor correcto: ");
			}
		}while(tamaño<100 || tamaño>200);
		
		Rectangle cuadrado;
	
		int r = 0;
		int g = 0;
		int b = 0;
		System.out.println("Dame los valores del color (R,G,B): ");
		
		do{
			r = teclado.nextInt();
			g = teclado.nextInt();
			b = teclado.nextInt();
			if(r<0 && r<256 || g<0 && g<256 || b<0 && b<256){
				System.out.println("Introduce un valor correcto (entre 0 y 255): ");
			}
		}while(r<0 && r<256 || g<0 && g<256 || b<0 && b<256);
		
		
		cuadrado = new Rectangle (10, 10, tamaño, tamaño);
		cuadrado.setColor(new Color (r, g, b));
		cuadrado.fill();
		
		teclado.close();
	}

}
