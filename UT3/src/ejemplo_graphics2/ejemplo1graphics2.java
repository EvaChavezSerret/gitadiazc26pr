package ejemplo_graphics2;

import java.awt.Point;

import objetos.graphics2.Canvas;
import objetos.graphics2.Color;
import objetos.graphics2.Ellipse;
import objetos.graphics2.Rectangle;

public class ejemplo1graphics2 {

	public static void main(String[] args) {


		Rectangle cuadrado;
		
		cuadrado = new Rectangle(100,100,300,300);
		cuadrado.setThickness(6.5f); //la f lo pasa a float
		cuadrado.setColor(Color.RED);
		cuadrado.draw();
		
		Ellipse circulo;
		
		circulo = new Ellipse(150,150,200,200);
		circulo.setThickness(6); //la f lo pasa a float
		circulo.setColor(Color.BLUE);
		circulo.draw();
		
		Canvas.pause();
		
		circulo.undraw();
		
		Canvas.pause();		
		
		circulo = new Ellipse(150,150,200,200);
		circulo.setThickness(6); //la f lo pasa a float
		circulo.setColor(Color.BLUE);
		circulo.draw();
		
		Canvas c;
		c=Canvas.getInstance();
		c.waitMouseClick(); // es una línea: Canvas.getInstance().waitMouseClick();
		
		circulo.undraw();
		
		while(true){
			Point pulsacion = c.waitMouseClick(); //requiere import java.awt.Point;
			System.out.println("Has pulsado en: (" + pulsacion.x + "," + pulsacion.y + ")");	
		}

	}

}
