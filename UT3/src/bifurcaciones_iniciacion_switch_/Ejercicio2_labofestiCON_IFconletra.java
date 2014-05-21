package bifurcaciones_iniciacion_switch_;

import java.util.Scanner;

public class Ejercicio2_labofestiCON_IFconletra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String dia;
		
		System.out.println("Dame el día de la semana (en letra): ");
		dia = teclado.nextLine();
		dia = dia.toLowerCase();
		
		if (dia.equals("lunes")) // dia == "lunes"
			
			System.out.println("El " + dia +  " es festivo");
		//HACER EL RESTO DE DÍAS
			
teclado.close();

	}

}
