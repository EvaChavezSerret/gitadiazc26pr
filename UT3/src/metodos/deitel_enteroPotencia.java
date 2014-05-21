package metodos;

import java.util.Scanner;

public class deitel_enteroPotencia {
// Página 271 del libro deitel en Castellano, ejercicio 14
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int base, exponente;
		
		System.out.println("Introduce la base de la exponenciación:" );
		base = teclado.nextInt();
		
		System.out.println("Introduce el exponente:" );
		exponente = teclado.nextInt();
		
		
		System.out.println("El resultado es: "+enteroPotencia(base,exponente));
		

		teclado.close();
	}

	public static int enteroPotencia(int base, int exponente){
		int acumula = base;
		int aux;
		
		if(exponente>0){
			for(int i=0; i<exponente-1;i++){
				aux = acumula * base;
				acumula = aux;
			}
		}
	
		return acumula;
	}
	
}
