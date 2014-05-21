package metodos;

import java.util.Scanner;

public class deitel_minimo3 {
	// Página 273 del libro deitel en Castellano, ejercicio 23
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float a,b,c;
		
		System.out.println("Introduce el primer número: ");
		a = teclado.nextFloat();
		
		System.out.println("Introduce el segundo número: ");
		b = teclado.nextFloat();
		
		System.out.println("Introduce el tercer número: ");
		c = teclado.nextFloat();
		
		
		System.out.println("El mínimo de los tres números es: "+minimo3(a,b,c));

		teclado.close();
	}
	
	public static float minimo3(float a, float b, float c){
		
		float minimo;
		
		minimo = Math.min(minimo = Math.min(a, b), c);
		
		return minimo;
	}

}
