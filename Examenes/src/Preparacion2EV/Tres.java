package Preparacion2EV;

import java.util.Arrays;

public class Tres {
	
	/*
	 * 3. Crear la clase ArrayOrdenado. ArrayOrdenado almacena un array de números enteros que siempre está ordenado. 
	 * La clase tendrá:
	- Un constructor, al que le pasamos un array de enteros que se almacenará internamente.
	- Un constructor, al que le pasamos un valor y crea un ArrayOrdenado de ese tamaño.
	- getElemento(int x) devuelve el valor del elemento en la posición x.
	- setElemento(int x, int elto) cambia el elemento en la posición x por el elemento elto. 
	Obviamente, como es un array ordenado, si el número tiene otro orden se colocará automáticamente en otra posición.
	- toString()
	 */
	
	private int [] enteros;
	
	//Método que ordena arrays
	private void ordenar(int [] aOrdenar){
		Arrays.sort(aOrdenar);
	}
	
	// - Un constructor, al que le pasamos un array de enteros que se almacenará internamente. 
	public Tres(int [] enterosIntro){
		enteros = Arrays.copyOf(enterosIntro, enterosIntro.length);
		ordenar(enteros);
	}
	
	// -- Un constructor, al que le pasamos un valor y crea un ArrayOrdenado de ese tamaño.
	public Tres (int tamaño){
		enteros = new int [tamaño];
		ordenar(enteros);
	}
	
	// - getElemento(int x) devuelve el valor del elemento en la posición x.
	public int getElemento (int x){
		return enteros[x];
	}
	
	// -- setElemento(int x, int elto) cambia el elemento en la posición x por el elemento elto.
	public void setElemento(int x, int elto){
		enteros[x] = elto;
		ordenar(enteros);
	}
	
	// - toString()
	public String toString(){
		return Arrays.toString(enteros);
	}
	
	// Aleatorio
	public static int aleatorio(int min, int max){
		int sol = 0;
		sol = (int)(Math.random()* ((max - min) + 1)) + min;
		return sol;
	}

	public static void main(String[] args) {
		
		Tres x;
		
		x = new Tres(50);
		
		for(int i=0; i<50;i++){
			x.setElemento(i, aleatorio(1,50));
		}
		
		System.out.println(x);

	}

}
