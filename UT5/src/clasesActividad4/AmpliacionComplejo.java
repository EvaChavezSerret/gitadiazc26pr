package clasesActividad4;

import clasesActividad4.Complejo;
import metodos.Utilidades;

/*
 * Utilizando la clase "Complejo" de este paquete, crear un array de 40 números complejos
 * con el numero tanto real como imaginario aleatorio entre 0 y 10. Calcular el sumatorio de ese array.
 */

public class AmpliacionComplejo {

	public static void main(String[] args) {
		
		Complejo complejos [];
		complejos = new Complejo[40];
		
		for(int i=0;i<complejos.length;i++){
			complejos[i] = new Complejo(Utilidades.aleatorio(0, 10),Utilidades.aleatorio(0, 10));
		}
		
		Complejo sumatorio;
		sumatorio = new Complejo(0,0);
		
		
		for(int i=0;i<complejos.length;i++){
			sumatorio.suma(complejos[i]);
		}
		System.out.println(sumatorio);		
		

	}

}
