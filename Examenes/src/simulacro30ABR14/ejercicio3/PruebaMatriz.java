package simulacro30ABR14.ejercicio3;

public class PruebaMatriz {

	public static void main(String[] args) {
		
		MatrizDispersa uno;
		
		uno = new MatrizDispersa(10, 10, 10);
		
		uno.setValor(1, 1, 3.5);
		uno.setValor(9, 3, 3.23);
		
		uno.imprimir();
		
		System.out.println("En la posici�n (0,0) hay un: " + uno.getValor(0, 0));
		System.out.println("En la posici�n (1,1) hay un: " + uno.getValor(1, 1));

	}

}
