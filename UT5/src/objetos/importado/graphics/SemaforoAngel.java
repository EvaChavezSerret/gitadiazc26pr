package objetos.importado.graphics;

import objetos.graphics.Color;
import objetos.graphics.Ellipse;
import objetos.graphics.Rectangle;

public class SemaforoAngel {

	public static void main(String[] args) {
		
		Rectangle caja,palo;
		Ellipse verde,ambar,rojo;
		
		caja = new Rectangle(10,10,60,110);
		caja.draw();
		
		palo = new Rectangle(35,120,5,200);
		palo.draw();
		
		palo.fill();
		
		verde = new Ellipse(25,85,30,30);
		verde.setColor(new Color(0,200,0));
		ambar = new Ellipse(25,50,30,30);
		ambar.setColor(new Color(255,255,0));
		rojo = new Ellipse(25,15,30,30);
		rojo.setColor(new Color(255,0,0));
		verde.draw();
		ambar.draw();
		rojo.draw();
		verde.fill();
		ambar.fill();
		rojo.fill();
	}

}
