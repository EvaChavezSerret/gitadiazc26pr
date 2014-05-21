package bonus_graficos_bucles;

import objetos.graphics.Color;
import objetos.graphics.Ellipse;

// Diana: Escribir un programa que dibuje 10 círculos concéntricos en la pantalla.
// Puedes utilizar Math.Random() para obtener valores de color aleatorio.

public class Ejercicio4_diana {

	public static void main(String[] args) {
		
		Color[] colores;
		int centro_x, centro_y;
		int distancia;
		int colorelegido;
		int color;
		
		colores = new Color[5];
		
		colores[0] = new Color(255,0,0);
		colores[1] = Color.CYAN;
		colores[2] = Color.DARK_GRAY;
		colores[3] = Color.YELLOW;
		colores[4] = Color.BLACK;

		centro_x = 200;
		centro_y = 200;
		distancia = 15;
		
		colorelegido = -1;
		
		for(int i=10;i>0;i--){
			Ellipse circulo;
			
			circulo = new Ellipse(centro_x-i*distancia,centro_y-i*distancia,distancia*i*2,distancia*i*2);
			//color = (int)(Math.random()*5);
			
			do{
				color = (int)(Math.random()*5);
			}while(color==colorelegido);
			
			circulo.setColor(colores[color]);
			circulo.fill();
			
			colorelegido = color;		
		}
	}

}
