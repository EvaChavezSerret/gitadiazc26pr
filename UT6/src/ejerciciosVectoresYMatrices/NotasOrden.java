package ejerciciosVectoresYMatrices;

import java.util.Scanner;

public class NotasOrden {

	public static void main(String[] args) {
		
		int cantidad;
		Scanner teclado=new Scanner(System.in);
		cantidad = 8;
		
		double [] notas;
		notas = new double[cantidad];
		
		for(int j=0;j<notas.length;j++){
			System.out.println("Ingrese la nota del alumno " + (j+1) + ":");
			notas[j]=teclado.nextDouble();
		}
		
		System.out.println("Los números ingresados son: ");
		
		for(int j=0;j<notas.length;j++){
			System.out.println(notas[j]);
		}

	

		teclado.close();

	}

}
