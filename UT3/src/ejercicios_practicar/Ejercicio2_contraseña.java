package ejercicios_practicar;

import java.util.Scanner;

// Un programa que pida al usuario una contrase�a (en el programa escribe la palabra oculta que quieras). 
// El programa volver� a pedir la contrase�a hasta que la adivine el jugador o se llege a los 3 intentos, lo que ocurra primero. 
// Mostrar� un mensaje de aceptaci�n de la contrase�a o el de error por hacer tres intentos fallidos.
public class Ejercicio2_contrase�a {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String contrase�a;
		String palintro;
		contrase�a = "password";
		
		
		boolean encontrado = false;
		
		for(int i=0; i<3 && !encontrado;i++) {
			if (i==0){
				System.out.println("Introduzca la contrase�a: ");
			}else if(i==1){
				System.out.println("Restan dos intentos: ");
			}else if(i==2){
				System.out.println("�ltimo intento: ");
			}
			
			palintro = teclado.nextLine();
            if (palintro.equals(contrase�a)){
            	encontrado=true;
            }
    }
    
    if (encontrado){
    	System.out.println("La contrase�a introducida es correcta.");
    }else{
    	System.out.println("Ha agotado los tres intentos.");
    }
    
    teclado.close();
}

}
