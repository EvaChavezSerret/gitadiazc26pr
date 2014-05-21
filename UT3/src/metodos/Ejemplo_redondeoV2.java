package metodos;

import java.util.Scanner;

//V1: La aplicaci�n pedira n�meros reales y mostrar� el redondeo (sin decimales). Math.floor(x+0.5)
//V2: Partiendo del ejercicio anterior, mejora el deondeador haciendo que:
// a) al comienzo se pedir� el n�mero de decimales a los que se quiere redondear
// b) el m�todo redondea tendr� un segundo par�metro, para decirle los decimales que queremos
public class Ejemplo_redondeoV2 {


	public static void main(String[] args) {
		
		//System.out.println(redondeo(21.515484,4));
		
		Scanner teclado = new Scanner(System.in);
		double n;
		int d;
		
		do{
			System.out.println("�Cuantos decimales quieres?");
			d = teclado.nextInt();
			
			System.out.println("�Que n�mero quieres redondear?");
			n = teclado.nextDouble();
			
			System.out.println(n + " redondeado es: " + redondeo(n,d));
			
			
		}while(d != 0.00);
		
		System.out.println("Adios!");
		
		teclado.close();
	}
	
	public static double redondeo(double n, int d){
		double sol = 0;
		
		/*
		 * int acumula = 1;
		 * int aux = 0;
		 * for(int i=0;i<d;i++){
		 * aux = acumula * 10;
		 * acumula = aux;
		 * }
		 */
			
		sol = ((double) Math.floor(n*Math.pow(10, d) + 0.5)/Math.pow(10, d));
	
		return sol;
	}
	

}
