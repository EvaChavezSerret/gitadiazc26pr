package ejercicios_practicar;

import java.util.Scanner;

// Un programa que pida al usuario una contraseña (en el programa escribe la palabra oculta que quieras). 
// El programa volverá a pedir la contraseña hasta que la adivine el jugador o se llege a los 3 intentos, lo que ocurra primero. 
// Mostrará un mensaje de aceptación de la contraseña o el de error por hacer tres intentos fallidos.
public class Ejercicio2_contraseña {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String contraseña;
		String palintro;
		contraseña = "password";
		
		
		boolean encontrado = false;
		
		for(int i=0; i<3 && !encontrado;i++) {
			if (i==0){
				System.out.println("Introduzca la contraseña: ");
			}else if(i==1){
				System.out.println("Restan dos intentos: ");
			}else if(i==2){
				System.out.println("Último intento: ");
			}
			
			palintro = teclado.nextLine();
            if (palintro.equals(contraseña)){
            	encontrado=true;
            }
    }
    
    if (encontrado){
    	System.out.println("La contraseña introducida es correcta.");
    }else{
    	System.out.println("Ha agotado los tres intentos.");
    }
    
    teclado.close();
}

}
