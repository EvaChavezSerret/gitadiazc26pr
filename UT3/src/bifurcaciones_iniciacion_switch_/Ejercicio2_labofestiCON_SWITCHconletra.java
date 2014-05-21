package bifurcaciones_iniciacion_switch_;

import java.util.Scanner;

public class Ejercicio2_labofestiCON_SWITCHconletra {

	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			String dia;
			
			System.out.println("Dame el día de la semana (en letra): ");
			dia = teclado.nextLine();
			dia = dia.toLowerCase();
			
			switch (dia) {
				case "lunes":
				case "martes":
				case "miercoles": 
				case "jueves":
				case "viernes":
					System.out.println("Día laborable");
					break;
				case "sabado":
				case "domingo":
					System.out.println("Día festivo");
			}
	teclado.close();
	}
}
