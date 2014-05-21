package Examen5DIC13;
import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int n = 0;
		int fig1 = 0;
		int fig2 = 0;
		int fig3 = 0;
		
		System.out.println("Dame el tamaño de las figuras: ");
		n = teclado.nextInt();
		fig1 = n;
		fig2 = n;
		fig3 = n;
		
		System.out.println("Figura 1");
		
		do{
			for(int i=0;i<fig1;i++){
				System.out.print("@");
		}
		System.out.println();
		fig1--;
		}while(fig1!=0);
		
		System.out.println("Figura 2");
		
		
			do{
				
				for(int i=0;i<fig2;i++){
					System.out.print("@");
			}
			System.out.println();
			fig2--;
			}while(fig2!=0);
		
		
		
		System.out.println("Figura 3");
		
		do{
			for(int i=0;i<fig3;i++){
				System.out.print("@");
		}
		System.out.println();
		fig3--;
		}while(fig3!=0);
		
		
		teclado.close();
	}

}
