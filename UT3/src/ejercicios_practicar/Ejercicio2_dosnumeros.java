package ejercicios_practicar;

import java.util.Scanner;

// Escribe un programa que pida dos números. Si los dos números dados son iguales, se visualizará 
// un mensaje informando de esto y se volverán a pedir otros dos números. 
// El programa termina cuando los dos números no son iguales y se imprime el mayor de los dos.
public class Ejercicio2_dosnumeros {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int num1, num2;
				
		do{
			System.out.println("Escribe un número: ");
			num1 = teclado.nextInt();
			System.out.println("Escribe otro número: ");
			num2 = teclado.nextInt();
			if(num1==num2){
				System.out.println("Son iguales, empezamos.");
			}
		}while (num1 == num2);
		
		if(num1 > num2){
			System.out.println("El número mayor es: " + num1);
		}else{
			System.out.println("El número mayor es: " + num2);
		}
		
		teclado.close();
	}

}
