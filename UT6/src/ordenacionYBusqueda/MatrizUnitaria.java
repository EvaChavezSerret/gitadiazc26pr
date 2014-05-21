package ordenacionYBusqueda;

public class MatrizUnitaria {
	
	public static void unitaria(){
		
		int dimension = 8;
		int [][] matriz = new int [dimension][dimension];
		

		/*
		 * //Se rellena la matriz con 0.
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = 0;
			}
		}
		 */
		
		//Rellenar matriz. Diagonal a 1.
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i]==matriz[j]){
					matriz[i][j]=1;
				}else{
					matriz[i][j] = 0;	
				}
			}
		}
		
		//Se imprime la matriz para verla.
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print((matriz[i][j]) + "\t");
			}
			System.out.println();
		}
			
		
	}

	public static void main(String[] args) {
		
		unitaria();

	}

}
