package ejerciciosDos;

import ejerciciosDos.Conversores.Coche;

public class PruebaCoche {

	public static void main(String[] args) {
		
		//Hueco
		Coche viejo;
		//Objeto
		viejo = new Coche("BMW","525tds");
		System.out.println("La marca del coche es " + viejo.getMarca() + 
				" y el modelo " + viejo.getModelo() + " llevo registrados " 
				+ Coche.cantidadCoches + " coches.");
		
		Coche nuevo;
		nuevo = new Coche();
		System.out.println("La marca del coche es " + nuevo.getMarca() + 
				" y el modelo " + nuevo.getModelo() + " llevo registrados " 
				+ Coche.cantidadCoches + " coches.");
		
		
		
	}

}
