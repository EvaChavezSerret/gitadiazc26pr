package metodos;

// Escribe un programa que implemente el algoritmo de la criba de Erat�stenes. El c�culo de la criba 
// se har� en un m�todo, que imprimir� cada uno de los n�meros no primos encontrados. El pseudoc�digo 
// en la p�gina en ingl�s es m�s claro.

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
