package ejerciciosVectoresYMatrices;

import java.util.Scanner;

public class Decimales {

	public static void main(String[] args) {

		crearDecimales();

	}

	public static void crearDecimales(){

		int cantidad;
		Scanner teclado=new Scanner(System.in);
		System.out.println("�Cuantos n�meros con decimales quieres ingresar?");
		cantidad = teclado.nextInt();
		
		double [] decimales;
		decimales = new double[cantidad];
		
		for(int j=0;j<decimales.length;j++){
			System.out.println("Ingrese n�mero con decimales: ");
			decimales[j]=teclado.nextDouble();
		}
		
		System.out.println("Los n�meros ingresados son: ");
		
		for(int j=0;j<decimales.length;j++){
			System.out.println(decimales[j]);
		}

		teclado.close();

	}

}
