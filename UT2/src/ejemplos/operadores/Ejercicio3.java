package ejemplos.operadores;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
boolean expresion;
		
		//\t imprime un tabulador
		System.out.println("expresión\t\t\t\tresultado\n");
		
		expresion = !(5>3);
		System.out.print("not(5>3)\t\t\t\t" + (expresion));
		
		expresion = (5!=3)&&(4>3);
		System.out.print("\n\n(5!=3)and(4>3)\t\t\t\t" + (expresion));
		
		expresion = (5!=3)||(4>3);
		System.out.print("\n\n(5!=3)or(4>3)\t\t\t\t" + (expresion));
		
		expresion = (5<8)&&(3==3);
		System.out.print("\n\n(5<8)and(3=3)\t\t\t\t" + (expresion));
		
		expresion = !((5!=3)||(4>8));
		System.out.print("\n\nnot((5!=3)or(4>8))\t\t\t" + (expresion));
		
		expresion = ((4!=3)&&((3>2)||(4>8)));
		System.out.print("\n\n((4!=3)and((3>2)or(4>8)))\t\t" + (expresion));
		
		expresion = !(3==5)||(4!=2);
		System.out.print("\n\nnot(3==5)or(4!=2)\t\t\t" + (expresion));
		
		expresion = !(3==5)&&(4!=2);
		System.out.print("\n\nnot(3==5)and(4!=2)\t\t\t" + (expresion));
		
		expresion = (8>2)&&(4<2)||(3!=4);
		System.out.print("\n\n(8>2)and(4<2)or(3!=4)\t\t\t" + (expresion));
		
		expresion = ((3>2)&&(4<5)||(3!=2))&&!(2!=5);
		System.out.print("\n\n((3>2)and(4<5)or(3!=2))andnot(2!=5)\t" + (expresion));

	}

}
