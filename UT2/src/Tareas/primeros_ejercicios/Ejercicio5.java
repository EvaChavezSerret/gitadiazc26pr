package Tareas.primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double tamaño,velocidad;
		double tiempo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe el tamaño del archivo en Mbytes: ");
		tamaño=teclado.nextDouble();
		System.out.print("Escribe la velocidad de la línea de datos en Mbps: ");
		velocidad=teclado.nextDouble();
		
		//así lo tenia
		tiempo = (tamaño*8)/velocidad;  //1Mbytes = 8 Mbites; Mbps = Mbites por segundo
		//así debe ser, LA CONVERSION NO ES DIRECTA COMO YO PENSABA QUE SI
		//tiempo = (tamaño*8*1024*1204)/(velocidad*1000000);  //1Mbytes = 8 Mbites;
		
		System.out.print("El tiempo que tarda en transmitir el archivo es: " + tiempo);
		
		teclado.close();
		
	}

}
