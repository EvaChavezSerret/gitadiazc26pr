package ejemplos.clase;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	boolean se_congela;
	
	se_congela = false;
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("Dame la temperatura del agua: ");
	
	if (teclado.nextInt()<0) se_congela=true;
	//if (!(teclado.nextInt()<0)) se_congela=true; ASI SERÍA NEGARLO
	
	if (se_congela) System.out.println("pon la calefacción.");
	
	else System.out.println("pon el aire acondicionad.");
	
	teclado.close();
	}

}
