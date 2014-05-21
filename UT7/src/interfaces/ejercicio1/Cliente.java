package interfaces.ejercicio1;

import java.util.Scanner;

public class Cliente implements Persona {
	
	private String nombreC;
	private String telefonoC;

	@Override
	public void pedirDatos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa el nombre del cliente:");
		nombreC = teclado.next();
		System.out.println("Ingresa el teléfono del cliente:");
		telefonoC = teclado.next();

	}

	@Override
	public void visualizarDatos() {
		System.out.println("El teléfono del cliente " + nombreC + " de la empresa " + empresa +" es " + telefonoC + ".");

	}

}
