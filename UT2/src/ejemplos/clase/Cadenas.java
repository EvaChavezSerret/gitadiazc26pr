package ejemplos.clase;

import java.util.Scanner;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Hola, ¿Como te llamas?");
		
		Scanner teclado=new Scanner(System.in);
		String nombre;
		
		nombre=teclado.nextLine();
		
		System.out.print("Hola "+nombre);
		//Si escribo ahora el nombre en la consola, ya me lo devuelve

		teclado.close();
		
	}

}