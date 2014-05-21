package interfaces.ejercicio1;

public class PruebaPersona {

	public static void main(String[] args) {
		
		Persona c = new Cliente();
		c.pedirDatos();
		c.visualizarDatos();
		
		Persona e = new Empleado();
		e.pedirDatos();
		e.visualizarDatos();
		

	}

}
