package ejerciciosDos.Conversores;

/*
 * Realiza una clase Finanzas que convierta dólares a euros y viceversa. Codifica los métodos dolaresToEuros
 *  y eurosToDolares. Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y dólares.
 *  La clase tiene que tener:
 *  	Un constructor finanzas que establecerá el cambio Dólar-Euro en 1.36.
 *  	Un constructor finanzas(double), el cual permitirá configurar el cambio Dólar-Euro.
 */

public class Finanzas {
	
	private double DolarEuro;

	public double getDolarEuro() {
		return DolarEuro;
	}

	public Finanzas(){
		DolarEuro = 1.36;	
	}
	
	public Finanzas(double cambio){
		DolarEuro = cambio;	
	}
	
	
	public double dolaresToEuros(double dolares){
		
		double euros = 0;
		euros = dolares * DolarEuro;
		return euros;
				
	}

	public double eurosToDolares(double euros){
	
		double dolares = 0;
		dolares = euros / DolarEuro;
		return dolares;
			
	}

}
