package ejemplosUT6;

public class Arrays {

	public static void main(String[] args) {
		//Declaración, da igual una forma que otra
		int [] enteros;
		int enteros2 [];
		String [] cadenas;
		
		//Creación
		enteros = new int[40];
		cadenas = new String[40];
		
		//Inicialización, los elementos que ponga es el tamaño del array
		int[] enteros3 = {1,2,3,7};
		String [] cadenas2 = {"Uno","Dos","Tres"};
		//En la inicialización creo que los objetos que están contenido en el array
		String [] cadenas3 = {new String("Uno"), new String("Dos")};
		
		//Inicializar de 0 a 39
		for(int i=0;i<enteros.length;i++){
			enteros[i]=i;
		}
		
		for(int i=0;i<cadenas.length;i++){
			cadenas[i]=new String(Integer.toString(i));
		}
		
		//Recorrido
		for(int i=0;i<cadenas.length;i++){
			System.out.println(cadenas[i]);
		}
		
		for(String c:cadenas2){
			System.out.println(c);
		}
		
		//Array bidimensional
		int[][] enteros4;
		
		int[][] enteros5 = {{1,2},{3,4}};
		
		System.out.println(enteros5[0][1]);
		System.out.println(enteros5[1][0]);
		
		//Con el new
		enteros4 = new int[3][3];
		
		enteros4[1][1]=1;
		enteros4[2][2]=2;
		enteros4[1][2]=3;

	}

}
