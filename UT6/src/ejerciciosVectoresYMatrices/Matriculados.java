package ejerciciosVectoresYMatrices;

/*
 *  Declara y crea un tipo de variable que sea capaz de contener el número de alumnos 
 *  matriculados en 4 institutos en 5 niveles de estudios: ESO, BACHILLERATO, CGM, CGS, PCPI.
 *  
 * Instituto	ESO		BAC		CGM		CGS		PCPI
 * IES1			200		23		23		4		49
 * IES2
 * IES3
 * IES4
 */

import java.util.Arrays;

public class Matriculados {

	public static void main(String[] args) {
		String[][] array1;
		
		array1 = new String[4][5];
		/*[0][0][0][0][0]
		 *[0][0][0][0][0]
		 *[0][0][0][0][0]
		 *[0][0][0][0][0]
		 */
		
		array1[0][0]="ESO";
		array1[0][1]="BAC";
		array1[0][2]="CGM";
		array1[0][3]="CGS";
		array1[0][4]="PCPI";
		array1[1][0]="62";
		array1[1][1]="51";
		array1[1][2]="654";
		array1[1][3]="21";
		array1[1][4]="654";
		/*[ESO][BAC][CGM][CGS][PCPI]
		 *[ESO][BAC][CGM][CGS][PCPI]
		 *[ESO][BAC][CGM][CGS][PCPI]
		 *[ESO][BAC][CGM][CGS][PCPI]
		 *[ESO][BAC][CGM][CGS][PCPI]
		 */
		
		
		for(int i=0;i<array1.length;i++){
			for(int j=0;j<array1[i].length;j++){
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
