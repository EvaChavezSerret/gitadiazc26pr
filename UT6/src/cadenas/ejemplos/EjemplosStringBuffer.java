package cadenas.ejemplos;

public class EjemplosStringBuffer {
	
	public static void main(String[] args) {
		StringBuilder nombre;
		
		nombre = new StringBuilder("Angel");
		
		nombre.append(" Cañadas");
		
		nombre.insert(5, " Martinez");
		
		System.out.println(nombre);
		
		nombre.delete(nombre.indexOf(" C"),nombre.length());
		System.out.println(nombre);
		
		String aux = new String(nombre);
		
	}

}
