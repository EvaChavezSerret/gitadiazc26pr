package bonus_graficos_bucles;

// Coche: Hacer, utilizando un bucle, que el coche se mueva de izquierda a derecha.
// Opción 2: hacer que el coche se mueva de izquierda a derecha, cuando llegue al final, 
// que se mueva de derecha a izquierda (marcha atrás), y así sucesivamente. Hacer uso de un único bucle.

//import graphics.Ellipse;
import objetos.graphics.Color;
import objetos.graphics.Line;
import objetos.graphics.Rectangle;
import objetos.graphics.Ellipse;
//import objetos.graphics.Color;

public class Ejercicio2_cocheopcion2 {

	public static void main(String[] args) throws InterruptedException {
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
		
		do{
			
	
		for(int i=0; i<120; i++){
            Thread.sleep(30);
            int x = 2;
            chasis.translate(-x, 0);
            cristal.translate(-x, 0);
            luz.translate(-x, 0);
            rueda1.translate(-x, 0);
            rueda2.translate(-x, 0);
            rueda3.translate(-x, 0);
            rueda4.translate(-x, 0);
    }
		for(int i=0; i<120; i++){
            Thread.sleep(30);
            int x = 2;
            chasis.translate(x, 0);
            cristal.translate(x, 0);
            luz.translate(x, 0);
            rueda1.translate(x, 0);
            rueda2.translate(x, 0);
            rueda3.translate(x, 0);
            rueda4.translate(x, 0);
    }
		}
		while(true);

	}

}
