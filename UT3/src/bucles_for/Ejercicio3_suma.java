package bucles_for;
// Escribe un programa que calcule la suma de 6 n�meros que inserte el usuario a trav�s del teclado.
import java.util.Scanner;

public class Ejercicio3_suma {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
		
		System.out.println("Inserta 6 n�meros: ");
		
		int i,n;
		int suma= 0;
				
		for (i = 0; i < 6; i ++) {
			n = teclado.nextInt();
			suma += n;
				
		}
		
		System.out.println("La suma es: " + suma);
		teclado.close();
	}

}
