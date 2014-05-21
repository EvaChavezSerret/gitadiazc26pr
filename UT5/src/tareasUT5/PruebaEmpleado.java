package tareasUT5;

public class PruebaEmpleado {

	public static void main(String[] args) {
	
		Empleado emple1 = new Empleado();
		
		emple1.setNombre("Arturo");
		emple1.setApellido1("Díaz");
		emple1.setApellido2("Calvo");
		emple1.setDNI("2151422F");
		emple1.setSueldoBase(4000);
		
		emple1.calculaSueldo(200, 100);
		System.out.println(emple1.getNombre()+" cobra "+emple1.getSueldo());
		

	}

}
