package metodos;

public class Utilidades {
	

	public static void main(String[] args) {

		
		
	}

	public static int aleatorio(int min, int max){
		int sol = 0;
		sol = (int)(Math.random()* ((max - min) + 1)) + min;
		return sol;
	}
	
}
