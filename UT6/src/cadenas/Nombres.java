package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Nombres {

	public static void main(String[] args) {
		// Pedir el n�mero de nombres, leerlos de teclado y mostrarlos por orden alfab�tico
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Nombres a leer [n�meros]: ");
		int numNombres = teclado.nextInt();
		String []nombres;
		nombres = new String[numNombres];
		
		int i=0;
		while(i<numNombres){
			System.out.println("Nombre " + (i+1) + " [cadena]: ");
			nombres[i] = teclado.next();
			i++;
		}
		
		Arrays.sort(nombres);
		
		for(i=0;i<numNombres;System.out.println(nombres[i++]));
		
		
	}

}
