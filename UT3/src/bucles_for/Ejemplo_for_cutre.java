package bucles_for;

import java.util.Scanner;

//Pedir tres números y que te devuelva la media
public class Ejemplo_for_cutre {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce tres números y te hago la media: ");
		
		int numero; 
		int linea;
		int acumulador = 0;
		int media = 0;
		
		for (linea = 1; linea <= 3; linea ++) {
			numero = teclado.nextInt();
			acumulador = acumulador + numero;
		}
		
		media = acumulador / 3;
		System.out.println(media);
		
		teclado.close();
	}

}
