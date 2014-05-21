package simulacroDeSimulacro2EV;

import java.util.Arrays;
import java.util.Scanner;

public class Clave {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		char[] introducida ={'n'};
		char[] comprobacion;
		boolean correcto = true;

		while(correcto){
			do{
				System.out.println("Introduce una clave:");
				introducida = teclado.next().toCharArray();
			
			}while(introducida.length<6);
			
			//System.out.println(Arrays.toString(introducida));
			System.out.println("Vuelve a introducir la clave: ");
			comprobacion = teclado.next().toCharArray();
			
			
			if(introducida.length == comprobacion.length){
				for(int i=0; i<introducida.length;i++){
					if(introducida[i]!=comprobacion[i]){
						correcto = true;
					}
				}	
			}else{
				correcto = true;
			}
			
			if(!correcto){
				System.out.println("Clave de comprobación incorrecta.");
				
			}else{
				System.out.println("Clave correcta.");
				correcto = false;
			}
			
		}
		

	}

}
