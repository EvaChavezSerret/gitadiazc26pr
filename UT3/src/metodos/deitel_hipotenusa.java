package metodos;

import java.util.Scanner;

public class deitel_hipotenusa {
	// Página 271 del libro deitel en Castellano, ejercicio 15
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double lado1, lado2;
		
		System.out.println("Introduce el lado 1 del triángulo rectángulo:" );
		lado1 = teclado.nextDouble();
		
		System.out.println("Introduce el lado 2 del triángulo rectángulo:" );
		lado2 = teclado.nextDouble();
		
		
		System.out.println("El resultado es: "+hipotenusa(lado1,lado2));
		

		teclado.close();

	}

	public static double hipotenusa(double lado1, double lado2){
		double hipo;
		
		hipo = Math.pow(lado1,2) + Math.pow(lado2, 2);
		
		hipo = Math.sqrt(hipo);
		
		return hipo;
	}
	
}
