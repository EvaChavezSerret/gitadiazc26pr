package ejemplosUT6;

import java.util.Arrays;

public class Busquedas {

	public static void main(String[] args) {
		int[] numeros={3,2,3,2,5,54};
		int[] ordenado;
		
		System.out.println(Arrays.toString(numeros));
		ordenado = Arrays.copyOf(numeros, numeros.length);
		Arrays.sort(ordenado);
		System.out.println(Arrays.toString(ordenado));
		
		//Si no está devuelve -1, por eso ponemos el >=0
		if (Arrays.binarySearch(ordenado, 5)>=0){
			System.out.println("5 está");
		}

	}

}
