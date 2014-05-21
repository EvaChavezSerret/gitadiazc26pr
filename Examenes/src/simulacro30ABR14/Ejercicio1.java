package simulacro30ABR14;

import java.util.Scanner;

public class Ejercicio1 {
	public static void clave() {
		System.out.println("Introduce la clave:");
		Scanner teclado = new Scanner (System.in);
		char [] clave;
		clave = teclado.next().toCharArray();
		if(clave.length>6){
			System.out.println("La clave se ha introducido con éxito.");
		}else{
			System.out.println("Debe tener 6 caracteres.");
		}
	}
	
	//Prueba del metodo
	public static void main(String[] args) {
		
		clave();
		
	}
}
