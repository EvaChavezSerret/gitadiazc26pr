package ejemplos_UT5;

public class Libro {
	//Atributos
	private String nombre;
	private String autor;
	private String isbn;
	
	//Constructor
	public Libro(String nombre, String autor, String isbn){
		this.nombre = nombre;
		this.autor = autor;
		this.isbn = isbn;
	}

	//Getters y Setters automáticos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	//toString automático y editado un poco
	@Override
	public String toString() {
		return "Libro " + nombre + ", " + autor + ", "
				+ isbn;
	}
	
	
	
	
	
}
