package metodos;

import java.util.Scanner;

public class deitel_cuadradoRelleno {
		// Página 272 del libro deitel en Castellano, ejercicio 19
		public static void main(String[] args) {
			
			int lado;
			char relleno;
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Introduce el lado cuadrado que quieres dibujar: ");
			lado = teclado.nextInt();
			
			System.out.println("Introduce el caracter del cuadrado que quieres dibujar: ");
			relleno = teclado.next().charAt(0);
			
			cuadradoRelleno(lado,relleno);
			
			teclado.close();
		}

		public static void cuadradoRelleno(int lado,char caracterRelleno){
			
			int x = lado;
			char relleno = caracterRelleno;
			for(int j = 0; j<x;j++){
				for(int i = 0; i<x;i++){
					System.out.print(relleno);
				}
				System.out.println();
			}
			
		}
		
	}
