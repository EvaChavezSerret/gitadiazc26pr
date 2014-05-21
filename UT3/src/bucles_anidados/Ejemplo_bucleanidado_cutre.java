package bucles_anidados;

import java.util.Scanner;

public class Ejemplo_bucleanidado_cutre {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int linea, multiplicacion, numero;
		
		for(numero=1;numero<=10;numero++){
			multiplicacion = numero;
			linea = 1;
			System.out.println("\nTabla del " + numero);
				while (linea<=10) {
					System.out.println(numero + " x " + linea + " = " + (multiplicacion));
					linea++;
					multiplicacion += numero; // multiplicacion = multiplicacion + numero;
			}
		}
teclado.close();
	}

}
