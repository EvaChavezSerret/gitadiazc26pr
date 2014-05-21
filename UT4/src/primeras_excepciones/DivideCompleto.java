package primeras_excepciones;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class DivideCompleto {

	public static void main(String[] args) {
		int dividendo=0, divisor=0;
		
		Scanner teclado = new Scanner(System.in);
		
		
			try{
				System.out.println("Introduce el dividendo: ");
				dividendo = teclado.nextInt();
				System.out.println("Introduce el divisor: ");
				divisor = teclado.nextInt();
			}catch(InputMismatchException e){
				System.err.println("Error, no es un número entero.");
				System.exit(-1);
			}catch(NoSuchElementException|IllegalStateException e){ //esto es para no repetir dos catch, se puede poner así
				System.out.println("Error.");
				System.exit(0);
			}
			
			try{//si dentro de esto se produce una excepcion, hace otra cosa
				System.out.println("Resultado: " + (dividendo/divisor));
			}catch(ArithmeticException error){ //entre()el tipo de error que se produce
				System.out.println("Error, división por cero.");
				System.err.println(error.getMessage());
			}catch(Exception e){
				System.out.println("Error, inesperado.");
				System.err.println(e.getMessage());
			}
		
		System.out.println("Adiós");

		teclado.close();
	}

}
