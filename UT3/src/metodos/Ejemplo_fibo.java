package metodos;

public class Ejemplo_fibo {

	public static int fibo(int n){
		
		if(n<2){
			return n;
		}else{
			return fibo(n-1)+fibo(n-2);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(fibo(10));

	}

}
