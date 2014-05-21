package metodos;

public class Ejemplo_array {
// Método que recibe un array e imprime el contenido del array
	
	public static void imprime(int[] vector){
		System.out.print("[");
		for(int i=0;i<vector.length-1;i++){
			System.out.print(vector[i]+", ");
		}
		System.out.print(vector[vector.length-1]+"]");
		
	}
	
	public static String añadePunto(String frase){
		if(frase.charAt(frase.length()-1)!='.'){
			return frase+".";
		}else{
			return frase;	
		}
	}
	
	public static void main(String[] args) {
		
		int[] prueba = {1,2,3,4,5};
		imprime(prueba);
		
		String fraseMain;
		System.out.println();
		
		fraseMain = "Perro";
		
		fraseMain = añadePunto(fraseMain);
		
		System.out.println(fraseMain);

	}

}
