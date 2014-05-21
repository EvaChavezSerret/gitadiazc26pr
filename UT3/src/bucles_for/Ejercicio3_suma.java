package bucles_for;
// Escribe un programa que calcule la suma de 6 números que inserte el usuario a través del teclado.
import java.util.Scanner;

public class Ejercicio3_suma {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
		
		System.out.println("Inserta 6 números: ");
		
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
