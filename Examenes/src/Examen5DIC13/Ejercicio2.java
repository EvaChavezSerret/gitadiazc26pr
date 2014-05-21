package Examen5DIC13;
import java.util.Scanner;


public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		double temperatura = 0;
		double histeresis = 0;
		double actual = 0;
		
		System.out.println("Controlador de termostato");
		
		System.out.println("¿A que temperatura quieres estar?");
		temperatura = teclado.nextDouble();
		
		System.out.println("¿Con qué histéresis trabajamos?");
		histeresis = teclado.nextDouble();
		
		boolean estado;
		estado = false;
		
		do{
			
			System.out.println("¿temperatura actual?");
			actual = teclado.nextDouble();
			if(estado){
				if(actual>=temperatura+histeresis){
					System.out.println("Apagado");
					estado = false;
				}
				if(actual<temperatura-histeresis){
					System.out.println("Encendido");
					estado = true;
				}
				if(actual>temperatura-histeresis && actual<temperatura+histeresis){
					System.out.println("Encendido");
					estado = true;
				}
			}else{

				if(actual>=temperatura+histeresis){
					System.out.println("Apagado");
					estado = false;
				}
				if(actual<temperatura-histeresis){
					System.out.println("Encendido");
					estado = true;
				}
				if(actual>temperatura-histeresis && actual<temperatura+histeresis){
					System.out.println("Apagado");
					estado = false;
				}
			}
			
		}while(true);
		
	}

}
