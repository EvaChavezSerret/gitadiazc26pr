package tareasUT5;

public class Fraccion {
    private int num;
    private int den;
 public Fraccion() {
    num=0;
    den=1;
 }
 public Fraccion(int x, int y) {
    num=x;
    den=y;
 }
 public static Fraccion sumar(Fraccion a, Fraccion b){
    Fraccion c=new Fraccion();
    c.num=a.num*b.den+b.num*a.den;
    c.den=a.den*b.den;
    return c;
 }
 public static Fraccion restar(Fraccion a, Fraccion b){
    Fraccion c=new Fraccion();
    c.num=a.num*b.den-b.num*a.den;
    c.den=a.den*b.den;
    return c;
 }
 public static Fraccion multiplicar(Fraccion a, Fraccion b){
    return new Fraccion(a.num*b.num, a.den*b.den);
 }
 public static Fraccion inversa(Fraccion a){
    return new Fraccion(a.den, a.num);
 }
 public static Fraccion dividir(Fraccion a, Fraccion b){
    return multiplicar(a, inversa(b));
 }
 private int mcd(){
    int u=Math.abs(num);
    int v=Math.abs(den);
    if(v==0){
         return u;
    }
    int r;
    while(v!=0){
         r=u%v;
         u=v;
         v=r;
    }
    return u;
 }
 public Fraccion simplificar(){
    int dividir=mcd();
    num/=dividir;
    den/=dividir;
    return this;
 }
 public String toString(){
    String texto=num+" / "+den;
    return texto;
 }
 public static void main(String[] args) {

	 Fraccion x=new Fraccion(2,3);
	// Mostrar una fracción
	      System.out.println("x--> "+x);
	// Cuando se pone una fracción x como argumento de la función println o se concatena con un string se llama automáticamente a la función miembro toString, lo que equivale a la siguiente llamada

	      System.out.println("x--> "+x.toString());
	      /*// Suma de dos fracciones
	      Fraccion x=new Fraccion(2,3);
	      Fraccion y=new Fraccion(4,3);
	      System.out.println("x+y= "+Fraccion.sumar(x, y));
	// Producto de dos fracciones
	      Fraccion x=new Fraccion(2,3);
	      Fraccion y=new Fraccion(4,3);
	      System.out.println("x*y= "+Fraccion.multiplicar(x, y));
	 //Operaciones combinadas
	// Primero suma las fracicones x e y y luego hace el producto con la fracción z

	      Fraccion x=new Fraccion(2,3);
	      Fraccion y=new Fraccion(4,3);
	      Fraccion z=new Fraccion(1,2);
	      Fraccion resultado=Fraccion.multiplicar(Fraccion.sumar(x,y),z);
	      System.out.println("(x+y)*z= "+resultado);
	 //Simplificar una fracción
	      System.out.println(resultado.simplificar());
		
	       * 
	       */
	

	}

}