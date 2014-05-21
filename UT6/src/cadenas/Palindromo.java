package cadenas;

public class Palindromo {

	public static void main(String[] args) {
		/*
		 * 	StringBuilder pali,aux;
		
		pali = new StringBuilder("Alli ves Sevilla");
		aux = new StringBuilder(pali);		
		
		pali.reverse();
		
		System.out.println(pali);
		System.out.println(aux);
		 */
		String cadena=BuscarCaracteres.pedirCadena();

		String inversa=(new StringBuilder(cadena)).reverse().toString();


		System.out.printf("Cadena: %s\nInversa: %s\n",cadena,inversa);

		if (cadena.equals(inversa)) {
			System.out.println("¡Es palíndromo!");
		}
	}

}
