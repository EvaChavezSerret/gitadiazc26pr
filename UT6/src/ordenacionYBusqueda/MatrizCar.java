package ordenacionYBusqueda;

import java.util.Arrays;

public class MatrizCar {

	public static void visualizar(char[] caracteres){
		
		//Forma hiper-cutre
		System.out.println(Arrays.toString(caracteres));
		
		for(int i =0; i<caracteres.length;i++){
			System.out.println("Caracter " + i +": "+caracteres[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		char[] caracteres = {'n','u','l','l'};
		
		visualizar(caracteres);

	}

}
