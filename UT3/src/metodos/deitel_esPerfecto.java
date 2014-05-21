package metodos;

import java.util.Scanner;

public class deitel_esPerfecto {
		// Página 272 del libro deitel en Castellano, ejercicio 24
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n;
        
        System.out.println("Introduce un número: ");
        n = teclado.nextInt();
        
        esPerfecto(n);
       
        teclado.close();
    }
    
public static void esPerfecto(int numero){
		
		int i, suma = 0;
		
		for (i = 1; i < numero; i++) {  // i son los divisores. Se divide desde 1 hasta n-1 
            if (numero % i == 0) {
                suma = suma + i;     // si es divisor se suma
            }
        }
        if (suma == numero) {  // si el numero es igual a la suma de sus divisores es perfecto
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");

        }
	}
    
}

