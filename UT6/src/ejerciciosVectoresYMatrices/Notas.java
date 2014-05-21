package ejerciciosVectoresYMatrices;

public class Notas {

	public static void main(String[] args) {
		int[][] notas;
		notas = new int[4][];
		notas[0]= new int[4];
		notas[0][0] = 1;
		notas[0][1] = 3;
		notas[0][2] = 1;
		notas[0][3] = 3;
		notas[1]= new int[7];
		notas[1][0] = 0;
		notas[1][1] = 0;
		notas[1][2] = 0;
		notas[1][3] = 0;
		notas[1][4] = 0;
		notas[1][5] = 0;
		notas[1][6] = 0;
		notas[2]= new int[3];
		notas[2][0] = 0;
		notas[2][1] = 0;
		notas[2][2] = 0;
		notas[3]= new int[2];
		notas[3][0] = 0;
		notas[3][1] = 0;
		
		for(int i=0;i<notas.length;i++){
			for(int j=0;j<notas[i].length;j++){
				System.out.print(notas[i][j]+" ");
			}
			System.out.println();
		}
	}

	
}


