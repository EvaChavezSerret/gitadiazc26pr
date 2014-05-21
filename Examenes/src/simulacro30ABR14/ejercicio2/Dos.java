package simulacro30ABR14.ejercicio2;

import java.util.Arrays;

public class Dos {
	
	public static int aleatorio(int min, int max){
		int sol = 0;
		sol = (int) ((Math.random()* ((max - min)+1)) + min);
		return sol;
	}
	
	public static double[][] crearMatriz(int orden, double tantoPorCiento){
		double [][]matriz;
		//creo matriz
		matriz = new double[orden][orden];
		//inicializar matriz
		int numElementos;
		numElementos = (int) (orden*orden*tantoPorCiento/100);
		
		for(int i=0;i<numElementos;){
			int columna = aleatorio(0, orden-1);
			int fila = aleatorio(0, orden-1);
			
			if(matriz[fila][columna]==0){
				matriz[fila][columna] = Math.round(Math.random()*100)/100.0;
				i++;
			}
			
		}
		
		return matriz;
		
	}

	public static void main(String[] args) {
		
		double[][] matriz;
		matriz = crearMatriz(8, 25);
		
		for(int i=0;i<8;i++){
			System.out.println(Arrays.toString(matriz[i]));
		}

	}

}
