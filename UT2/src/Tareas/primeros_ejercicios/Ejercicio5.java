package Tareas.primeros_ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double tama�o,velocidad;
		double tiempo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe el tama�o del archivo en Mbytes: ");
		tama�o=teclado.nextDouble();
		System.out.print("Escribe la velocidad de la l�nea de datos en Mbps: ");
		velocidad=teclado.nextDouble();
		
		//as� lo tenia
		tiempo = (tama�o*8)/velocidad;  //1Mbytes = 8 Mbites; Mbps = Mbites por segundo
		//as� debe ser, LA CONVERSION NO ES DIRECTA COMO YO PENSABA QUE SI
		//tiempo = (tama�o*8*1024*1204)/(velocidad*1000000);  //1Mbytes = 8 Mbites;
		
		System.out.print("El tiempo que tarda en transmitir el archivo es: " + tiempo);
		
		teclado.close();
		
	}

}
