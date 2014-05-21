package arrays;
// las palabras están en un array, si dices una que está en el array es correcto ya
import java.util.Scanner;

public class Ejemplo_paloculta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palintro;
		String [] palabras;
		palabras = new String [5];
		palabras [0] = "ordenador";
		palabras [1] = "pc";
		palabras [2] = "computadora";
		palabras [3] = "portatil";
		palabras [4] = "computer";
		
		
		System.out.println("¿Cual es la herramienta más util? ");
		palintro = teclado.nextLine();
		palintro = palintro.toLowerCase();
		
		
		boolean encontrado = false;
        
        for(int i=0; i<palabras.length && !encontrado;i++) {
                if (palintro.equals(palabras[i])) encontrado=true;
        }
        
        if (encontrado){
        	System.out.println("Encontrado");
        }else{
        	System.out.println("No acertaste");
        }
        
        teclado.close();
	}

}
