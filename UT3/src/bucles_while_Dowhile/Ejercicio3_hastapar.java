package bucles_while_Dowhile;

import java.util.Scanner;

public class Ejercicio3_hastapar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Elige un número: ");
		int numero;
		String cadena = "";
		boolean par;
		
		do {
			numero = teclado.nextInt();
			par = numero % 2 == 0;
			
			if (!par){
				cadena = cadena + numero + " ";
				System.out.println("Elige un número: ");
			}
			
		} while (numero % 2 != 0);
		System.out.println("Impares: " + cadena);
		teclado.close();
	}

}
