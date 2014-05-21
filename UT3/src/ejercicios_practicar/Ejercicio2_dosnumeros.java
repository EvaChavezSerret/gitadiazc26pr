package ejercicios_practicar;

import java.util.Scanner;

// Escribe un programa que pida dos n�meros. Si los dos n�meros dados son iguales, se visualizar� 
// un mensaje informando de esto y se volver�n a pedir otros dos n�meros. 
// El programa termina cuando los dos n�meros no son iguales y se imprime el mayor de los dos.
public class Ejercicio2_dosnumeros {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int num1, num2;
				
		do{
			System.out.println("Escribe un n�mero: ");
			num1 = teclado.nextInt();
			System.out.println("Escribe otro n�mero: ");
			num2 = teclado.nextInt();
			if(num1==num2){
				System.out.println("Son iguales, empezamos.");
			}
		}while (num1 == num2);
		
		if(num1 > num2){
			System.out.println("El n�mero mayor es: " + num1);
		}else{
			System.out.println("El n�mero mayor es: " + num2);
		}
		
		teclado.close();
	}

}
