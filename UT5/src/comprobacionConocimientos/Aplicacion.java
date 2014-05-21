package comprobacionConocimientos;

// file:///C:/Users/Arturo/Desktop/DAW/Sincronizable/Programaci%C3%B3n/enunciado%20Aplicacion.htm

class Cerebro{
	
	public Cerebro(){
		System.out.println("Pensando...");
	}
	
}

class Persona{
	private Cerebro cerebro;
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona(){
		System.out.println("Constructor ejecutandose!!");
	}
	
	public Persona(String nombre){
		this.nombre = nombre;
		
		Cerebro cabeza;
		cabeza = new Cerebro();
	}
	
	public void escribeNombre(){
		System.out.println("Mi nombre es: " + nombre);
	}
	
}

public class Aplicacion {
	

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		
		Persona Arturo;
		Arturo = new Persona("Arturo");
		
		String nombre = Arturo.getNombre();
		nombre = nombre + " Díaz";
		Arturo.setNombre(nombre);
		
		Arturo.escribeNombre();
		

	}

}
