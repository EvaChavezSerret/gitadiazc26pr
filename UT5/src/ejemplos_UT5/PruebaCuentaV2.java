package ejemplos_UT5;

import java.util.Scanner;

public class PruebaCuentaV2 {


		public static void main(String[] args){
			Scanner teclado;
			teclado = new Scanner(System.in);
			
			CuentaV2 CCM;
			CCM= new CuentaV2();
			
			int opcion = 1;
			System.out.println("!Bienvenido a tu cajero! ¿que quieres hacer?");
			
			do{
				if (opcion== 1||opcion==2||opcion==3){
					System.out.println("1. Consulta de saldo.\n2. Ingresar dinero.\n3. Sacar dinero.\n4. Salir.");
					opcion = teclado.nextInt();
					
					if (opcion == 1){
						System.out.println("La cuenta tiene " + CCM.getSaldo() + " euros.");
					}
					if (opcion == 2){
						System.out.println("¿Cuanto quieres ingresar?");
						CCM.ingresar(teclado.nextFloat());
						System.out.println("La cuenta ahora tiene " + CCM.getSaldo() + " euros.");
						System.out.println("Número de movimientos: " + CCM.getTransacciones());
					}
					if (opcion == 3){
						System.out.println("¿Cuanto quieres sacar?");
						CCM.sacar(teclado.nextFloat());
						System.out.println("La cuenta tiene " + CCM.getSaldo() + " euros.");
						System.out.println("Número de movimientos: " + CCM.getTransacciones());
					}
					if(opcion > 4){
						System.out.println("No ha introducido una opcion correcta.");
					}
				}
			}while (opcion!=4);
			System.out.println("¡Hasta pronto!");

			teclado.close();
			
			//Mejoras a la cuenta: no admite descubiertos
			//Guarda tambien su numero de cuenta, un numero de 10 cifras
			//Menú para gestionar una cuenta (pide al usuario cuentas y ingresa/saca)
			//Constructores de la cuenta (nºde cuenta, saldo incial)
		}
	}
