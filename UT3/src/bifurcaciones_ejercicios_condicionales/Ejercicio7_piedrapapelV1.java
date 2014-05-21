package bifurcaciones_ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicio7_piedrapapelV1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int pc = 0;
		String pcsaca = "";
		String usersaca = "";
		pc = (int) (Math.random() * 3 + 1);
		if (pc == 1) {
			pcsaca = "piedra";
		} else if (pc == 2) {
			pcsaca = "papel";
		} else if (pc == 3) {
			pcsaca = "tijera";
		}
		// System.out.println("El pc saca: " + pcsaca);
		System.out.println("Elige entre piedra, papel o tijera:");
		usersaca = teclado.nextLine();
		usersaca = usersaca.toLowerCase();
		// System.out.println("El usuario saca: " + usersaca);
		System.out.println("El usuario ha elegido: " + usersaca);
		System.out.println("El pc ha elegido: " + pcsaca);

		if (pcsaca.equals(usersaca)) {
			System.out.println("EMPATE");
		} else if (pcsaca.equals("piedra") && usersaca.equals("tijera")) {
			System.out.println("GANA PIEDRA, gana el pc!!");
		} else if (pcsaca.equals("tijera") && usersaca.equals("papel")) {
			System.out.println("GANA TIJERA, gana el pc!!");
		} else if (pcsaca.equals("papel") && usersaca.equals("piedra")) {
			System.out.println("GANA PAPEL, gana el pc!!");
		} else if (usersaca.equals("piedra") && pcsaca.equals("tijera")) {
			System.out.println("GANA PIEDRA, gana el usuario!!");
		} else if (usersaca.equals("tijera") && pcsaca.equals("papel")) {
			System.out.println("GANA TIJERA, gana el usuario!!");
		} else if (usersaca.equals("papel") && pcsaca.equals("piedra")) {
			System.out.println("GANA PAPEL, gana el usuario!!");
		} else {
			System.out
					.println("No has introducido correctamente el elemento con el que juegas.");
		}
		teclado.close();
	}
}
