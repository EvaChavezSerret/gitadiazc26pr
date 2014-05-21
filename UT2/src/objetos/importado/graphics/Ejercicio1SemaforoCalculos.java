package objetos.importado.graphics;

import objetos.graphics.Color;
import objetos.graphics.Ellipse;
import objetos.graphics.Rectangle;

public class Ejercicio1SemaforoCalculos {

	public static void main(String[] args) {
		
		Rectangle caja,palo;
		Ellipse verde,ambar,rojo;
		int ancho,alto,centro_x,centro_y,diametro_disco;
		
		ancho=100;
		alto=300;
		centro_x=300;
		centro_y=300;
		diametro_disco=ancho/2;
		
		caja = new Rectangle(centro_x-ancho/2, centro_y-alto/2, ancho, alto);
		caja.draw();
		caja.setColor(new Color(53,94,59));
		caja.fill();
		
		palo = new Rectangle(centro_x-ancho/10,centro_y+alto/2, ancho/5, alto);
		palo.draw();
		
		palo.fill();
		
		verde = new Ellipse(centro_x-diametro_disco/2,centro_y+diametro_disco,diametro_disco,diametro_disco);
		verde.setColor(new Color(0,200,0));
		ambar = new Ellipse(centro_x-diametro_disco/2,centro_y-diametro_disco/2,diametro_disco,diametro_disco);
		ambar.setColor(new Color(255,255,0));
		rojo = new Ellipse(centro_x-diametro_disco/2,centro_y-2*diametro_disco,diametro_disco,diametro_disco);
		rojo.setColor(new Color(255,0,0));
		verde.draw();
		ambar.draw();
		rojo.draw();
		verde.fill();
		ambar.fill();
		rojo.fill();
		
		caja = new Rectangle(centro_x-ancho/4, centro_y/2+1.3*alto, ancho/2, alto/3);
		caja.draw();
		caja.setColor(new Color(53,94,59));
		caja.fill();
		
		verde = new Ellipse(centro_x-diametro_disco/4,centro_y/2+1.5*alto,diametro_disco/2,diametro_disco/2);
		verde.setColor(new Color(0,200,0));
		rojo = new Ellipse(centro_x-diametro_disco/4,centro_y/2+1.35*alto,diametro_disco/2,diametro_disco/2);
		rojo.setColor(new Color(255,0,0));
		verde.draw();
		rojo.draw();
		verde.fill();
		rojo.fill();
		
	}

}
