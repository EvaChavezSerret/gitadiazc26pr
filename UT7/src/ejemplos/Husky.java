package ejemplos;

public class Husky extends Perro{
	
	public String nombrecientifico;
	public String nombrecomun;

	public void cerrarVentana(){
		System.out.println("Znnnnn");
	}

	@Override
	public void ladrar() {
		super.ladrar();
		System.out.println("Auuuu");
	}

	
}
