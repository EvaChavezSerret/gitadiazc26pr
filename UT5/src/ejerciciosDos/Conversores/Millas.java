package ejerciciosDos.Conversores;

/*
 * Ejercicio 1. Crea una clase con un método estático millasAMetros que toma como parámetro de 
 * entrada un valor en millas marinas y las convierte a metros. 
 * Una vez tengas este método escribe otro millasAKilometros que realice la misma conversión, 
 * pero esta vez exprese el resultado en kilómetros.
 * Nota:1 milla marina equivale a 1852 metros.      
 */

//Aqui NO está estatico

public class Millas {
	
	//Final para decir que es una constante
	private final double metrosXmilla = 1852;
	
	public double millasAMetros (double millas) {
		return millas * metrosXmilla;
	}
	
	public double millasAKilometros (double millas) {
		return millas * metrosXmilla/1000.0;
	}

}
