package bucles_anidados;

import java.util.Scanner;

public class Ejercicio3_piedrapapeltijera {

	public static void main(String[] args) {
		int ordenador;
		String juego_ordenador;
		String siguiente = "";
		
		// ordenador elige su juego
		ordenador = (int) (Math.random() * 3 + 1);
		
		if (ordenador == 1) juego_ordenador = "piedra";
		else if (ordenador == 2) juego_ordenador = "papel";
		else juego_ordenador = "tijera";
		
		//System.out.println(juego_ordenador);
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("-- Juego Piedra/papel/Tijera --");
		
		
		String juego_usuario;
		
		do{
			
			System.out.println("¿Que sacas? [piedra, papel o tijera]");
			
			juego_usuario = teclado.next();
			juego_usuario = juego_usuario.toLowerCase();
		
			if (! (juego_usuario.equals("piedra") ||
				juego_usuario.equals("papel") ||
				juego_usuario.equals("tijera")))
				{
					System.out.println("ERROR: HA ELEGIDO UN ELEMENTO ERRONEO");
					System.out.println("¿Que sacas? [piedra, papel o tijera]");
					juego_usuario = teclado.next();
					juego_usuario = juego_usuario.toLowerCase();
				}
			
			System.out.println("Elegiste " + juego_usuario + " y el ordenador " + juego_ordenador);
			
			if (juego_usuario.equals(juego_ordenador)) 
				{
					System.out.println("¡¡EMPATE!!");
				} 
			
			else if (juego_usuario.equals("piedra") && juego_ordenador.equals("tijera") ||
    			   juego_usuario.equals("papel") && juego_ordenador.equals("piedra") ||
    			   juego_usuario.equals("tijera") && juego_ordenador.equals("papel")) 
				{
			System.out.println("¡¡GANASTE!!");
			} 
			
			else
    		System.out.println("¡¡PERDISTE!!");
		
			System.out.println("¿Otra partida [s/n]?");
			siguiente = teclado.next();
		
		}while (siguiente.equals("s"));
		
		System.out.println("Hasta pronto!");
		
		teclado.close();
	}

}
