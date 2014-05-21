package bonus_graficos_bucles;

import objetos.graphics.Color;
import objetos.graphics.Ellipse;
import objetos.graphics.Rectangle;

public class EjemploGraficos {

	public static void main(String[] args) throws InterruptedException {
		
		Ellipse pelota;
		Color color;
		Rectangle tablero;
		int movimiento_x;
		int movimiento_y;
		
		
		pelota = new Ellipse(200, 200, 40, 40);
		color = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
		
		tablero = new Rectangle(0,0,400,400);
		tablero.draw();
		
		pelota.setColor(color);
		pelota.fill();
		
		
		// (int)(Math.random() * (max-min+1)) + min
		movimiento_x = (int)(Math.random() * (3-(-3)+1)) + (-3);
		movimiento_y = (int)(Math.random()*7)-3;		
		
		if(movimiento_x==0) movimiento_x++;
		if(movimiento_y==0) movimiento_y++;
		
		while(true){
			
			pelota.translate(movimiento_x, movimiento_y);
			
			if ((pelota.getX()+40)>400 || pelota.getX()<0){
				movimiento_x *= -1;
			}
			if ((pelota.getY()+40)>400 || pelota.getY()<0){
				movimiento_y *= -1;
			}
			Thread.sleep(10);
			
		}
		
	}

}
