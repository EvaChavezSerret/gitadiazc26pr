package Examen5DIC13;
import java.util.Scanner;


public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		String opcion;

		System.out.println("Bienvenido a Menu Generator.\n\nComenzaremos recopilando opciones (escribe * para terminar)\n");
		
		String [] guardadas = new String [40];
		
		int i = 0;
		int contador = 0;
		
		do{
			System.out.println("Dame una opcion: ");
			opcion = teclado.next();
			//en el examen no tenia lo de opcion =, solo el opcion.to....
			opcion = opcion.toLowerCase();
			
			if (!opcion.equals("*")){
				guardadas [i] = opcion;
				contador ++;
			}
			
			i++;
			
		}while(!opcion.equals("*"));

		guardadas [i+1] = "Salir";
		
		String elegida = "";
		do{
			System.out.println("* Menú *\n********");
			
			for(i=0;i!=contador;i++){
				System.out.println((i+1) + ". " + guardadas[i]);	
			};
			System.out.println((i+1) + ". " + "Salir");
			
			System.out.println("Opción elegida: ");
			
			
			int num_elegida = 0;
			
			
			elegida = teclado.next();
			
			//en el examen no tenia lo de elegida =, solo el elegida.to....
			elegida = elegida.toLowerCase();
			
			boolean encontrado = false;
	        
	        for(i=0; i<guardadas.length && !encontrado;i++) {
	                if (elegida.equals(guardadas[i])) encontrado=true;
	        }
	        
	        if (encontrado){
	        	num_elegida = i;
	        }
	        if(!elegida.equals("salir")){
	        	System.out.println("Ha elegido la opción: " + num_elegida + "\n");
			}
			
		}while(!elegida.equals("salir"));
			
		if(elegida.equals("salir")){
			System.out.println("Ha elegido la opción: " + (contador+1));
		}
		
		
		teclado.close();
	}

}
