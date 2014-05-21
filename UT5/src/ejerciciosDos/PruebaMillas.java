package ejerciciosDos;

import ejerciciosDos.Conversores.Millas;

public class PruebaMillas {

	public static void main(String[] args) {
		
		Millas conversor;
		
		conversor = new Millas();
		
		System.out.println("200 millas son " + conversor.millasAMetros(200) + " metros");
		

	}

}
