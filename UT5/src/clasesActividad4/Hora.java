package clasesActividad4;

/*
 * Ejercicio 1 Escribe una clase llamada Hora que tenga como atributos la hora, los minutos y 
 * los segundos (números enteros). Un constructor inicializará estos datos a 0 y otro los inicializará 
 * a valores pasados por parámetro. Un método de la clase devolverá la cadena con formato: 12:45:32. 
 * Otro método, que tendrá un argumento de tipo Hora, sumará dicha hora a la propia. Por ejemplo:

[...]
mihora=new Hora(12,45,32);
unahoraycuarto=new Hora(1,15,0);
mihora.suma(unahoraycuarto);
System.out.println(mihora.aCadena());
[...]

14:00:32
Para probar la clase crea un main() con dos objetos inicializados a una hora determinada. Crea otro sin inicializar y súmale las dos anteriores. Visualiza el valor de las dos horas y el resultante.
 */

public class Hora {
	
	private int hora;
	private int minutos;
	private int segundos;
	
	@Override //12:45:32.
	public String toString() {
		return  hora + ":" + minutos + ":" + segundos + ".";
	}
	
	public void suma(Hora watch){
		this.hora+=watch.hora;
		this.minutos+=watch.minutos;
		this.segundos+=watch.segundos;
	}

	public Hora(){
		this.hora = 0;
		this.minutos = 0;
		this.segundos = 0;
	}
	
	public Hora(int hora, int minutos, int segundos){
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public static void main(String[] args) {

		Hora reloj = new Hora(12,45,32);
		System.out.println(reloj.toString());
		
		Hora reloj2 = new Hora(03,45,32);
		reloj.suma(reloj2);
		System.out.println(reloj.toString());
		
		System.out.println("HABRÍA QUE HACER EL CAMBIO DE CENTE A SEXA");

	}

}
