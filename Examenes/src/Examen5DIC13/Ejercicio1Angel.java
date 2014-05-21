package Examen5DIC13;

import java.util.Scanner;

public class Ejercicio1Angel {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int tamaño = 0;
		
		System.out.println("Dame el tamaño de las figuras: ");
		tamaño = teclado.nextInt();
		
		System.out.println("Figura de prueba");
		for(int i=0;i<tamaño;++i){
			for(int j=0; j<=i;++j){
				System.out.print("@");
			}
			System.out.println();
		}
		
		System.out.println("Figura 1");
		for(int i=0;i<tamaño;++i){
			for(int j=tamaño; j>i;--j){
				System.out.print("@");
			}
			System.out.println();
		}
		
		System.out.println("Figura 2");
		for(int i=0;i<tamaño;++i){
			for(int k=0;k<i;k++){
				System.out.print(" ");
			}
			for(int j=tamaño; j>i;--j){
				System.out.print("@");
			}
			System.out.println();
		}
		
		System.out.println("Figura 3");
		for(int i=0;i<tamaño;++i){
			for(int k=0; k<tamaño-i-1;k++){
				System.out.print(" ");
			}
			for(int j=0; j<=i;++j){
				System.out.print("@ ");
			}
			System.out.println();
		}

		System.out.println("Figura 4");
		for(int k=0;k<tamaño-1;++k){
				for(int i=0; i<k+2;i++){
					for(int j=0; j<tamaño-i-1;++j){
						System.out.print(" ");
					}
					for(int j=0; j<=i;++j){
						System.out.print("@ ");
					}
					System.out.println();
				}
		}
			
		
		teclado.close();
	}

}
