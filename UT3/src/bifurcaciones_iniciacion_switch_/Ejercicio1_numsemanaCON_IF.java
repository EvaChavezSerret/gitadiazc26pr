package bifurcaciones_iniciacion_switch_;

import java.util.Scanner;

public class Ejercicio1_numsemanaCON_IF {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero_dia;
		String letra_dia;
		letra_dia = "";
		
		System.out.println("Dame el d�a de la semana (en n�mero): ");
		numero_dia = teclado.nextInt();
		
		if (numero_dia==1) {
			//letra_dia = new String("Lunes");
			letra_dia = "Lunes";
		} else if (numero_dia == 2) {
			letra_dia = "Martes";
		} else if (numero_dia == 3) {
			letra_dia = "Mi�rcoles";
		} else if (numero_dia == 4) {
			letra_dia = "Jueves";
		} else if (numero_dia == 5) {
			letra_dia = "Viernes";
		} else if (numero_dia == 6) {
			letra_dia = "S�bado";
		} else if (numero_dia == 7) {
			letra_dia = "Domingo";
		teclado.close();
		} else {
			System.out.println ("El n�mero no est� entre [1...7]");
			letra_dia = "Error";
		}
		if (!letra_dia.equals("Error"))
			System.out.println("El d�a " + numero_dia + " correspone al " + letra_dia);
	}
}
