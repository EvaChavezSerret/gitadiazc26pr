package ejercicios_practicar;

import java.util.Scanner;

// Escribe un programa que pida los datos de empleados, en concreto su nombre y sueldo. 
// Realizará una pregunta tipo "¿Otro [s/n]?" para saber cuando parar. 
// El programa calculará la media del sueldo y mostrará el nombre de los empleados que cobran por encima de la media.
public class Ejercicio3_empleados {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		String otro = "s";
		int sueldo = 0;
		int media = 0;
		int acumula = 0;
		int i = 0;
		
		String[] empleados = new String [40];
		int[] sueldos = new int [40];
		
		do{
			
			System.out.println("Nombre de empleado: ");
			empleados[i] = teclado.next();
			
			
			System.out.println("Sueldo del empleado: ");
			sueldos[i] = teclado.nextInt();
			sueldo = sueldos[i];
			
			System.out.println("¿Otro?");
			otro = teclado.next();
			
			acumula = acumula + sueldo;
			media = acumula/(i+1);
			
			i++;
		}while (otro.equals("s"));

		System.out.println("Media del sueldo: " + media);
		
		System.out.println("Los empleados que cobran por encima de la media son: ");
		
		boolean alguno = false;
		
		for(int j=0; j<i; j++){
			if(sueldos[j]>media){
				System.out.println("\t" + empleados[j]);
				alguno = true;
			}
		}
		if (alguno == false){
			System.out.println("Ningún empleado cobra por encima de la media.");
		}
		
		teclado.close();
	}

}
