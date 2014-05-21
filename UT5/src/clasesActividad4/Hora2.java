package clasesActividad4;

/*
 * Ejercicio 2 Añade los métodos tick, incrementarMinuto e incrementarHora que incrementan 
 * la hora en 1 segundo, 1 minuto y 1 hora respectivamente. Crea un programa que prueba el 
 * funcionamiento de estos métodos. Has de asegurarte de que funcionan bien los siguientes casos:
 * a. incremento al siguiente minuto, b. incremento a la siguiente hora, c. incremento al siguiente día.
 */

public class Hora2 {
	
	private int hora;
	private int minutos;
	private int segundos;
	
	@Override //12:45:32.
	public String toString() {
		return  hora + ":" + minutos + ":" + segundos + ".";
	}
	
	public void suma(Hora2 watch){
		this.hora+=watch.hora;
		this.minutos+=watch.minutos;
		this.segundos+=watch.segundos;
	}
	
	public void tick(){
		this.segundos += 1;
	}
	
	public void incrementarMinuto(){
		this.minutos += 1;
	}
	
	public void incrementarHora(){
		this.hora += 1;
	}

	public Hora2(){
		this.hora = 0;
		this.minutos = 0;
		this.segundos = 0;
	}
	
	public Hora2(int hora, int minutos, int segundos){
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}


	public static void main(String[] args) {

		Hora2 reloj = new Hora2(12,45,32);
		System.out.println(reloj.toString());
		
		Hora2 reloj2 = new Hora2(03,45,32);
		reloj.suma(reloj2);
		System.out.println(reloj.toString());
		
		System.out.println("HABRÍA QUE HACER EL CAMBIO DE CENTE A SEXA");
		
		System.out.println("Hora del reloj"+reloj2.toString());
		reloj2.tick();
		System.out.println("Después del tick"+reloj2.toString());
		reloj2.incrementarMinuto();
		System.out.println("Después del minuto"+reloj2.toString());
		reloj2.incrementarHora();
		System.out.println("Después del hora"+reloj2.toString());
		

	}

}