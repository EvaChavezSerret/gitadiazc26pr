package ejemplos_UT5;

import java.util.Scanner;

public class MainCuenta {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		Cuenta CCM;
		
		CCM = new Cuenta();
		
		System.out.println("¿Cuanto es el saldo de la cuenta?");
		CCM.saldo = teclado.nextFloat();
		
		System.out.println("¿Cuanto quieres ingresar?");
		CCM.ingresarDinero(teclado.nextFloat());
		System.out.println("La cuenta tiene " + CCM.saldo + " euros.");
		
		System.out.println("¿Cuanto quieres sacar?");
		CCM.retirarDinero(teclado.nextFloat());
		System.out.println("La cuenta tiene " + CCM.saldo + " euros.");
		
		teclado.close();

	}

}
