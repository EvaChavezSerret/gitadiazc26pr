package interfaces.ejercicio1;

import java.util.Scanner;

public class Empleado implements Persona {
	
	private String nombreE;
	private String telefonoE;

	@Override
	public void pedirDatos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa el nombre del empleado:");
		nombreE = teclado.next();
		System.out.println("Ingresa el teléfono del empleado:");
		telefonoE = teclado.next();

	}

	@Override
	public void visualizarDatos() {
		System.out.println("El teléfono del empleado " + nombreE + " de " + empresa +" es " + telefonoE + ".");

	}

}
