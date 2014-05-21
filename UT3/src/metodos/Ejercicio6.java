package metodos;

// Escribe un programa que implemente el algoritmo de la criba de Eratóstenes. El cáculo de la criba 
// se hará en un método, que imprimirá cada uno de los números no primos encontrados. El pseudocódigo 
// en la página en inglés es más claro.

public class Ejercicio6 {
	
	public static void imprimeEratostenes(int n){
		
		if(n<=1) return;
		
		boolean [] A;
		
		A = new boolean [n+1];
		
		for (int i = 0; i<n;i++){
			A [i] = true;
		}
		
		for (int i = 2; i<Math.sqrt(n);i++){
			if (A[i] == true){
				for(int j = i*i;j<=n;j+=i){
					A[j]=false;
					
				}
			}
			
		}
		for (int i=2;i<n;i++){
			if(A[i]){
				System.out.print(i + " ");	
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		imprimeEratostenes(100);
		

	}

}
