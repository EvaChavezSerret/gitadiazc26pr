package simulacro30ABR14.ejercicio1;

import java.util.Scanner;

public class Uno {
	
	public static String clave() throws ClaveNoSegura{
		Scanner teclado = new Scanner(System.in);
		
		String cadena;
		cadena = teclado.next();
		
		if(cadena.length()<6){
			throw new ClaveNoSegura();
		}
		
		return cadena;
	}

	public static void main(String[] args) throws ClaveNoSegura {

		String miclave;
		//asi la lanza
		miclave = clave();
		try{
			miclave = clave();
		}catch (ClaveNoSegura cns){
			System.out.println("Clave demasiado corta.");
		}

	}

}
