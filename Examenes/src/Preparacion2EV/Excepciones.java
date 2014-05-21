package Preparacion2EV;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) throws noPrimerNumero {
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		String cadena;
		
		//InputMismatchException (No introducir lo esperado)
		try {
			System.out.println("Introduce un n�mero (es int):");
			numero = teclado.nextInt();
		} catch (InputMismatchException noNumero) {
			System.out.println("No has metido un n�mero.");
		}
		
		//Me creo una
			try{
				System.out.println("Introduce una cadena que el primero caracter SI sea n�mero (es String):");
				cadena = teclado.next();
				if (!Character.isDigit(cadena.charAt(0))){
	    			throw new noPrimerNumero();
	    		}
			}catch (noPrimerNumero nPn){
				System.out.println("El primero no es un n�mero.");
			}
			
			//ArithmeticException y InputMistmachException y IllegalArgumentException
			int dividendo=0,divisor=0;
			try {
				
				System.out.print("Introduce el dividendo: ");
				dividendo=teclado.nextInt();
				if(dividendo > 8){
					throw new IllegalArgumentException();
				}
				System.out.print("Introduce el divisor: ");
				divisor=teclado.nextInt();
				System.out.println("Resultado: " + (dividendo/divisor));
				
				
			}
			catch (ArithmeticException e) {
				System.out.println("Error, divisi�n por cero.");
			}
			catch (InputMismatchException  e) {
				System.out.println("Error, no es un n�mero.");
			}
			catch (IllegalArgumentException e){
				//As� lo imprime en rojo
				System.err.println("Mas de 8 el dividendo");
			}
			
			//Cualquier excepcion
			double dos;
			try{
				System.out.println("Introduce un double:");
				dos = teclado.nextDouble();
			}catch (Exception e){
				System.out.println("El n�mero no es un double.");
				//As� lo muestra
				System.out.println(e.toString());
			}
			
			//Otra Nueva
			String saludo = "hola";
			try{
				System.out.println("Saluda educadamente:");
				saludo = teclado.next();
			if(!saludo.equals("hola")){
				throw new malEducado(saludo);
			}
			}catch (malEducado a){
				System.err.println("Saluda perro.");
			}
			

	}

}
