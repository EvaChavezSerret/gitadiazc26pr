package objetos.ejemplos;

//import graphics.Ellipse;
import objetos.graphics.Color;
import objetos.graphics.Line;
import objetos.graphics.Rectangle;
import objetos.graphics.Ellipse;
//import objetos.graphics.Color;

public class Ejercicio2Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle chasis;
		Line cristal;
		Ellipse luz,rueda1,rueda2,rueda3,rueda4;
		
		luz = new Ellipse (310,303,20,20);
		luz.draw();
		luz.setColor(Color.YELLOW);
		luz.fill();
		
		chasis = new Rectangle(320,300,220,60);
		chasis.draw();
		chasis.setColor(Color.BLUE);
		chasis.fill();
		
		cristal = new Line(360,300,400,250);
		cristal.draw();
		
		rueda1 = new Ellipse(350,345,30,30);
		rueda1.draw();
		rueda1.fill();
		
		rueda2 = new Ellipse(360,355,10,10);
		rueda2.draw();
		rueda2.setColor(Color.WHITE);
		rueda2.fill();
		
		rueda3 = new Ellipse(480,345,30,30);
		rueda3.draw();
		rueda3.fill();
		
		rueda4 = new Ellipse(490,355,10,10);
		rueda4.draw();
		rueda4.setColor(Color.WHITE);
		rueda4.fill();

	}

}
