package metodos;
// Escribir un m�todo que convierta de euros a d�lares. Recibir� un n�mero decimal correspondiente a la cantidad en euros y 
// devolver� la cantidad correspondiente en dolares. Escribir el c�digo en el main necesario para probarlo.
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
