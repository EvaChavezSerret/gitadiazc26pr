package objetos.ejemplos;

import objetos.graphics.Color;
import objetos.graphics.Rectangle;
import objetos.graphics.Ellipse;

public class Ejercicio1Semaforo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		do {
			Rectangle rectangulo;
			Ellipse circulo;
			Ellipse circulo2;
			Ellipse circulo3;
			
			//control+espacio y da las alternativas
			rectangulo = new Rectangle(30,30,200,500);
			
			rectangulo.draw();
			Color verdeoscuro;
			verdeoscuro=new Color(150,150,0);
			rectangulo.setColor(verdeoscuro);		
			rectangulo.fill();
			
			circulo = new Ellipse(80,80,100,100);
			circulo2 = new Ellipse(80,230,100,100);
			circulo3 = new Ellipse(80,380,100,100);
			
			circulo.draw();
			circulo2.draw();
			circulo3.draw();
			
			circulo.fill();
			circulo2.fill();
			circulo3.fill();
			
			circulo3.setColor(Color.GREEN);	
			circulo3.fill();
			Thread.sleep(5000);	
			
			circulo2.setColor(Color.YELLOW);
			circulo3.setColor(Color.BLACK);
			Thread.sleep(150);	
			circulo2.setColor(Color.BLACK);
			Thread.sleep(150);
			circulo2.setColor(Color.YELLOW);
			Thread.sleep(150);	
			circulo2.setColor(Color.BLACK);
			Thread.sleep(150);
			circulo2.setColor(Color.YELLOW);
			Thread.sleep(150);	
			circulo2.setColor(Color.BLACK);
			Thread.sleep(150);
			circulo2.setColor(Color.YELLOW);
			circulo2.fill();
			
			circulo.setColor(Color.RED);	
			circulo2.setColor(Color.BLACK);
			circulo.fill();
			Thread.sleep(5000);
			
		} while(true);
		
	}

}
