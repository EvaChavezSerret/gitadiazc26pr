package ejercicios_iniciales;

public class PruebaTemperatura {

	public static void main(String[] args) {
		// Genera objeto de la clase temperatura
		Temperatura termometro1 = new Temperatura();
		// Prueba de los metodos, 20�C = 68 F
		termometro1.setCelsius(20);
		System.out.println("getCelsius = " + termometro1.getCelsius());
		System.out.println("getFahrenheit = " + termometro1.getFahrenheit());
		termometro1.setFahrenheit(20);
		System.out.println("getCelsius(20F) = " + termometro1.getCelsius());
		System.out.println("getFahrenheit(20F) = "
				+ termometro1.getFahrenheit());
		// prueba m�todos est�ticos
		System.out.println("100� celsius son:"
				+ Temperatura.celsiusToFarenheit(100) + " grados Farenheit");
	}
}
