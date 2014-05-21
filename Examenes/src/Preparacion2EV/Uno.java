package Preparacion2EV;

import java.util.Arrays;
import java.util.Scanner;

public class Uno {
	
	/*
	 * Crear un método llamado comprobarCuenta al que pasemos una cadena que contiene un número de cuenta
	 * con el formato: "2077-0024-00-1302575766" y devuelve true o false si el numero de control es correcto
	 * o no.
	 */
	
	private static void comprobarCuenta() {
		
		Scanner teclado = new Scanner(System.in);
		char [] cuenta = {'1','2','3','4','-',
				'5','6','7','8','-',
				'0','6','-',
				'1','2','3','4','5','6','7','8','9','0'};
		System.out.println("Introduce el número de cuenta bancaria: XXXX-XXXX-XX-XXXXXXXXXX");
		//cuenta = teclado.next().toCharArray();
		
		//impresión de prueba del numero de cuenta
		System.out.println(Arrays.toString(cuenta));
		
	}

	public static void main(String[] args) {
	
		comprobarCuenta();

	}



}
