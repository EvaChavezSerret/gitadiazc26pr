package bucles_while_Dowhile;

import java.util.Scanner;

/*Modifica el ejercicio 3 de condicionales switch (operadores '+', '-', '*', '/') 
de forma que permita hacer una operación, volverá a pedir al usuario el operador,
para, con los mismos números, volver a hacer otra operación. El programa terminará 
cuando se inserte un caracter que no es un operador.
*/

public class Ejercicio6_dosnumoper{

	public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int n1,n2;
        String respuesta;
        int solucion;
        
        respuesta = "";
      
        
        System.out.println("Introduzca el primer número: ");
        n1 = teclado.nextInt();
        
        System.out.println("Introduzca el segundo número: ");
        n2 = teclado.nextInt();
        
        do {
                System.out.println("Introduzca la operación [+, -, *, /]: ");
                respuesta  = teclado.next(); 
                if (respuesta.equals("+")) {
                	solucion = n1 + n2;
                	System.out.println(n1 + " + " + n2 + " = " + solucion);
                }else if (respuesta.equals("-")) {
                	solucion = n1 - n2;
                	System.out.println(n1 + " - " + n2 + " = " + solucion);
                }else if (respuesta.equals("*")) {
                	solucion = n1 * n2;
                	System.out.println(n1 + " * " + n2 + " = " + solucion);
                }else if (respuesta.equals("/")) {
                	solucion = n1 / n2;
                	System.out.println(n1 + " / " + n2 + " = " + solucion);
                }
            
        	}while (respuesta.equals("+") || respuesta.equals("-") || respuesta.equals("*") || respuesta.equals("/"));       
        
        System.out.println("No has introducido un operador correcto");
        
        teclado.close();
        
	}

}
