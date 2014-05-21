package ejerciciosDos.Conversores;

public class EjemploPersona {
	
	private String nombre;
	private String dni;
	
	//Constructor EjemploPersona
	
	public EjemploPersona (String nombre, String dni){
		this.nombre = nombre;
		this.dni = dni;
	}
	
	//Método imprime
	public void imprime(){
		System.out.println(nombre + " (" + dni + ")");
	}

	public static void main(String[] args) {
		EjemploPersona pepe;
		
		pepe = new EjemploPersona("Pepe", "250205");
		pepe.imprime();

	}

}
