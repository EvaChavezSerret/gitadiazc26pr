package cadenas.ejemplos;

public class EjemplosString {

	public static void main(String[] args) {
		String cadena = "cadena";
		
		cadena = new String("otra cadena");
		
		cadena = cadena+"hola cadena";
		
		if(cadena.equals("otra cadena hola cadena")){
			System.out.println("Cadenas iguales");
		}

		System.out.println(cadena.toUpperCase());
		System.out.println(cadena);
		
		String nombre1 = "Angel", nombre2= "Alberto";
		
		System.out.println(nombre1.compareTo(nombre2));
		System.out.println(nombre2.compareTo(nombre1));
		
		System.out.println("2".compareTo("12"));
		
		System.out.println(cadena.concat("cadena"));
		
		System.out.println(String.valueOf(0.7f));
		
		String numeroCadena = String.valueOf(0.7f);
		float  f=Float.valueOf("2.45");
		System.out.println(numeroCadena);
		
		System.out.println(cadena.substring(11,16));
		System.out.println(cadena.substring(11,cadena.length()));

		
	}

}
