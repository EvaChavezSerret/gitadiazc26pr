package ejemplo_graphics2;

import java.awt.Point;

import objetos.graphics2.Canvas;
import objetos.graphics2.Color;
import objetos.graphics2.Ellipse;


//cada vez que pulse la pantalla mueve el circulo ahi
public class ejemplo3graphics2 {

	public static void main(String[] args) throws InterruptedException {

		Ellipse circulo;
		
		circulo = new Ellipse(150,150,50,50);
		circulo.setThickness(6); //la f lo pasa a float
		circulo.setColor(Color.BLUE);
		circulo.draw();

		Canvas c;
		c = Canvas.getInstance();
		
		while (true) {
			Point pulsacion = c.waitMouseClick();
			circulo.undraw();
			
			
			
			circulo = new Ellipse(pulsacion.x-(circulo.getWidth()/2),pulsacion.y-(circulo.getHeight()/2),50,50);
			//Otra opcion es mover el anterior, no creando uno nuevo, y la coordenada actual se obtiene con circulo.getX y .getY
			circulo.setThickness(6); //la f lo pasa a float
			circulo.setColor(Color.BLUE);
			circulo.draw();
			
			Thread.sleep(100);
							
		}

	}

}