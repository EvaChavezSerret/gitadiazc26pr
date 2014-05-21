package ejerciciosDos.Conversores;

/*
 * Realiza una clase Finanzas que convierta d�lares a euros y viceversa. Codifica los m�todos dolaresToEuros
 *  y eurosToDolares. Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y d�lares.
 *  La clase tiene que tener:
 *  	Un constructor finanzas que establecer� el cambio D�lar-Euro en 1.36.
 *  	Un constructor finanzas(double), el cual permitir� configurar el cambio D�lar-Euro.
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
