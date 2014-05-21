package Ejercicio_profundización;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Escribe un programa que calcule el área y el perímetro de una superficie rectangular. 
 * Para ello, se pedirá el valor de los lados del rectángulo. Valida que los datos que 
 * inserta el usuario sean mayores o iguales a 0. Si no es así, se pedirá de nuevo el lado 
 * indicado incorrectamente. También se validará que el usuario inserte números y no letras. 
 * Hay que usar un método que se encargue de pedir el valor de uno de los lados.
 */

public class Ejercicio2_6 {

        private static Scanner teclado;

        public static double leerLadoPositivo() {

                teclado = new Scanner(System.in);
                double lado=0;
                boolean bueno;

                do {
                    System.out.print("Introduzca lado: ");

                    try {
                    	lado = teclado.nextDouble();
                    	bueno = ( lado > 0 );
                    }
                    catch ( InputMismatchException entradaInvalida ) {
                    	System.out.println("Debe introducir números. Inténtelo de nuevo");
                    	teclado.nextLine();
                    	bueno=false;
                    }

                }while (!bueno);

                return lado;
        }

        public static void main(String[] args) {

                double[] lados = new double[2];
                boolean ladoCorrecto;
                boolean hayErrores;                        

                for ( int i = 0; i < lados.length; ++i ) 
                     lados[i] = leerLadoPositivo();


                System.out.println("=========== R E S U L T A D O S ===========");

                for ( int i = 0; i < lados.length; ++i ) {

                        System.out.printf("Lado nº %d: %.2f\n", (i+1), lados[i]);
                }

                System.out.printf("PERIMETRO: %.2f\n", (lados[0] + lados[1]) * 2 );
                System.out.printf("AREA: %.2f\n", lados[0] * lados[1] );                
        }
}