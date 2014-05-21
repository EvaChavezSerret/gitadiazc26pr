package bucles_for;

import java.util.Scanner;
/*
 * Escribe un programa que pida dos números con el fin de visualizar la suma de todos los números 
 * que hay entre ambos números (incluidos dichos números). Si el primer número que inserte el usuaruio 
 * es mayor que el segundo, se volverán a pedir otros dos números hasta que el primer número insertado 
 * sea menor o igual que el segundo.
 */
public class Ejercicio5_dosvisualiza {

	public static void main(String[] args) {
		

		int n1 = 1;
		int n2 = 0;
		int total = 0;
		
        Scanner teclado=new Scanner (System.in);
            
        while (n1>n2){
                
                System.out.print("Ingresa un número: ");
                n1=teclado.nextInt();
        
                System.out.print("Ingresa otro número, y te sumo los que hay entre ellos: ");
                n2=teclado.nextInt();
                
                if (n1>n2){
                	System.out.print("El segundo numero tiene que ser mayor que el primero");}
        }       
       // System.out.print("Entre los numeros "+n1+" y "+n2+", ellos incluidos estan los numeros:\n\n");
        
        	for (int i=n1; i<=n2; i++){
                
        		total=total+i;
        		//System.out.print(i+"\t");
                        
                //if (n1==n2){
               // System.out.print(i+"\t");
                //}
        }  
        
        if (n1==n2){ total=n1+n2;}
        
        System.out.print("La suma total de todos los numeros es: "+total);
                
        	teclado.close();
        }

}
