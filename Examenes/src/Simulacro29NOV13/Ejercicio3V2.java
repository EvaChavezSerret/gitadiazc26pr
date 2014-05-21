package Simulacro29NOV13;

import java.util.Scanner;

public class Ejercicio3V2 {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("Bienvenido a Haiku Generator.\n\nComenzaremos recopilando versos (escribe * para terminar)\n");
		
		String frase;
		String otro;
		
		String[] guardadas = new String [40];
		
		int i = 0;
		int contador = 0;
				
		do{
			System.out.println("Dame un verso: ");
			frase = teclado.nextLine();
			
			if (!frase.equals("*")){
				guardadas [i] = frase;
				contador ++;
			}
			
			i++;
			
		}while(!frase.equals("*"));
		
		System.out.println("Versos leidos (" + (i-1) + ")");
		
		for(i=0; i < contador; i++){
			System.out.println(guardadas[i]);
		}
		
		otro = "s";
		
		do{
			System.out.println("\nHaiku\n**********");
			
			int [] creados = {-1,-1,-1};
			
			for(i=0; i<3;i++){
				int random = 0;
				do{
					random = (int)(Math.random()*contador);
				}while(!(random != creados[0] && random != creados[1]));
				creados [i] = random;
				
				System.out.println(guardadas[random]);
			}
			System.out.println("¿Otro Haiku? [s,n]");
			otro = teclado.next();
		}while(otro.equals("s"));
		
		System.out.println("Adios, gracias por utilizar Haiku Generator");
		
		
		teclado.close();
	}

}
