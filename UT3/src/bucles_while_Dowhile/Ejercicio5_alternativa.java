package bucles_while_Dowhile;

import java.util.Scanner;

public class Ejercicio5_alternativa {

	//Escribe un programa que lea una serie de números, muestre el primero, 
    //no el segundo, si el tercero y así sucesivamente. 
    //Termina cuando insertamos un número negativo. El número negativo no se imprimirá.
    public static void main(String[] args) {

            Scanner teclado = new Scanner (System.in);
            
            int numero;
            String resultado;
            boolean imprimir;
            
            resultado = "";
            imprimir = true;
            
            do {
                    System.out.println("Introduzca un número: ");
                    numero  = teclado.nextInt(); 
                    if (imprimir && (numero >=0)) {
                    	resultado = resultado + numero + "";
                    }
                    imprimir = !imprimir;
            	}while (numero >= 0);        
             
            System.out.println(resultado);
            teclado.close();
            
    }

}