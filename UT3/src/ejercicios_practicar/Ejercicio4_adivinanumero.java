package ejercicios_practicar;

import java.util.Scanner;
/*
 * El juego de adivina el n�mero.El programa "pensar�" un n�mero del 1 al 100 que el jugador tendr� que adivinar. 
 * El programa va preguntando un n�mero tras otro al jugador. Si el jugador dice uno mayor, el programa le dice que 
 * el n�mero oculto es menor (y al rev�s si dice uno menor). El jugador tiene como m�ximo 10 oportunidades para adivinar el n�mero.
 * Realiza una primera versi�n lo m�s sencilla posible. Ve mejorardola poco a poco.
 * No te olvides escribir comentarios en el c�digo para aclarar lo que hace en cada paso.
 * Mejora: Crea un contandor de tiempo en el programa, de forma que te diga los segundos que llevas jugando tras cada intento.
 */

public class Ejercicio4_adivinanumero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numoculto;
		int numintro;
		numoculto = (int) (Math.random() * 100 +1);
		// System.out.println(numoculto);
		numintro = 0;
		System.out.println("Dime un n�mero del 1 al 100, a ver si aciertas el n�mero oculto: ");
		
		//para conocer la hora actual utiliza System.currentTimeMillis()
	    long start = System.currentTimeMillis();
	    long intervalo;
	    		
		for(int i = 1; i<=10 && numoculto != numintro;i++){
			System.out.println("Intento " + i);
			numintro = teclado.nextInt();
			
			intervalo = (System.currentTimeMillis() - start)/1000;
			System.out.println("LLevas " + intervalo + " segundos jugados.");
			
			if(numoculto != numintro && i!=10){
				if(numoculto > numintro){
					System.out.println("El n�mero oculto es m�s grande que el que has introducido");
				}else{
					System.out.println("El n�mero oculto es m�s peque�o que el que has introducido");
				}
			}
		}
		
		if(numoculto == numintro){
			System.out.println("Has acertado");
		}else{
			System.out.println("No has acertado, y has agotado los 10 intentos");
		}
		teclado.close();

	}

}
