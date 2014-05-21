package bucles_while_Dowhile;

import java.util.Scanner;

public class Ejercicio4_negativo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduzca un número: ");
        int numero=teclado.nextInt();
        
        while(numero>=0){
                numero=teclado.nextInt();
        }
        
        System.out.println("Número introducido: "+ numero);
        System.out.println("Número negativo introducido.");
        teclado.close();
    }

}