package metodos;

import java.util.Scanner;

// La aplicaci�n pedira n�meros reales y mostrar� el redondeo (sin decimales). Math.floor(x+0.5)
public class ejemplo_redondeo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double n;
		
		do{
			
			System.out.println("�Que n�mero quieres redondear?");
			n = teclado.nextDouble();
			
			System.out.println(n + " redondeado es: " + redondeo(n));
			
		}while(n != 0.0);
		
		teclado.close();
	}
	
	public static int redondeo(double n){
		int sol = 0;
		sol = (int) Math.floor(n + 0.5);
		return sol;
	}

}
