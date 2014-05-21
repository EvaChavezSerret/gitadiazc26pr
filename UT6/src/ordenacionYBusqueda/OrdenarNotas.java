package ordenacionYBusqueda;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNotas {
	
	public static void PedirCantidad(){
		int cantidad;
		cantidad = 8;
		
		Scanner teclado = new Scanner(System.in);
		
		int [] notas = new int [cantidad];
		for(int i=0; i<notas.length; i++){
			System.out.println("Introduce la nota del alumno " + (i+1) + ":");
			notas[i] = teclado.nextInt();
		}
			//Impresión sin ordenar
			System.out.println(Arrays.toString(notas));
			
			//Buscamos la nota mas alta
			//sort ordena de menor a mayor
			Arrays.sort(notas);
			System.out.println("La nota más alta es: " + notas[notas.length-1]);
			//Ordenadas de mayor a menor
			System.out.println("Notas de mayor a menor");
			for(int i=notas.length; i>0; i--){
				System.out.print(notas[i-1] + ", ");
			}
			//Repetida, que se visualice una vez
			System.out.println("Notas de mayor a menor");
			for(int i=notas.length; i>0; i--){
				if(i>1 && notas[i-1]!=notas[i-2]){
					System.out.print(notas[i-1] + ", ");
				}
			}
		
	}

	public static void main(String[] args) {
		
		PedirCantidad();

	}

}
