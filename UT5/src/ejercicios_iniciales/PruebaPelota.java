package ejercicios_iniciales;

import objetos.graphics2.Rectangle;

public class PruebaPelota {

	public static void main(String[] args) throws InterruptedException{
		Pelota p;

		(new Rectangle(10,10,400,400)).draw();
		p = new Pelota();
		
		p.setLimites(10,10,400,400);
		//p.setPaso(5);
		p.dibuja();
		
		while(true){
			p.mueve();
			Thread.sleep(50);
		}

	}

}
