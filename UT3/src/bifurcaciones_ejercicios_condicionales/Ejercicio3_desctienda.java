package bifurcaciones_ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicio3_desctienda {
	// Una tienda hace un descuento del 10% por compras menores de 20€, un 20% por compras entre 20 y 50€ 
	// y un 25% si la compra es mayor. 
	// Escribe un programa que pida el precio de un producto y muestre su precio final en las rebajas.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double precio;
		
		System.out.println("¿Cuanto marca el producto, antes del descuento?");
		precio = teclado.nextInt();
		
		if (precio < 20) {
			precio = precio - precio * 0.1;
			System.out.println("El precio final es: " + precio + " €");
		}else if (precio >= 20 && precio < 50){
			precio = precio - precio * 0.2;
			System.out.println("El precio final es: " + precio + " €");
		}else if (precio >= 50){
			precio = precio - precio * 0.25;
			System.out.println("El precio final es: " + precio + " €");
		}
		teclado.close();
	}
}
