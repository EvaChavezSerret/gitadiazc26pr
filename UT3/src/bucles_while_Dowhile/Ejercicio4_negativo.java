package bucles_while_Dowhile;

import java.util.Scanner;

public class Ejercicio4_negativo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduzca un n�mero: ");
        int numero=teclado.nextInt();
        
        while(numero>=0){
                numero=teclado.nextInt();
        }
        
        System.out.println("N�mero introducido: "+ numero);
        System.out.println("N�mero negativo introducido.");
        teclado.close();
    }

}