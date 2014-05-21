package tareasUT5;

public class Empleado {
	
	private String nombre = "";
	private String apellido1 = "";
	private String apellido2 = "";
	private String DNI = "";
	private double sueldoBase = 0;
	private double sueldo = 0;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public double getSueldo() {
		return sueldo;
	}

		
	public double calculaSueldo(double horasExtra, double precioHora) {
		sueldo = sueldoBase+horasExtra*precioHora;
		return sueldo;
	}
	
}
