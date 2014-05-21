package objetos.importado.graphics;

//importamos Canvas, siempre antes de la clase
import objetos.graphics.Canvas;
import objetos.graphics.Color;
import objetos.graphics.Rectangle;

public class Graficos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Canvas lienzo;
		Rectangle rectangulo;
		
		lienzo = Canvas.getInstance();
		
		//control+espacio y da las alternativas
		rectangulo = new Rectangle(30,30,50,100);
		
		rectangulo.draw();
		
		Canvas.pause();
		
		rectangulo.translate(250, 0);
		
		Canvas.pause();
		
		rectangulo.grow(20,20);
		
		//color hecho
		rectangulo.setColor(Color.ORANGE);	
		
		Canvas.pause();
		
		rectangulo.fill();
		
		Canvas.pause();
		
		//hacemos nosotros el color
		Color gris;
		
		gris=new Color(200,200,200);
		
		rectangulo.setColor(gris);
		
		
	}

}
