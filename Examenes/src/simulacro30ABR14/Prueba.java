package simulacro30ABR14;

import java.util.Scanner;

public class Prueba {

	public static void matrizDispersa(int dimension, double valor) {
		int total = dimension*dimension;
		double cuantos;
		int rellenar;
		cuantos = (total * valor)/100; //este numero son los que debe pintar.
		cuantos = Math.round(cuantos);
		rellenar = (int) cuantos;
		System.out.println("Debe imprimir una matriz de " + dimension + "x" + dimension);
		System.out.println("Debe rellenar " + cuantos + " huecos con números entre cero y uno.");
		
		double [][] matriz = new double [dimension][dimension];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = aleatorio(0,1);
			}
		}
		/*
		 * for (int i = 0; i < rellenar; i++) {
			for (int j = 0; j < rellenar; j++) {
				matriz[i][j] = aleatorio(1,3);
			}
		}
		 */
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(Math.rint(matriz[i][j]) + "\t");
			}
			System.out.println();
		}
		
	}
	
	public static double aleatorio(double min, double max){
		double sol = 0;
		sol = (Math.random()* ((max - min))) + min;
		return sol;
	}
	
	//Prueba del metodo
	public static void main(String[] args) {
		
		matrizDispersa(5,30);
		
	}
	
}
