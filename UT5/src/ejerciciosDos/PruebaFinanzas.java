package ejerciciosDos;

import java.util.Scanner;

import ejerciciosDos.Conversores.Finanzas;

public class PruebaFinanzas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double valor;
		
		Finanzas cambio;
		cambio = new Finanzas();

		System.out.println("Conversión a " + cambio.getDolarEuro());
		System.out.println("¿Cual es el precio en euros?");
		valor = teclado.nextDouble();
		System.out.println(cambio.eurosToDolares(valor));
		System.out.println("¿Cual es el precio en dolares?");
		valor = teclado.nextDouble();
		System.out.println(cambio.dolaresToEuros(valor));
		
		double actual;
		System.out.println("¿Cual es el cambio actual Dolar a Euro?");
		actual = teclado.nextDouble();
		Finanzas cambio2;
		
		cambio2 = new Finanzas(actual);

		System.out.println("Conversión a " + cambio2.getDolarEuro());
		System.out.println("¿Cual es el precio en euros?");
		valor = teclado.nextDouble();
		System.out.println(cambio2.eurosToDolares(valor));
		System.out.println("¿Cual es el precio en dolares?");
		valor = teclado.nextDouble();
		System.out.println(cambio2.dolaresToEuros(valor));
		
		teclado.close();
	}

}
