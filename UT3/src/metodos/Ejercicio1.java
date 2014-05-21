package metodos;
// Escribir un método que convierta de euros a dólares. Recibirá un número decimal correspondiente a la cantidad en euros y 
// devolverá la cantidad correspondiente en dolares. Escribir el código en el main necesario para probarlo.
public class Ejercicio1 {

	public static void main(String[] args) {

		System.out.println(eurdolar(10.1));

	}

	public static double eurdolar(double euro){
		double dolar = 1.3775;
		dolar = (euro * dolar);
		return dolar;
	}
	
	
}
