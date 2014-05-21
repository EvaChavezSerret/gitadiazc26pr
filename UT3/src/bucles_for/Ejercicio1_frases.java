package bucles_for;
// Escribe un programa que pida cinco frases y las visualice.
import java.util.Scanner;

public class Ejercicio1_frases {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
		
		System.out.println("Escribe hasta 5 frases: ");
		
		int i;
		
		
		for (i = 1; i < 6; i ++) {
		teclado.next();	
		}
		
		System.out.println("Ya has introducido 5 frases");
		
		teclado.close();
	}

}
