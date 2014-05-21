package clasesActividad4;

/*
 * Ejercicio 1 Escribe una clase llamada Hora que tenga como atributos la hora, los minutos y 
 * los segundos (n�meros enteros). Un constructor inicializar� estos datos a 0 y otro los inicializar� 
 * a valores pasados por par�metro. Un m�todo de la clase devolver� la cadena con formato: 12:45:32. 
 * Otro m�todo, que tendr� un argumento de tipo Hora, sumar� dicha hora a la propia. Por ejemplo:

[...]
mihora=new Hora(12,45,32);
unahoraycuarto=new Hora(1,15,0);
mihora.suma(unahoraycuarto);
System.out.println(mihora.aCadena());
[...]

14:00:32
Para probar la clase crea un main() con dos objetos inicializados a una hora determinada. Crea otro sin inicializar y s�male las dos anteriores. Visualiza el valor de las dos horas y el resultante.
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
		
		System.out.println("HABR�A QUE HACER EL CAMBIO DE CENTE A SEXA");

	}

}
