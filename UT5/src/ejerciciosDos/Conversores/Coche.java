package ejerciciosDos.Conversores;

/*
 * Ejercicio 2. Crea la clase Coche con dos constructores. Uno no toma parámetros y el otro sí. 
 * Los dos constructores inicializarán los atributos marca y modelo de la clase. 
 * Crea dos objetos (cada objeto llama a un constructor distinto) y verifica que todo funciona correctamente.
 */

public class Coche {
	
	//Los atributos se ponen privador para que no se puedan cambiar desde las otras clases
	//de esta manera solo se ponen con el set, en el que se pueden poner restricciones
	private String marca;
	private String modelo;
	public static int cantidadCoches = 0;
	
	//Constructor normal
	public Coche(){
		this.marca = "Toyota";
		this.modelo = "i30";
		cantidadCoches++;
	}
	
	//Constructor sobrecargado Coche
	//el this. hace que coja el atributo de la clase, no el creado en el metodo constructor
	public Coche (String marca, String modelo){
		this.marca = marca;
		this.modelo = modelo;
		cantidadCoches++;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public String setMarca(String m) {
		return marca;
	}
	
	public String setModelo(String m) {
		return modelo;
	}
	public String getModelo() {
		return modelo;
	}

	
	
	
	
	

}
