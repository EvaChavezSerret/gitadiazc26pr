package ejemplos.operadores;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realizar las expresiones aritméticas propuestas en clase. Intentar analizar el 
		//resultado en Java. Después comprobar ejecutándolas, que es el resultado que realmente Java nos ofrece.
		//1) ((-5)^2+10)*3
		//2) 35.3-53/10
		//3) 1+5%1.5*8/2
		//4) -(-2^5+18/5)
		//5) 65/3/4.0*3
		//6) 44%10+7-25^10-2
		//7) 4.0/10.0+3.5*2
		//8) 10%4+6/2
		//9) (|4-20/3|)^3
		//10) RAIZ (4.5-5.0)+7*3
		//11) 3*10/3+10%3
		//12) 3L^3
		//13) (36.0/4)+(5*3)
		//14) (28/7)*2
		//15) (13*3)%10
		//16) 2^3^3
		
		double resultado = 0;
		
		resultado=(Math.pow(-5, 2)+10)*3;
		System.out.println("El resultado 1) de ((-5)^2+10) * 3 es " + resultado);
		
		resultado= 35.3 - 53 / 10;
		System.out.println("El resultado 2) de 35.3 - 53 / 10 es " + resultado);
		
		resultado= 1 + 5 % 1.5 * 8 / 2;
		System.out.println("El resultado 3) de 1 + 5 % 1.5 * 8 / 2 es " + resultado);
		
		resultado= -(Math.pow(-2, 5) + 18 / 5);
		System.out.println("El resultado 4) de -(-2^5 + 18 / 5) es " + resultado);
		
		resultado= 65 / 3 / 4.0 * 3;
		System.out.println("El resultado 5) de 65 / 3 / 4.0 * 3 es " + resultado);
		
		resultado= 44 % 10 + 7 - Math.pow(25, 10) -2;
		System.out.println("El resultado 6) de 44 % 10 + 7 - 25^10 - 2 es " + resultado);
		
		resultado= 4.0 / 10.0 + 3.5 * 2;
		System.out.println("El resultado 7) de 4.0 /10.0 + 3.5 * 2 es " + resultado);
		
		resultado= 10 % 4 + 6 / 2;
		System.out.println("El resultado 8) de 10 % 4 + 6 / 2 es " + resultado);
		
		resultado= Math.pow(Math.abs(4-20/3), 3);
		System.out.println("El resultado 9) de (|4 - 20 / 3|)^3 es " + resultado);
		
		resultado= Math.sqrt(4.5-5.0)+7*3;
		System.out.println("El resultado 10) de RAIZ (4.5 - 5.0) + 7 * 3 es " + resultado);
		
		resultado= 3 * 10 / 3 + 10 % 3;
		System.out.println("El resultado 11) de 3 * 10 / 3 + 10 % 3 es " + resultado);
		
		resultado= Math.pow(3L, 3);
		System.out.println("El resultado 12) de 3L^3 " + resultado);
		
		resultado= (36.0 / 4)+(5 * 3);
		System.out.println("El resultado 13) de (36.0/4)+(5*3) " + resultado);
		
		resultado= (28 / 7)*2;
		System.out.println("El resultado 14) de (28 / 7)*2 " + resultado);
		
		resultado= (13 * 3) % 10;
		System.out.println("El resultado 15) de (13*3)%10 " + resultado);
		
		resultado=  Math.pow(Math.pow(2, 3), 3);
		System.out.println("El resultado 16) de 2^3^3 " + resultado);
	}

}
