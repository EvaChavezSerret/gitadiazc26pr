package arrays;

import java.util.Scanner;

/*
 * Pide 10 números enteros, y que pare cuando introduce 10 o cuando hayas introducido un 0.
 * 
 * Luego te dice los números distintos que has introducido (el 0 no lo saca).
 */

public class Ejemplo_numIguales {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int [] guardados = new int [10];
		int cantidad = 0;
		
		System.out.println("Dime 10 número máximo, si no quieres tantos, introduce 0: ");
		
		boolean cero = false;
		int i = 0;
		while(i<10 && !cero){
			int introducido = teclado.nextInt();
			
			if (introducido == 0){
				cero = true;
			}else{
				boolean encontrado = false;
				
				for (int j = 0; j < cantidad; j++){
					if(introducido == guardados[j]){
						encontrado = true;
					}
				}
				if(!encontrado){
					guardados[cantidad] = introducido;
					cantidad++;
				}
			}
			i++;
		}
		System.out.print("Has introducido " + cantidad + " números disintos: ");
		//System.out.println(Arrays.toString(guardados));
		
		int k = 0;
		do{
			System.out.print(guardados[k] + " ");
			k++;
		}while(k<cantidad);
		teclado.close();
	}

}
