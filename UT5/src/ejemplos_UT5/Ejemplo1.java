package ejemplos_UT5;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona angel, manolo;
		
		angel = new Persona();
		angel.nombre = "Angel";
		angel.edad = 21;
	
		//System.out.println(angel.nombre);
		
		angel.imprimirNombre();
		
		manolo = new Persona();
		manolo.nombre = "Manolo";
		manolo.edad = angel.edad;
		
		//System.out.println(manolo.nombre + manolo.edad);
		
		manolo.imprimirNombre();

	}

}
