package bifurcaciones_iniciacion_switch_;

import java.util.Scanner;

public class Ejercicio2_labofestiCON_SWITCHconnum {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero_dia;
		
		System.out.println("Dame el día de la semana (en número): ");
		numero_dia = teclado.nextInt();
		
		switch (numero_dia) {
			case 1:
			case 2:
			case 3: 
			case 4:
			case 5:
				System.out.println("Día laborable");
				break;
			case 6:
			case 7:
				System.out.println("Día festivo");
		}
teclado.close();
	}

}
