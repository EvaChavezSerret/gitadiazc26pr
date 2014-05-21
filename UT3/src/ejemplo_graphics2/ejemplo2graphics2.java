package ejemplo_graphics2;

import java.awt.Point;

import objetos.graphics2.Canvas;
import objetos.graphics2.Color;
import objetos.graphics2.Rectangle;
import objetos.graphics2.Text;

//que aparezca un texto donde pongan las coordenadas que has pulsado
public class ejemplo2graphics2 {

	public static void main(String[] args) {
		
		Rectangle cuadrado;
		
		cuadrado = new Rectangle(100,100,300,300);
		cuadrado.setThickness(6.5f); //la f lo pasa a float
		cuadrado.setColor(Color.RED);
		cuadrado.draw();
		
		Canvas c;
		c=Canvas.getInstance();
		
		Text texto;
		texto = new Text(50, 50, "-");
		texto.draw();
		while(true){
			Point pulsacion = c.waitMouseClick(); //requiere import java.awt.Point;
			texto.setText(pulsacion.x + "-" + pulsacion.y);
		}
		
		
		
		
	

	}

}
