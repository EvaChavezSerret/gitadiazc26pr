package ejercicios_iniciales;

public class Coche {
	// Atributos
	private int velocidad;

	// Constructores
	Coche() {velocidad=0;}

	// M�todos
	public int getVelocidad(){
		return velocidad;
	}
	public void acelera(int mas){
		velocidad=velocidad+mas;
	}
	public void frena(int menos){
		velocidad=velocidad-menos;
	}
}