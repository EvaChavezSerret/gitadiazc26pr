package tareasUT5;

import java.util.Scanner;

	public class Racional {
	    private double numerador;
	    private double denominador;
	    
	 public Racional() {
	    numerador=0;
	    denominador=1;
	 }
	 
	 public Racional(double x, double y) {
	    numerador=x;
	    denominador=y;
	 }
	 
	 public static Racional sumar(Racional a, Racional b){
	    Racional c=new Racional();
	    c.numerador=a.numerador*b.denominador+b.numerador*a.denominador;
	    c.denominador=a.denominador*b.denominador;
	    return c;
	 }
	 
	 public static Racional restar(Racional a, Racional b){
		    Racional c=new Racional();
		    c.numerador=a.numerador*b.denominador-b.numerador*a.denominador;
		    c.denominador=a.denominador*b.denominador;
		    return c;
	 }
	 
	 public static Racional multiplicar(Racional a, Racional b){
		    return new Racional(a.numerador*b.numerador, a.denominador*b.denominador);
	 }
	 
	 public static Racional inversa(Racional a){
		    return new Racional(a.denominador, a.numerador);
	 }
		
	 public static Racional dividir(Racional a, Racional b){
		    return multiplicar(a, inversa(b));
	 }
	 
	 private double mcd(){
		    double u=Math.abs(numerador);
		    double v=Math.abs(denominador);
		    if(v==0){
		         return u;
		    }
		    double r;
		    while(v!=0){
		         r=u%v;
		         u=v;
		         v=r;
		    }
		    return u;
		 }
	 public Racional simplificar(){
		    double dividir=mcd();
		    numerador/=dividir;
		    denominador/=dividir;
		    return this;
	}
	 
	 public String toString(){
		    String texto=numerador+" / "+denominador;
		    return texto;
	}
	
	 public static void main(String[] args) {
		 
		 Scanner teclado = new Scanner(System.in);
		 
		 System.out.println("*****Bienvenido a la calculadora con fracciones*****\n");
		 
		 double num1, num2;
		 System.out.println("Introduce el numerador de la primera fracción: ");
		 num1 = teclado.nextDouble();
		 
		 System.out.println("Introduce el denominador de la primera fracción: ");
		 num2 = teclado.nextDouble();
		 
		 double num3, num4;
		 System.out.println("Introduce el numerador de la segunda fracción: ");
		 num3 = teclado.nextDouble();
		 
		 System.out.println("Introduce el denominador de la segunda fracción: ");
		 num4 = teclado.nextDouble();
		 
		 Racional resultado;
		 Racional x=new Racional(num1,num2);
		 resultado = x;
			// Mostrar una fracción
		 System.out.println("La primera fracción simplificada es:  "+resultado.simplificar());
		 Racional y=new Racional(num3,num4);
			// Mostrar una fracción
		 resultado = y;
		 System.out.println("La segunda fracción simplificada es:  "+resultado.simplificar() + "\n");
		 
		 System.out.println("¿Que operación quieres hacer con estas dos fracciones?\n"
		 		+ "1. Suma.\n2. Resta.\n3. Producto.\n4. División.\n5. Salir");
		 
		 int opcion = teclado.nextInt();
		 boolean seguir = true;
		 
			 if(opcion == 1){
				 resultado = Racional.sumar(x, y);
				 System.out.println("La suma de las fracciones es: "+ Racional.sumar(x, y));
				 System.out.println("La suma de las fracciones simplificada es: "+ resultado.simplificar());
			 }else if(opcion == 2){
				 resultado = Racional.restar(x, y);
				 System.out.println("La resta de las fracciones es: "+Racional.restar(x, y));
				 System.out.println("La resta de las fracciones simplificada es: "+ resultado.simplificar());
			 }else if(opcion == 3){
				 resultado = Racional.multiplicar(x, y);
				 System.out.println("El producto de las fracciones es: "+Racional.multiplicar(x, y));
				 System.out.println("El producto de las fracciones simplificada es: "+ resultado.simplificar());
			 }else if(opcion == 4){
				 resultado = Racional.dividir(x, y);
				 System.out.println("La división de las fracciones es: "+Racional.dividir(x, y));
				 System.out.println("La división de las fracciones simplificada es: "+resultado.simplificar());
			 }else if(opcion == 5){
				 seguir = false;
			 }else{
				 System.out.println("No ha elegido una opción correcta, se las recordamos:"
				 		+ "\n1. Suma.\n2. Resta.\n3. Producto.\n4. División.\n5. Salir");
			 }
		 
		 System.out.println("¡Hasta pronto!");
		  
		 teclado.close();
	 }
}

