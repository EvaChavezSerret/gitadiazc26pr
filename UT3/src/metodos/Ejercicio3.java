package metodos;

import java.util.Scanner;

// Crea un método que nos diga si un número es capicúa (devuelve true en el caso de que lo sea y false si no lo es).
public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Inroduce un número");
		int numero = teclado.nextInt();
		
		System.out.println(capicua(numero));
		
		teclado.close();
	}
	
	public static boolean capicua(int numero){
		
		int numeroinverso, resto, falta;
		
		falta=numero;
		numeroinverso=0;
		resto=0;	
		
		resto = falta%10;
		
		falta = falta/10;

		numeroinverso=numeroinverso*10+resto;
		
		while(falta!=0){
			resto=falta%10;
			numeroinverso=numeroinverso*10+resto;
			falta=falta/10;
			}
		boolean palindromo;
		if(numeroinverso==numero){
			palindromo = true;
		}else{
			palindromo = false;
		}
		
		return palindromo;
	}

}
